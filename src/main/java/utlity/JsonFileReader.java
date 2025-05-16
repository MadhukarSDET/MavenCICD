package utlity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReader {
	Object obj;

	public JSONObject getJsonData() {

		File file = new File("C:\\Users\\madhu\\Downloads\\selenium-pom-framework\\utils\\Testdata.json");
		try {
			String json = FileUtils.readFileToString(file, "UTF-8");
			try {
				obj = new JSONParser().parse(json);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONObject json = (JSONObject) obj;
		
		return json;

	}
	
	public String getValue(String key) {
		
		String data = (String) getJsonData().get(key);
		return data;

	}
	
	
}
