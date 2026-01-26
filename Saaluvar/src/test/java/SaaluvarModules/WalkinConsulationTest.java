package SaaluvarModules;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseTest.BaseLoginTest;

public class WalkinConsulationTest extends BaseLoginTest {
	
@Test

public void consulation () throws InterruptedException {
		
	

	driver.findElement(By.xpath("//span[text()='Appointment']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.className("homepage-date-icon")).click();
//	driver.findElement(By.xpath("//div[text()='10']")).click();
//	
//	driver.findElement(By.xpath("(//button[@class='appointment-date-booking'])[2]")).click();
//	driver.findElement(By.xpath("//div[text()='20']")).click();
//	driver.findElement(By.id("doctors")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//option[text()='Durai JP'][1]")).click();
//	driver.findElement(By.name("Education")).click();
//	driver.findElement(By.xpath("//option[text()='Home Care Asset']")).click();
//	Thread.sleep(2000);
//

	driver.findElement(By.xpath("//button[text()='WALK-IN CONSULTATION']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("78945");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("@#ASER");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Tamilan!123@");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Tamilan");
	Thread.sleep(2000);
	
	driver.findElement(By.id("appointment")).click();
    driver.findElement(By.xpath("//option[text()='New Appointment']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//select[@class='patientbooking-patient-input']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//option[text()='Durai JP'])[2]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//select[@name='man'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//option[text()='Home Care Asset'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.className("patientBooking-date-input")).click();
    driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
    driver.findElement(By.xpath("//div[text()='26']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//select[@id='appointment'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//option[text()='Super Inductive System']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@class='patientbooking-patient-input'])[3]")).sendKeys("13:00");
    driver.findElement(By.xpath("//input[@placeholder='Enter Referral Source']")).sendKeys("good12!@");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Referral Source']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Enter Referral Source']")).sendKeys("good");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Visit Reason']")).sendKeys("fever!@#123");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Visit Reason']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Enter Visit Reason']")).sendKeys("fever");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='BOOK WALK-IN CONSULTATION']")).click();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//input[@placeholder='Search Booked Patient']")).sendKeys("tamilan");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='appointmnet-search-icon']")).click();
    driver.quit();	
}
}



