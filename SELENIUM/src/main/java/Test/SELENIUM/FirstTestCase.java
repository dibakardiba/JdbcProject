package Test.SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// launch chrome web browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hazra\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// launch google web page
		driver.navigate().to("https:\\www.google.com");
		// capture title of webpage and print

		String title = driver.getTitle();
		System.out.println("print the title is :: " + title);

		// capture url of the web page

		System.out.println("current url is ::::" + driver.getCurrentUrl());
		// capture page source

		System.out.println("create page ::" + driver.getPageSource());
		//driver.close();

	}

}
