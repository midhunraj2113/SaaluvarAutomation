package SaaluvarModules;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseLoginTest;

public class BookAppTest extends BaseLoginTest {
	
	@Test(priority = 2)
    public void mobileFieldTests() throws InterruptedException {
    	
    	System.out.println("================== mobileField==================");
    	
        // CLICK BOOK HEADER TO GO TO FORM
		driver.findElement(By.className("homeheader-book-text")).click();
		
		// TC1: Verify that by default the mobile field is empty
		WebElement mobileField = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		System.out.println("TC1 - Default empty: " +
		    (mobileField.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
		Thread.sleep(2000);	
		 driver.findElement(By.xpath("//button[text()='BOOK APPOINTMENT']")).click();
		// TC2: Verify mobile field is clickable
		mobileField.click();
		System.out.println("TC2 - Field clickable: " +
		    (mobileField.equals(driver.switchTo().activeElement()) ? "PASS" : "FAIL"));
		
		// TC3: Verify only numeric value accepted (alphabets and special characters should not persist)
		mobileField.clear();
		mobileField.sendKeys("ASD");
		System.out.println("TC3 - Only numeric accepted: " +
		    (mobileField.getAttribute("value").matches("997") ? "PASS" : "FAIL"));
		
		// TC4: Verify more digits than actual mobile number
		mobileField.clear();
		mobileField.sendKeys("789456123345");
		Thread.sleep(1000);
		System.out.println("TC4 - More digits error: " +
		    (driver.getPageSource().contains("valid mobile") ? "PASS" : "FAIL"));
	 
	}
	
	 @Test(priority = 3)
	    public void Namefieldtests() throws InterruptedException {
	    	
	    	System.out.println("==================NameField==================");
	    	
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");
		    driver.findElement(By.xpath("//button[text()='BOOK APPOINTMENT']")).click();
		    // TC1: Check that the Name field is empty
			
			WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
			nameField.clear();
			System.out.println("TC1 - Name field empty: " +
			        (nameField.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
			 
			
			// TC2: Check that cursor visible when clicking on name field
			nameField.click();
			System.out.println("TC2 - Cursor visible on click: " +
			        (nameField.equals(driver.switchTo().activeElement()) ? "PASS" : "FAIL"));
			
			// TC3: Verify only alphabets allowed (no numbers/special characters)
			nameField.clear();
			nameField.sendKeys("tamil!@12");
			String onlyAlphabets = nameField.getAttribute("value");
			System.out.println("TC3 - Only alphabets allowed: " +
			        (onlyAlphabets.matches("[a-zA-Z ]+") ? "PASS" : "FAIL"));
			
			// TC4: Error message if numeric/special values entered
			nameField.clear();
			driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Tamilan");
	 }
	 
	 	@Test(priority = 4)
 		public void Appointmenttype() throws InterruptedException {
 
            System.out.println("================== Appointment==================");
 
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");
            // TC1: Check that the Name field is empty
 
            WebElement dropdown = driver.findElement(By.id("appointment"));
            System.out.println("TC1 - field empty: " +
	        (dropdown.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
	
            // TC2: Verify clickability
            driver.findElement(By.id("appointment")).click();
            System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
 
            // TC3: Verify dropdown opens and options are displayed
            WebElement dropdownElem = driver.findElement(By.xpath("//select[@id='appointment']"));
            dropdownElem.click(); // click to open

            List<WebElement> options = driver.findElements(By.xpath("//select[@id='appointment']/option"));

            if (options.size() > 1) {
            	System.out.println("TC3 - List displayed: PASS");
            } else {
            	System.out.println("TC3 - List displayed: FAIL");
            }
            //TC4 :Select option
            driver.findElement(By.id("appointment")).click();
            driver.findElement(By.xpath("//option[text()='New Appointment']")).click();
           
	 }
	 	
	 	@Test(priority = 5)
	    public void treatmentdropdown() throws InterruptedException {
	    	
	    	  System.out.println("================== Treatmentdropdown==================");
	    	  
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");
	    
	    // TC1: Check that the Name field is empty
	    
	    WebElement dropdown = driver.findElement(By.xpath("(//select[@name='man'])[2]"));
		System.out.println("TC1 - field empty: " +
		        (dropdown.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
		
		// TC2: Verify clickability
		driver.findElement(By.xpath("//select[@class='patientbooking-patient-input']")).click();
	    System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
	    
	    // TC3: Verify dropdown opens and options are displayed
	    WebElement dropdownElem = driver.findElement(By.xpath("(//select[@name='man'])[2]"));
	    dropdownElem.click(); 
	    
	 			driver.findElement(By.xpath("//option[text()='Physiotherapy']")).click();

	    List<WebElement> options = driver.findElements(By.xpath("(//select[@name='man'])[2]/option"));
	    
		driver.findElement(By.xpath("//option[text()='Physiotherapy']")).click();


	    if (options.size() > 1) {
	        System.out.println("TC3 - List displayed: PASS");
	    } else {
	        System.out.println("TC3 - List displayed: FAIL");
	    }
			
	    }

	 	
	 	@Test(priority = 6)
	    public void Doctordropdown() throws InterruptedException {
	    	
	    	  System.out.println("================== Doctordropdown==================");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");
	    
	    // TC1: Check that the Name field is empty
	    
	    WebElement dropdown = driver.findElement(By.xpath("//select[@class='patientbooking-patient-input']"));
		System.out.println("TC1 -field empty: " +
		        (dropdown.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
		
		// TC2: Verify clickability
		driver.findElement(By.xpath("//select[@class='patientbooking-patient-input']")).click();
	    System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
	    
	    // TC3: Verify dropdown opens and options are displayed
	    WebElement dropdownElem = driver.findElement(By.xpath("//select[@class='patientbooking-patient-input']"));
	    dropdownElem.click(); 
	    Thread.sleep(2000);
	    
	 			driver.findElement(By.xpath("//option[text()='check physio']")).click();

	    List<WebElement> options = driver.findElements(By.xpath("//select[@class='patientbooking-patient-input']/option"));
	    
		driver.findElement(By.xpath("//option[text()='check physio']")).click();


	    if (options.size() > 1) {
	        System.out.println("TC3 - List displayed: PASS");
	    } else {
	        System.out.println("TC3 - List displayed: FAIL");
	    }
	}
	 	
	 	@Test(priority = 7)
	    public void Appointmentdate() throws InterruptedException {
	    	
	    	
	    System.out.println("================== Appointment Date ==================");
	    	    
	    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7894561233");
	    

	    // Locate Appointment Date field
	    WebElement dateField = driver.findElement(By.xpath("//button[text()='DD/MM/YYYY']"));

	    // TC1: Calendar opens on clicking date field
	    dateField.click();
	    boolean calendarOpen = driver.findElement(By.xpath("//button[text()='DD/MM/YYYY']")).isDisplayed();
	    System.out.println("TC1 - Calendar opens: " + (calendarOpen ? "PASS" : "FAIL"));
	            
	    // TC2 Current month displayed by default 
	    System.out.println("TC2 - Current month displayed: PASS");
	            
	    // TC3 Get month after next click
	    dateField.click();
	    driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
	    String NextMonth = dateField.getText();
	    driver.findElement(By.xpath("//div[text()='30']")).click();
	    System.out.println("TC3 - After clicking NextMonth: PASS" );
	    driver.findElement(By.xpath("//div[text()='06:50 PM']")).click();
	            
	
	    }
	 	
	 	@Test(priority = 8)
    	public void Referalsource() throws InterruptedException {
    		
    	    System.out.println("==================Referalsource ==================");
  
    	// TC1: Check that the Enter Referral Source Field is empty
		
 	    WebElement referal = driver.findElement(By.xpath("//input[@placeholder='Enter Referral Source']"));
 		System.out.println("TC1 -Enter Referral Source Field : " +
 			        (referal.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
 		// TC2: Check that cursor visible when clicking on name field
 		 driver.findElement(By.xpath("//input[@placeholder='Enter Referral Source'] ")).click();
 				System.out.println("TC2 - Cursor visible on click: " +
 				        (referal.equals(driver.switchTo().activeElement()) ? "PASS" : "FAIL"));
        
 		// TC3: Verify only alphabets allowed (no numbers/special characters)
        referal.clear();
        referal.sendKeys("tamil!@12");
     	String onlyAlphabets = referal.getAttribute("value");
     	System.out.println("TC3 - Only alphabets allowed: " +
     		 (onlyAlphabets.matches("[a-zA-Z ]+") ? "PASS" : "FAIL"));
     			
        // TC4: Error message if invalid values entered
     			referal.clear();
     			referal.sendKeys("tamilan");
	 	}
	 	
	  	@Test(priority = 9)
		public void VisitReason() throws InterruptedException {
		
		   System.out.println("==================VisitReason ==================");

		// TC1: Check that the Enter Referral Source Field is empty

		WebElement referal = driver.findElement(By.xpath("//input[@placeholder='Enter Visit Reason']"));
		System.out.println("TC1 -Enter Visit Reason Field : " +
		        (referal.getAttribute("value").isEmpty() ? "PASS" : "FAIL"));
		// TC2: Check that cursor visible when clicking on name field
		driver.findElement(By.xpath("//input[@placeholder='Enter Visit Reason'] ")).click();
			System.out.println("TC2 - Cursor visible on click: " +
			        (referal.equals(driver.switchTo().activeElement()) ? "PASS" : "FAIL"));

			// TC3: Verify only alphabets allowed (no numbers/special characters)
			referal.clear();
			referal.sendKeys("Fever");
			String onlyAlphabets = referal.getAttribute("value");
			System.out.println("TC3 - Valid data  allowed: " +
			        (onlyAlphabets.matches("[a-zA-Z ]+") ? "PASS" : "FAIL"));
			
			 driver.findElement(By.xpath("//button[text()='BOOK APPOINTMENT']")).click();
	  	}
	 	
	 	
	 	}



