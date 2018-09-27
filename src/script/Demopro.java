package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//Demo program for taking input from properties file
public class Demopro {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream("./config.properties"));
		String v = p.getProperty("URL");
		System.out.println(v);
}
}