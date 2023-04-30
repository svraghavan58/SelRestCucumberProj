package com.test.seleniumframe;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserMethods {
	
	public static WebDriver driver;
	
	public WebDriver openBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
		{
			ChromeOptions c=new ChromeOptions();
			c.addArguments("--RemoteAcceptOrigin");
			driver=new ChromeDriver(c);
			break;
		}
		case "edge":
		{
			EdgeOptions e=new EdgeOptions();
			e.addArguments("--RemoteAcceptOrigin");
			driver=new EdgeDriver(e);
			break;
		}
		}
		
		return driver;
	}
	public WebDriver openIncognitioMode()
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--RemoteAcceptOrigin");
		c.addArguments("--Incognito");
		c.setAcceptInsecureCerts(true);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY,c);
		c.merge(dc);
		driver=new ChromeDriver(c);
		return driver;
	}

	public void openUrl(String url)
	{
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	public String getPgTitle()
	{
		return driver.getTitle();
	}
	public String getPageSource()
	{
		return driver.getPageSource();
	}
	public void closeBrowser()
	{
		driver.close();
	}
	public void quitBrowser()
	{
		driver.quit();
	}
	public void navigateUrl(String url)
	{
		driver.navigate().to(url);
	}
	public void navaiagteBack()
	{
		driver.navigate().back();
	}
	public void navigateForward()
	{
		driver.navigate().forward();
	}
	public void navigateRefresh()
	{
		driver.navigate().refresh();
	}
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	public void minimizeBrowser()
	{
		driver.manage().window().minimize();
	}
	
	
}
