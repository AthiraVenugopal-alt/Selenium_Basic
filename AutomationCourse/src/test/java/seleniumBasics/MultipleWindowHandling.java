package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base 
{

	public static void main(String[] args) 
	{
		MultipleWindowHandling multiple=new MultipleWindowHandling();
		multiple.initializeBrowser();
		multiple.handlingMultipleWindow();
		//multiple.driverCloseAndQuit();
		

	}
	public void handlingMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindowHandleid=driver.getWindowHandle();
		System.out.println(parentWindowHandleid);
		
		WebElement clickField =driver.findElement(By.xpath("//a[text()='Click Here']")) ;
		clickField.click();
		
		Set<String>handleIds=driver.getWindowHandles();//to get mulitplehandles
		Iterator<String>values=handleIds.iterator();
		while(values.hasNext())
		{
			String currentId=values.next();
			if(!currentId.equals(parentWindowHandleid))
			{
				driver.switchTo().window(currentId);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("athira@gmail.com");
				WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
				submit.click();
				
			}
			
			
			
		}
		
		
		
				
	}

}
