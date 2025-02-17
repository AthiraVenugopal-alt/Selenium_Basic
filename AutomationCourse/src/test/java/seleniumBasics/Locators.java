package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void locators()
	{
		driver.navigate().to("https://selenium.qabible.in/");
		WebElement messageField=driver.findElement(By.id("single-input-field"));//locate id
		WebElement messageField1= driver.findElement(By.className("form-control"));//locate using class
		WebElement showMessageBox= driver.findElement(By.tagName("button"));//locate using tagname
		WebElement headName=driver.findElement(By.name("viewport"));//locate using name 
		WebElement linkName=driver.findElement(By.linkText("Checkbox Demo"));//locate using linktext
		WebElement linkNamePartial=driver.findElement(By.partialLinkText("Checkbox"));//
		
		WebElement cssLocator=driver.findElement(By.cssSelector("button[id='button-one']"));
		
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement button1=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement button2=driver.findElement(By.xpath("//input[@id='value-b']"));
		
		driver.findElement(By.xpath("//input[contains(@id,'-b')]"));//for lengthly ATTRIBUTE
		driver.findElement(By.xpath("//button[text()='Show Message']"));//for text locating
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));//for partial text locating
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		driver.findElement(By.xpath("//button[@id='button-one'or @id='button-one-electronics'] "));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']   "));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card'] // child::button(@id='button-one']  "));
		driver.findElement(By.xpath("//button[@id='button-one']//following::divclass='card'] "));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div class='card'] "));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div "));
		
		
	}

	public static void main(String[] args) 
	{
		Locators locator=new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();
		
	}

}
