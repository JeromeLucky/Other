package homework.servlet1.web.servlet.json;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import homework.servlet1.model.pojo.Customer;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonArray {
	@Test
			public  void  test1(){
			//����json ����
						    Customer customer0=new Customer(1,"AA","123","����");
							Customer customer1=new Customer(1,"BB","122","����");
							Customer customer2=new Customer(1,"CC","1222","����");
							Customer customer3=new Customer(1,"DD","12222","����");
						List<Customer> cList=new ArrayList<Customer>();
										cList.add(customer1);
										cList.add(customer2);
										cList.add(customer3);
										cList.add(customer0);
		
						JSONArray jArray=JSONArray.fromObject(cList);
						System.out.println(jArray.toString());
			}
	
	@Test
				public void  test2(){
					JSONObject object=new JSONObject();
							Customer customer0=new Customer(1,"AA","123","����");
							Customer customer1=new Customer(1,"BB","122","����");
							Customer customer2=new Customer(1,"CC","1222","����");
							Customer customer3=new Customer(1,"DD","12222","����");
					object.put("one", customer0);
					object.put("two", customer1);
					object.put("three", customer2);
					object.put("four", customer3);
								JSONArray jArray=JSONArray.fromObject(object);
						System.out.println(jArray.toString());
			}
}
