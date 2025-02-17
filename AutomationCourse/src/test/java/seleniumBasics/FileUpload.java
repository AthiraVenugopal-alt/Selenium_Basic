package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base
{

	public static void main(String[] args)
	{
		FileUpload file=new FileUpload();
		file.initializeBrowser();
		try
		{
			
		file.uploadFileUsingRobot();
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
		
		
		//file.uploadFileUsingsendKeys();
		//file.driverCloseAndQuit();

	}
	public void uploadFileUsingsendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Users\\xiaomi\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\New PDF Selenium.pdf");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='terms']"));
		checkBox.click();
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();
		}
	
	
	public void uploadFileUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdf.click();
		StringSelection s=new StringSelection("C:\\Users\\xiaomi\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\New PDF Selenium.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot robot=new Robot();
		robot.delay(2500);//adding delay(time)to allow file dialog to open 
		
		robot.keyPress(KeyEvent.VK_ENTER);//VK-virtual key //keyboard clicking
		
		robot.keyRelease(KeyEvent.VK_ENTER); //keyboard releasing
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);//pasting the copied file
				
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);//press OK to upload file
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}


