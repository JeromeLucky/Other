package com.jerome.pay.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/close")
public class CloseTradeServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//获得初始化的AlipayClient
			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
			
			//设置请求参数
			AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();
			//商户订单号，商户网站订单系统中唯一订单号
			String out_trade_no = new String(req.getParameter("WIDTCout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
			//支付宝交易号
			String trade_no = new String(req.getParameter("WIDTCtrade_no").getBytes("ISO-8859-1"),"UTF-8");
			//请二选一设置
			
			alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," +"\"trade_no\":\""+ trade_no +"\"}");
			
			//请求
			String result=null;
			try {
				result = alipayClient.execute(alipayRequest).getBody();
			} catch (AlipayApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//输出
			resp.getWriter().println(result);
		}
		
}
