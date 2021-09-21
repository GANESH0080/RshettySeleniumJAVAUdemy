package AlphaPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JExample {

	private static Logger log = LogManager.getLogger(Log4JExample.class.getName());

	public static void main(String[] args) {
		log.debug("I m debugging");
	    log.info("Pass");

		log.error("Fail");
	}
}
