package MiniProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HumanResource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//setting for the webdriverr
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2278359\\eclipse-workspace\\INTQEA23QE008\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//screen maximized
		driver.manage().window().maximize();
		
		
		 //driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		 
		 
		 
		 Thread.sleep(3000);
		 //navigate to google 
		 driver.get("https://google.com/");

		

	        driver.findElement(By.name("q")).sendKeys("Orange HRM demo");

	        //driver.findElement(By.name("btnK")).click();
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

	        //Search result displayed

	       

	        //navigate back to google.com

	       driver.navigate().back();

	        String pagetitle = driver.getTitle();

	 

	        

	        
	        

	        //go forward to google result

	        driver.navigate().forward();

	       

	        

	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	        Thread.sleep(3000);

	        //enter username

	        driver.findElement(By.name("username")).sendKeys("Admin");

	        Thread.sleep(3000);

	        //enter password

	        driver.findElement(By.name("password")).sendKeys("admin123");

	        
	        Thread.sleep(3000);
	        //click login button

	        driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	        
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	        
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
	        
	        
	        
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
	        
	        
	        Thread.sleep(3000);
	        
	       WebElement jobTitlesTable = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]"));
	       Boolean jobTitleExists = false;
	       for(WebElement row : jobTitlesTable.findElements(By.xpath("//div[@class='oxd-table']"))) {
	    	   if(row.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/h6")).getText().equals("Automation Tester")) {
	    		   jobTitleExists = true;
	    		   break;
	    	   }
	       }
	       
	       
	       if(!jobTitleExists) {
	    	   
	    	   //add button
	    	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	    	   
	    	   Thread.sleep(3000);
	    	   
	    	   //job name inserting
	    	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Automation Tester");
	    	   
	    	   Thread.sleep(3000);
	    	   //click the save button
	    	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
	    	   
	    	  
	    	   
	    	   
	    	   
	       }
	       
	       Thread.sleep(3000);
	       //click on bharthvs
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	        
	        Thread.sleep(3000);
	       //click on logout button
    	   
    	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    	   

    	   Thread.sleep(3000);

	        //driver.close();

	        driver.quit();


	        

		
		

	}

}
