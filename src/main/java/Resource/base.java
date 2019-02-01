package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

	  public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{

 prop= new Properties();
FileInputStream fis=new FileInputStream("src\\main\\java\\Resource\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "src\\main\\java\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver

}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "src\\main\\java\\Drivers\\geckodriver.exe");
	driver= new FirefoxDriver();
	//firefox code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}




}
