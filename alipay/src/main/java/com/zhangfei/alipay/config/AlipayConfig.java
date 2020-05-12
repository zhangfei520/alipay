package com.zhangfei.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102400751315";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCEgYrRv7msYhIdIUBCk7MGf1kYsW5ZeGacTSWFiymCj9/qJjUnvfjtonVy35GBP+a+5x8wEr/qQDD/nejaqLzRTzPhyi5lmCOLRGfLTLCgvtT/ShOhFh0adgkpAyDdCKGYEU/fr6Op7K2bjoZaXGrwmB+jbbh2o5OWLO9okfpighb4yTFWfadexr9uZsCL2OqNRbatqYYmqJRcupOnRGP7HrjGLhGLkclxH1VcZJKEwtjuyaNa9F6ZJk9BoameuvKOL1sNl/sIQnDV3dJV/iXZ3LuWSuxcs1gjtHi4SBDynITCShqTAd8zUcs1XVaoQoKwQd1kV20Cs0APaIJSgxPzAgMBAAECggEAXDZqjR2H8Vcuk+cX+T0gUV0+e9i+mrUXc56chhsagCnwAdslEss5+OYeJhs//1qhEil1otbph/O0Ja+W5NSY0nD0AiXZtAn0cm7gbLKqGLO1NxQuJORmzItoRIpQzIG9Mz6Y/2oT06VKC/9bsHawVU8IdYtd2/JqOxB6a6NrRDGOKguw+/+UZ6MTvNL1KaXaDgDNqfPuR7ZXpslPItoXNI86r+PVi+pX/uX1pggVHBcy0ZBC5VjFUvRpet09ud6cUavivJMCAA4EVvolxQW5J0FHiOZWv/XeLSDmFjqxSOv6MXBhEEESssqRBq1D6HbcNwHckgx8m8ipQTbG8ZY1gQKBgQDi4gsO/F0rtAfi1Y39PW05hPeNzYCrzCDpUjHQ6aPeUpPH+PYnjhQKHlZjZWDeXi2/1oexBTLalpDVupDB29lM1TfXvFke1vn4HqoEfRfZLGO8Ufr0RbMaWOSPOPz+7N7s2xauEH3vv+txsrIB9UspHxykS+CEy4ZLoL88d6ksawKBgQCVgtyyc7gfe43OoeE9Gyr2qFQcgu3Y5XAvy3AqLVehdja0RoN1Jn1SPl1rI7UDeS6tXWSh+DMQXD+MNj7LV32cSoA43QAufC78b+cUqonlgRfrrSGVtr6xAAdw2BCbi1i4eSuvrunxC6+cua/OiZf91tkLimGKRiTjficvFhiYmQKBgQCPxBytykxfvRyiKCBpL9teb1tOh8HZGuhf8K2Qa/xijIEIXkHcnrMkFkU3hq3zOkpTHWWuTlUDHhV42VeQ//aaMSHJmpf+asrK5uNlJL9P5kjstCYJU4FCWMG736ixAPfhrpKYierDWSGgUlNp2j1eOVC06z/B5hWbJqkHb+vLMQKBgBd/+yp9b9pa9D4fSaTuKUGd0aKtna7y2UBZ7KZkfBqf1xdc4fq+8wHDVbGqaiBCouiS/mdK+NPAfCiQuiwB83dmamMFsaqc0FHTUPH5oDUXpmffzaCXmb9+bqz4+RtJusc8HHa/unutx4uN0ClZjS9T3seml5BBWDj9sjD/exw5AoGBAI/OOK9vg9bQK9xb3xu91BJzh3mFZToeruQdaCHVie/KaCeAxIBkv7q3VdNz8MaW+6EMy0c6E02jpYi06/B2peG9pOUWAyC/GBmLeKkDrYD7Smr7uKoxlBFZ+sRwElAr9LlK7K1J1YB7WYC7JwRq2kDp1SCOHHR+LSfaPRaeg8P+";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlnBAGN+Z3Fr3qr8tE0znPbPkZ24uzpaDKpHWCEb6c5dYc4qRRNcIkjkLYT3gAuX6IpJVL9vqMcJFXFcpP/vOg2ejYoCqvfSuh5bR5CKwxIdfq4LERGPfYoCpbvgKekX5LMhfdjBP8w1OsEC7/q1aG6Wce4NvPsX+QN/jhbpW75ES31+y53GmXxD6NmxCawavcCQufxABYh8mnO5nDthmXxCVUSVI796cXCwvf74qz+eUXSuXxSgWYtMHcuvF2nFUwMGD1JYStadEzx2wA4pIJXJv2cVuFzFe6CQdgmmPISHNwDBy6l02At5iZxsS+g3lHYtzDZQZUWgdGGOyQAMcYwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String NOTIFY_URL = "http://localhost:8899/alipay/alipay-callback-notify-url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String RETURN_URL = "http://localhost:8899/alipay/alipay-callback-return-sult";

    // 签名方式
    public static String SIGN_TYPE = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";
    //返回格式类型
    public static String FORMAT = "json";

    // 支付宝网关，这是沙箱的网关
    public static String GATEWAY_URL = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
