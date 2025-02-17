package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base 
{

	public static void main(String[] args)
	{
		HandlingFrames frames=new HandlingFrames();
		frames.initializeBrowser();
		frames.handlingFrames();
		//frames.driverCloseAndQuit();

	}
	public void handlingFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
		int framescount= iframes.size();
		System.out.println(framescount);
		
		WebElement firstFrame =driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(firstFrame);  //switch to first frame 
		WebElement frameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameText.getText()); //print text in the frame 
		driver.switchTo().defaultContent();
		
	}

}
