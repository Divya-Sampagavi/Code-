package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public String fetchPropertyData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream("./ConfigFiles/ApplicationConfiguration.properties");
//		FileReader fr = new FileReader(f);
		prop.load(f);
		return (prop.get(key).toString());
		
	}
}

