package regfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbregs {
	WebDriver driver;
  @Test
  public void f() {
	Select title = new Select(driver.findElement(By.xpath("//*[@id=\"select_1665555058\"]")));
	//title.selectByValue("Mr.");
	title.selectByValue("Mrs.");
	//title.selectByValue("Others");
	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("nazrin");
	WebElement lastname = driver.findElement(By.id("last_name"));
	lastname.sendKeys("zackariya");
	WebElement email = driver.findElement(By.id("user_email"));
	email.sendKeys("nazrinzack@gmail.com");
	WebElement Phonenumber = driver.findElement(By.id("phone_1665556334"));
	Phonenumber.sendKeys("790268641");
	WebElement password = driver.findElement(By.id("user_pass"));
	password.sendKeys("nazrin@123");
	//WebElement male = driver.findElement(By.id("radio_1665556441_Male"));
	//male.click();
	WebElement female = driver.findElement(By.id("radio_1665556441_Female"));
	female.click();
	//WebElement Others = driver.findElement(By.id("radio_1665556441_Other"));
	//Others.click();
	WebElement streetaddress = driver.findElement(By.id("input_box_1665556705"));
	streetaddress.sendKeys("Panayappilly");
	WebElement streetaddress2 = driver.findElement(By.id("input_box_1665556759904"));
	streetaddress2.sendKeys("liberty");
	WebElement city = driver.findElement(By.id("input_box_1665556812"));
	city.sendKeys("ernakulam");
	WebElement postalcode = driver.findElement(By.id("input_box_1665556897185"));
	postalcode.sendKeys("682002");
	WebElement state = driver.findElement(By.id("input_box_1665556852223"));
	state.sendKeys("kerala");
	WebElement country = driver.findElement(By.id("billing_country"));
	country.click();
	WebElement txtarea = driver.findElement(By.id("textarea_1665557189"));
	txtarea.sendKeys("haiiiiiiiii");
	//WebElement yes = driver.findElement(By.id("radio_1665557290_Yes"));
	//yes.click();
	WebElement No = driver.findElement(By.id("radio_1665557290_No"));
	No.click();
	WebElement privacy = driver.findElement(By.id("privacy_policy_1665557351"));
	privacy.click();
	
	
  }
  
  @BeforeTest
  public void beforeTest1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/new-customer-registration-form/");
	  driver.manage().window().maximize();
  }
	
  @AfterTest
  public void afterTest1() 
  {
	  WebElement button = driver.findElement(By.xpath("//*[@id=\"user-registration-form-783\"]/form/div[8]/button"));
		button.click();  
	  
	
	
  }
  
}

	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
  
