package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public WebDriver driver;//declares a webdriver variable to control the browser
	public void initializeBrowser()// Method to initialize the browser
{
		//driver=newChromeDriver();
		//driver=new FirefoxDriver();
	driver=new EdgeDriver();
	driver.get("https://selenium.qabible.in/");//opened the specified url
	driver.manage().window().maximize();//to maximise the screen
	
}
	public void driverCloseAndQuit()//method creation
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) //main method 
	{
		Base base=new Base();//object creation to call method
		base.initializeBrowser();
		base.driverCloseAndQuit();

	}

}
