package BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLoginTest {
		
	 protected WebDriver driver;
	   protected WebDriverWait wait;

	    @BeforeClass
	    public void setUp() throws InterruptedException {
	        WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--headless");
//	        options.addArguments("--no-sandbox");
//	        options.addArguments("--disable-dev-shm-usage");

	        driver = new ChromeDriver(options);
	        
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://tsitfilemanager.in/vishva/saaluvar-dev/login");
	        
	        driver.findElement(By.xpath("//p[text()='CLINIC']")).click();	        
	        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9003381138");
		  	driver.findElement(By.xpath("//button[text()='SEND OTP']")).click();
		  	 Thread.sleep(2000);
		  	driver.findElement(By.xpath("(//input[contains(@class,'ant-otp-input')])[1]")).sendKeys("9");
		    driver.findElement(By.xpath("(//input[contains(@class,'ant-otp-input')])[2]")).sendKeys("8");
		    driver.findElement(By.xpath("(//input[contains(@class,'ant-otp-input')])[3]")).sendKeys("7");
		    driver.findElement(By.xpath("(//input[contains(@class,'ant-otp-input')])[4]")).sendKeys("6");
		    driver.findElement(By.className("login-signin-button")).click();

	        Thread.sleep(2000);
	    }
//
//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	}
}





