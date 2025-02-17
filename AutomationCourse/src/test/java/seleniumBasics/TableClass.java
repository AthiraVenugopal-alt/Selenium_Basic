package seleniumBasics;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TableClass extends Base
{

	public static void main(String[] args) 
	{
		 TableClass table= new  TableClass();
		 table.initializeBrowser();
		 table.tableHandling();
		 //table.driverCloseAndQuit();

	}
public void tableHandling()
{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
	showMore.click();
	
	WebElement tableField=driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.print(tableField.getText());
	
	WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable'//tbody//tr[2]"));
	System.out.println(tableRow.getText());
}
	
	
	
}

