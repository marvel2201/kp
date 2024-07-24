package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class AutoIT {

		public WebDriver driver;

		@Test
		public void operation() throws Exception {

			
			
			
			
			
			  WebElement ele1 =
			  driver.findElement(By.xpath("//input[@id='uploadPicture']"));
			  
			  ele1.sendKeys("C:\\Users\\HP\\Desktop\\login.png");
			  
			  Thread.sleep(2000);
			 
			 
			 
		
			
		
				
			/*
			 * driver.findElement(By.id("uploadPicture")).click();
			 * 
			 * //Auto it command.
			 * Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\kp.exe");
			 */

			 
		}

		@BeforeTest
		public void beforeTest() throws Exception {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		
			driver.get("https://demoqa.com/automation-practice-form");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.manage().window().maximize();

		}

		@AfterTest
		public void afterTest() {

		}

	}
