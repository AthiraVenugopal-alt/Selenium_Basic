package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{

	public static void main(String[] args) 
	{
		WebElementCommands element=new WebElementCommands ();
		element.initializeBrowser();
		element.webElementCommand();
		element.driverCloseAndQuit();
	}

	
public void  webElementCommand()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	messageField.sendKeys("athira");
	
	WebElement messageButton= driver.findElement(By.xpath("//button[@id='button-one']"));
	messageButton.click();
	messageField.clear();
	
	WebElement yourMessage= driver.findElement(By.xpath("//div[@id='message-one'] "));
	String message1= yourMessage.getText();
	System.out.println(message1);
	
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.print(showMessageButton.getCssValue("background-color"));
	System.out.println(showMessageButton.getSize());
	System.out.println(showMessageButton.getTagName());
	}
	}
