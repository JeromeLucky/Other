package homework.xml.control;

import java.sql.Connection;
import java.sql.SQLException;

import org.w3c.dom.Document;

import homework.common.dbutil.DButil;
import homework.common.parser.InItDocument;
import homework.common.parser.ObjSerialize;
import homework.common.parser.Paser;


public class CreateNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DButil.getConnection();
			try{
				//���������ύģʽ
				conn.setAutoCommit(false);
				//��ȡ������
				Document doc=Paser.getdomParser().newDocument();
//				System.out.print("========="+doc+"=============");
				//��ʼ������
				Document document=InItDocument.DocInit("xml", doc, conn, "project3");
				conn.commit();
				//���г��ļ�
				ObjSerialize.out(document, "./src/com/bwf/jiazhihui/cc.html");
				
			}catch(Exception e){
				e.printStackTrace();
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}finally{
				DButil.DBclose(conn, null, null);
				
			}
	}

}
