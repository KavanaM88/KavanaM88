
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Home_Page{
    
    
    @Test
     public void homepage() throws InterruptedException {
           
         System.setProperty("webdriver.chrome.driver","C:\\Users\\kavana.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://mobileworld.banyanpro.com/");
         driver.manage().window().maximize();
         
    
        Main_Page mainpage3 = new Main_Page (driver);    
      mainpage3.homepage();
      
  
      mainpage3.latestdrop();
      
      mainpage3.allmobile();
      
      mainpage3.homesupport();
      
      mainpage3.below();
      





  
     }    
    
}    
