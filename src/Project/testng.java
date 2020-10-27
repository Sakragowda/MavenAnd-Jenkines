package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng {
  @Test
  public void f() {
	 System.out.println("hello");
     System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.naukri.com/"); 
  }
}
