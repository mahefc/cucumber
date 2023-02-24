package Runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"Steps"})
public class TestRunner {
	
	   	private static WebDriver driver;

	   	private static Properties config;

	    @BeforeClass
	    public static void setUp() throws IOException {
	        config = new Properties();
	        FileInputStream input = new FileInputStream("src/test/resources/config.properties");
	        config.load(input);
	        input.close();
	        driver = new EdgeDriver();
			driver.manage().window().maximize();
	    }
	    
	    public static WebDriver getDriver() {
	        return driver;
	    }
	    
	    public static Properties getConfig() {
	        return config;
	    }
	    
	    public static String getProps(String txt) {
	    	return config.getProperty(txt);
	    }
}
