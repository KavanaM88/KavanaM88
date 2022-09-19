import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SIGNUP {
	@Test


	 public  void signup() throws InterruptedException {
        // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\kavana.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
        driver.get("https://mobileworld.banyanpro.com/");
         Main_Page landingpage2 = new Main_Page(driver);
         landingpage2.goTo();
         Thread.sleep(1000);
         landingpage2.signupapplication("kavana","shetty","kavana123@gmail.com","kavana123" ,"01/01/2000","8989674534","Welcome to Qualitest");	// TODO Auto-generated method stub

	}

}
