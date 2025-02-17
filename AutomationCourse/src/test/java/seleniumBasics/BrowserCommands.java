package seleniumBasics;

public class BrowserCommands extends Base
{
public void browserCommands()
{
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title= driver.getTitle();
	System.out.println(title);
	String handleId=driver.getWindowHandle();
	System.out.println(handleId);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
}


	public static void main(String[] args)
	{
		BrowserCommands browser=new BrowserCommands();
		browser.initializeBrowser();
		browser.browserCommands();
		browser.driverCloseAndQuit();

	}

}
