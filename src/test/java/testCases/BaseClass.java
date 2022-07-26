package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	@BeforeSuite
	public void start()
	{
		report= new ExtentReports(System.getProperty("user.dir")+"./target/MyExtentReport.html");
	}
	
	@BeforeTest
	public void involedriver()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		String url = "https://rahulshettyacademy.com/seleniumPractise/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@AfterSuite
	public void end()
	{
		report.flush();
		
	}
}
