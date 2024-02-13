package readandwritedemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 // object created
				FileInputStream fr = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\bhu\\properties\\testdata.properties");
			
		 //create object of properties class
				Properties p = new Properties();
				// read from the file
				p.load(fr);
		 // get property method
				System.out.println(p.getProperty("name"));
				//System.out.println(System.getProperty("user.dir"));
			}
	}


