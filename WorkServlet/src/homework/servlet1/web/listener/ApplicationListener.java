package homework.servlet1.web.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ApplicationListener  implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
					System.out.println("---aad-----------"+event.getName()+"----------------"+event.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("---remove-----------"+event.getName()+"----------------"+event.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("---relaced-----------"+event.getName()+"----------------"+event.getValue());
	}

}
