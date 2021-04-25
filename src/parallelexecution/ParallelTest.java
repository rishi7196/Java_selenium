package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void excutesessionOne()
	{
		   //First session of WebDriver
            System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void excutesessiontwo()
	{
		   //First session of WebDriver
            System.setProperty("webdriver.gecko.driver","D:\\Software1\\jars\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
	@Test	
	public void excutesessionthird()
	{
		   //First session of WebDriver
            System.setProperty("webdriver.ie.driver","D:\\Software1\\jars\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
}