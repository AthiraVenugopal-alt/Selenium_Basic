package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base 
{

	public static void main(String[] args)
	{
		Dropdown drop =new Dropdown();
		drop.initializeBrowser();
		drop.handlingDropdown();
		drop.driverCloseAndQuit();
		
		}
	public void handlingDropdown()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1 =driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select =new 	Select(dropdown1);
		select.selectByIndex(2);
		
		WebElement dropdown2 =driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("TestNG");
		
		WebElement dropdown3 =driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("jquery");
		
	}

}
