package mypractics.Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Helloworld {

	private static Logger log = LogManager.getLogger(Helloworld.class.getName());  
	public static void main(String[] args) {


		// basic log4j configurator  
		BasicConfigurator.configure();  
		log.info("this is info message");  

		log.error("this is error message");  
		log.warn("this is warn message");
		log.fatal("this is fatal message");
		System.out.println("\n  completed");

	}

}
