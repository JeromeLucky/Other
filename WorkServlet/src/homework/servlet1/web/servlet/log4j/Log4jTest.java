package homework.servlet1.web.servlet.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Logger logger=Logger.getLogger(Log4jTest.class);
				PropertyConfigurator.configure("src/homework/servlet1/web/servlet/log4j/log4j.properties");
						logger.debug("bug");
						logger.info("info");
						logger.warn("warn");
						logger.error("error");
	}

}
