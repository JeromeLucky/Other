package homework.servlet1.web.servlet.taglib;

public class CountFunc {
				public static int count(String a,String b){
						int x=0,y=0;
						try{
								x=Integer.parseInt(a);
								y=Integer.parseInt(b);
						}catch(Exception e){
							
						}
							return x+y;
				}
}
