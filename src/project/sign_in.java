package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class sign_in {
    @Test



   public  void signin() throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavana.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();



         driver.get("https://mobileworld.banyanpro.com/");
          driver.manage().window().maximize();
          Main_Page landingpage = new Main_Page(driver);
          Thread.sleep(1000);
//          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        //  WebDriverWait wait = new WebDriverWait(driver,30);
          landingpage.signinapplication("kavana","kavana123");
         
    }



}