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
			//生成json 数组
						    Customer customer0=new Customer(1,"AA","123","李四");
							Customer customer1=new Customer(1,"BB","122","李四");
							Customer customer2=new Customer(1,"CC","1222","李四");
							Customer customer3=new Customer(1,"DD","12222","李四");
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
							Customer customer0=new Customer(1,"AA","123","李四");
							Customer customer1=new Customer(1,"BB","122","李四");
							Customer customer2=new Customer(1,"CC","1222","李四");
							Customer customer3=new Customer(1,"DD","12222","李四");
					object.put("one", customer0);
					object.put("two", customer1);
					object.put("three", customer2);
					object.put("four", customer3);
								JSONArray jArray=JSONArray.fromObject(object);
						System.out.println(jArray.toString());
			}
}
