package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://github.com/gladis-123/mavenrepo");
String title=driver.getTitle();
System.out.println("Title is "+title);
String currenturl=driver.getCurrentUrl();
System.out.println("Current url"+currenturl);
String handleid=driver.getWindowHandle();
System.out.println("Handle id "+handleid);
String pagesource=driver.getPageSource();
System.out.println("Page source is "+pagesource);
driver.close();
	}

}
