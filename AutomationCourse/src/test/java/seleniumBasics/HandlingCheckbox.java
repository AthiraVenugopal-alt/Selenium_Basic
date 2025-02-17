package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckbox extends Base
{

	public static void main(String[] args)
	{
		HandlingCheckbox checkbox = new HandlingCheckbox();
		checkbox.initializeBrowser();
		checkbox.handlingCheckbox();
		//checkbox.driverCloseAndQuit();

	}
public void handlingCheckbox()
{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	
	//locating a singlecheckboxes using a common class attribute
	WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
    checkbox1.click();
    
    //locating multiplecheckboxes using a common class attribute 
    List<WebElement>multiplecheckbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));//to select multiple boxes
    for(WebElement m1:multiplecheckbox)
    {
    	m1.click();
    }
    
   //navigate to simple form demo page 
    driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement showMessageButton =driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.println(showMessageButton.isDisplayed());//to display 
	
	//navigate to radio button demo page 
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement genderRadio =driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	genderRadio.click();
	System.out.println(genderRadio.isSelected());//to select
	
	WebElement showValue=driver.findElement(By.xpath("//button[@id='button-one']"));
	//showValue.isEnabled();
	System.out.println(showValue.isEnabled());
	}

}

