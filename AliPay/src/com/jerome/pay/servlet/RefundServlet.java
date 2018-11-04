package com.jerome.pay.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/refund")
public class RefundServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//获得初始化的AlipayClient
			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
			//设置请求参数
			AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
			
			//商户订单号，商户网站订单系统中唯一订单号
			String out_trade_no = new String(req.getParameter("WIDTRout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
			//支付宝交易号
			String trade_no = new String(req.getParameter("WIDTRtrade_no").getBytes("ISO-8859-1"),"UTF-8");
			//请二选一设置
			//需要退款的金额，该金额不能大于订单金额，必填
			String refund_amount = new String(req.getParameter("WIDTRrefund_amount").getBytes("ISO-8859-1"),"UTF-8");
			//退款的原因说明
			String refund_reason = new String(req.getParameter("WIDTRrefund_reason").getBytes("ISO-8859-1"),"UTF-8");
			//标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
			String out_request_no = new String(req.getParameter("WIDTRout_request_no").getBytes("ISO-8859-1"),"UTF-8");
			
			alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
					+ "\"trade_no\":\""+ trade_no +"\"," 
					+ "\"refund_amount\":\""+ refund_amount +"\"," 
					+ "\"refund_reason\":\""+ refund_reason +"\"," 
					+ "\"out_request_no\":\""+ out_request_no +"\"}");
			
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
