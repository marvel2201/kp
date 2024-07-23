package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Toolsqa {
  
	public WebDriver driver;
	
	@Test
  public void studentregistration() throws Exception  {
	
	
	driver.findElement(By.id("firstName")).sendKeys("sai");
	Thread.sleep(2000);
	
	//last-name
	driver.findElement(By.id("lastName")).sendKeys("prashanth");
	Thread.sleep(2000);
	
	//email
	driver.findElement(By.id("userEmail")).sendKeys("saimarvelfan@gmail.com");
	Thread.sleep(2000);
	
	//gender
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	Thread.sleep(2000);
    
	//number
	driver.findElement(By.id("userNumber")).sendKeys("9866385470");
	Thread.sleep(2000);
    
    //dob
	
	
	
	
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("May");
	  
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1994");
	  
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click(); 
	  Thread.sleep(2000);
	 
	 
	  
	
	  //subjects here xpath n relative xpath are not working so took id by selecting boxtick mark 
	  //on the find locator and then hover over subjects to get id but id is subjectscontainer 
	  //as we know if we have container in id we need to have Input instead of container in id.
	  Thread.sleep(2000);
	  driver.findElement(By.id("subjectsInput")).sendKeys("computer science");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER); 
	  
	  
	  //hobbies
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click(); 
	  Thread.sleep(2000);
	 
  
    //picture
    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Desktop\\login.png");
    Thread.sleep(2000);
    
    //address
    driver.findElement(By.id("currentAddress")).sendKeys("Janapriya Abodes");
    driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB); 
    Thread.sleep(2000);
    
    //state
    //as the state is drop down but not select tag so activeelement to be used.
    driver.switchTo().activeElement().sendKeys("NCR");
 //driver.switchTo().activeElement().sendKeys("Keys.ENTER"); 
 //if we press tab it is r=taking value and going to city thats why enter is not working tab is working
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    driver.switchTo().activeElement().sendKeys(Keys.TAB); 
    driver.switchTo().activeElement().sendKeys("Gurgaon");
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    

	  
	 //submit 
    driver.findElement(By.id("submit")).click();
	 
	}
	




	@BeforeTest
  public void openurl() {
  
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");	
		driver.manage().window().maximize();
	}

 
	
	@AfterTest
  public void afterTest() {
  }

}
