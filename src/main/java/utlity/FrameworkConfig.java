package utlity;

import org.aeonbits.owner.Config;

@Config.Sources("file:C:/Users/madhu/Downloads/selenium-pom-framework/utils/config.properties")
public interface FrameworkConfig extends Config {
	
	String url();
	long timeouts();
	String browser();
}
