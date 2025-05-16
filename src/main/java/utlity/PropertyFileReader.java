package utlity;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyFileReader {
	
	Map<String, String> map=new HashMap<>();

	public Map<String, String> propertyReader() {

		File file = new File("C:\\Users\\madhu\\Downloads\\selenium-pom-framework\\utils\\config.properties");

		try (FileInputStream fis = new FileInputStream(file)) {

			Properties prop = new Properties();
			prop.load(fis);
			
			Map<String, String> map = new HashMap<>();
	        for (String key : prop.stringPropertyNames()) {
	            map.put(key, prop.getProperty(key));
	        }

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println(map);
		
		return map;
		
	}
	
	

}
