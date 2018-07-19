package chefgrace.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "res/chromedriver"); 

      WebDriver driver = new ChromeDriver();

      driver.get("http://www.baidu.com/");

      WebElement txtbox = driver.findElement(By.name("wd"));

      txtbox.sendKeys("HelloWorld");

      WebElement btn = driver.findElement(By.id("su"));

      btn.click();
      
      driver.close();

  }
}
