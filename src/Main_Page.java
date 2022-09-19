
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Main_Page {
    
    WebDriver driver;
    
    public Main_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    



 
    //SignUp
    @FindBy(xpath="//*[text()='SIGN IN']")
    WebElement signin;
    
    @FindBy(css="a[href='signup.html']")
    WebElement signup;
    
    @FindBy(id="myName")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(css="input[placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(css="input[placeholder='Password']")
    WebElement singuppassword;
    
    @FindBy(css="input[type='date']")
    WebElement date;
    
    @FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
    WebElement gender;
    
    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
    WebElement mobile;
    
    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement shortbio;
    
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement register;
    
  //SignIn
    @FindBy(id="username")
    WebElement username;
    
    @FindBy(id="password")
    WebElement signinpassword;
    
    @FindBy(css="a[type='submit']")
    WebElement submit;
    
    //home
    @FindBy(xpath = "//nav[@id='navbar']//li[1]//a[1]")
    WebElement home;
    
    
    //latest
    @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
    WebElement latest;
    
    @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(1)")    
    WebElement samsung;
    
    @FindBy(xpath = "//a[normalize-space()='Lenovo']")
    WebElement lenovo;
    
    @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(4)")
    WebElement apple;
    
    
    //All mob
    @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
    WebElement allmob;
    
    
    //Support
    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement support;
    @FindBy(linkText = "Order")
    WebElement order;
    @FindBy(linkText = "Contact Us")
    WebElement contact;
    
    //Bottom
    @FindBy(className="bottom")
    WebElement bottom;
    
    @FindBy(xpath="//a[normalize-space()='Home']")
    WebElement bottomhome;
    
    @FindBy(xpath="//a[normalize-space()='Mobiles']")
    WebElement bottommobile;
    
    @FindBy(xpath="//footer[@class='footer']//ul//li//a[@href='order.html'][normalize-space()='Order']")
    WebElement bottomorder;
    
    @FindBy(xpath="//a[normalize-space()='Terms & Conditions']")
    WebElement bottomterms;
    
    @FindBy(xpath="//a[normalize-space()='Privacy Policy']")
    WebElement bottomPrivacy;
    
    @FindBy(xpath="//span[@class='footer-title']//a[@href='#'][normalize-space()='Contact Us']")
    WebElement bottomContact;
    
    @FindBy(xpath="//a[normalize-space()='Sign In']")
    WebElement bottomsignin;
    



 
    public void goTo()
    {
        driver.get(" https://mobileworld.banyanpro.com/");
    }



   public void signinapplication(String name,String pwd) throws InterruptedException
    {
        signin.click();
        username.sendKeys(name);
        signinpassword.sendKeys(pwd);
        Thread.sleep(1000);
        submit.click();
    }
    public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio) throws InterruptedException
    {
        signin.click();
        Thread.sleep(1000);
        signup.click();
        Thread.sleep(1000);
        firstname.sendKeys(fname);
        Thread.sleep(1000);
        lastname.sendKeys(lname);
        Thread.sleep(1000);
        email.sendKeys(mail);
        Thread.sleep(1000);
        singuppassword.sendKeys(uppwd);
        Thread.sleep(1000);
        date.sendKeys(dob);
        Thread.sleep(1000);
        gender.click();
        Thread.sleep(1000);
        mobile.sendKeys(phone);
        Thread.sleep(1000);
        shortbio.sendKeys(bio);
        Thread.sleep(1000);
        register.click();
        Thread.sleep(2000);
        
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
    }
    public void homepage() throws InterruptedException {
        
        home.click();
        Thread.sleep(1000);
    }
    
    
    
    
    public void latestdrop() throws InterruptedException {
        
        latest.click();
        Thread.sleep(2000);
        samsung.click();
        Thread.sleep(2000);
        home.click();
        Thread.sleep(2000);
        latest.click();
        Thread.sleep(2000);
        lenovo.click();
        Thread.sleep(2000);
        home.click();
        Thread.sleep(2000);
        latest.click();
        Thread.sleep(2000);
        apple.click();
        Thread.sleep(2000);
        home.click();
        
        
        
        
    }
    
    public void allmobile() throws InterruptedException
    {
        Thread.sleep(2000);
        allmob.click();
        Thread.sleep(2000);
        home.click();
        Thread.sleep(2000);
    }
    
    
    public void homesupport() throws InterruptedException {
        support.click();
        Thread.sleep(1000);
        home.click();
        Thread.sleep(1000);
        order.click();   
        Thread.sleep(1000);
        home.click();
        Thread.sleep(1000);
        contact.click();
        Thread.sleep(1000);
        home.click();
        Thread.sleep(1000);
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,2500)");
        
        
    }
    public void below() throws InterruptedException {
    bottomhome.click();
    Thread.sleep(1000);
    
    bottommobile.click();
    Thread.sleep(1000);
    
    bottomorder.click();
    Thread.sleep(1000);
 
    bottomterms.click();
    Thread.sleep(1000);
    
    bottomPrivacy.click();
    Thread.sleep(1000);
  
    bottomContact.click();
    Thread.sleep(1000);
    
    bottomsignin.click();
    Thread.sleep(1000);

    }
   
}