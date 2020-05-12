package com.zhangfei.alipay.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zhangfei.alipay.config.AlipayConfig;
import com.zhangfei.alipay.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
@Controller
@RequestMapping("alipay")
public class AliPayController {
    @RequestMapping("/test")
    public void alipay(Integer orderId, HttpServletResponse httpResponse) throws IOException {
        //实例化客户端,填入所需参数
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.GATEWAY_URL,
                AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET,
                AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        request.setNotifyUrl(AlipayConfig.NOTIFY_URL);
        request.setReturnUrl(AlipayConfig.RETURN_URL);
        //根据订单编号,查询订单相关信息
        Order order = new Order();
        order.setOrderId(orderId);
        order.setOrderPrice(55.0);
        order.setOrderName("逼痒止痒剂");
//        Order order = payService.selectById(orderId);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = order.getOrderId().toString();
        //付款金额，必填
        String total_amount = order.getOrderPrice().toString();
        //订单名称，必填
        String subject = order.getOrderName();
        //商品描述，可空
        String body = "";
        request.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String form = "";
        try {
            form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + AlipayConfig.CHARSET);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }


    @RequestMapping("/alipay-callback-return-sult")
    public String successResult(HttpServletRequest request, HttpServletResponse response) {
        //可以根据request.getParameterMap()获得到调用接口时传递的一些参数去做后续的业务处理
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] out_trade_nos = parameterMap.get("out_trade_no");
        String id = out_trade_nos[0];
        //跳转到其他页面或重定向到其他方法
        return "redirect:/page/return_url";
    }

    @RequestMapping("/alipay-callback-notify-url")
    public String failResult(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] out_trade_nos = parameterMap.get("out_trade_no");
        String uuid = out_trade_nos[0];
//        orderService.updateOrderInfo(uuid);
        return "redirect:/page/notify_url";
    }
}
