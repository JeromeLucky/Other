package com.jerome.pay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091300502326";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDMxtB9gauAXJNjUXkyj8zrOhrmn1BMcsXkRB/TJ4r+wRoULg64yDKcVD+GKiVMmhxpUqPuuPpWAwnypy1pwMhLaoUgsIlvOtIVd0agxGa2WUDINWR3jEDTTTVA4m8KORMV4uJEj4bCjpC/Ba/GtvYypNutMaa4rBEAvG3EAcKtKwpMAhicu/H6+X8a1uHc+FvbkPYq7U7GLJSi+wuU0ZLWUQjTRNTSmmjwIDarRYIChFd/4T9GlasCTcpYdW55jU3HjltnCpEWmb3iINobHdefQKIFNwr4TAADeP9KDARfQ1bnAErBz+IYPrf+n5MNf619MS4PzAk4gohkFmd6UVJfAgMBAAECggEAcpnNcn/QQB0PKyUcg8xwbTBuf6SnJrGQyEfL27skkZ/1/VctTAJWOKD5kBckGrOgtNzX+7CwANTgi1k+FBIcxgAOExZZQ9OSYQsIjs57gQ+ALsuat0DZwqdR50cRx5HbeYMpCB+e1mE85nrDPZ2FOSCEBHBmErHRLi1F7Mzja09KV4WXMV7zal7oxvbLyfj5XUB/aGvit093ycy9llBAyk1Epwl+adVLTNfJFlt61amGfR8SC3wmy9cHZux3ge5ZGFtBNeseyO0v2ce8yFLkZQK1Nhj1Da66M5pwEon1RulkndKHRT4lnQcJ8T1J302nPyA4/gMWiQC/DRxuNC6m8QKBgQD+brbjayAFYIO61HmhF0wi+pxwl05gHcNSYgsvLoPWxEzA9BPfbMnDlE8pc48/igKVml3CLqGE3pQR/Zgh02eAYKBn1cMo+WKIjxQ5q1INQHVh+1iGUmxJzJbXDJzSGrBSAxtycprcB/gmS5r8GfAixowBIfd4o4yCqQzD+b73iQKBgQDOCcionOU20yl9Zv+AWm3R6Q9KuR1Si44gLRi2GATNLJMcGVw8zJ+QDFfqs4YI1kyyDgOIaTf/hu5qlCuBcRvZUZi8ydWYZoEZOxHGHtiUXiwJx07kiF1WAHbLnhWKnN1fLE8SFxfbG70vWCG1dMn69T6FomJyhqhHyfbVMAEYpwKBgQCBwtVjhu79zwtf7Z1amxcpf8bpZUGDo6pKCdbKaV6z2cmLXvADsufz51+4NEeKkEhhJClNL5sQuLOruTothjPzNVSZoFu4OfgWzWHzR3zBZW54Wkf7uW2g9ca4RqZ0QUhLi2okJG72aNoWLdkNWe0uzzP4H+qmjELNIIpyKJ1MgQKBgE/RsH/J0G6t3XvsY/0oizTv0fHDxx1MXTIP5mvc4DdQFmmjVX1kVEhsz75n7/wKcUnlbe7xvDTs4/48CqKp2/0TxFUW5/2TcF4C6T7UgljwJqVfJiwYu/fuVBdL1dKONKCDPNqoQaCrnV3zCZQPe5QSYDdLElKF4jl1f39ViocvAoGBAIDjWJJfoUdZfTRmG760dma+fsU2R9oBLxsaJhTQzrBRsCSraoJcSmfWurTPOYkxgPlBAtdjJe9QOdrEDB0hSftjE36Zu84OslN2JVd+D182gMWiXWA55yWQD0f1H4fmPtJQq+cI+6zi1ytsOydLwfQOzaYaPA40i5Gr57eGZ26X";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxft9Tm0zxDKtjk7f4uKJam2JYp+TGB2wo55L1+QWGklOegzASF7FmKtoHrumZNpkNseIrws66nH8U+rFX49LE4rYGsuIAat8H114Mb+4yXJNMG6vfz1GIKlZc8mcJpzlag2SzK2FrTbDU/RhHaLg81RG1sYmQWje0p9l84/Mp7e/7D9S+S9yoPicheiymh9r+Qn3t017PtTyPDp2975fgUbgQ6S60kSgJ+ET2UKB3VjcQYDJrj2ZUA6HnHPJo4DRJYP6BA2bGfTdSplewAU8Zg0O3jaGEaDe/Et99XUitlh03mhS8Uo3HU+P8WoW0tyor2kRA9tQygdjcJUqoaYfYwIDAQAB";
    
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/AliPay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/AliPay/back";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
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

