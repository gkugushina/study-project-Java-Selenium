package kugushina;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;




public class SecondHomework_search_negative extends TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testUntitled() throws Exception {    driver.get(baseUrl + "/php4dvd/");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("img[alt=\"Add movie\"]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Багровый пик");
    driver.findElement(By.name("year")).clear();
    driver.findElement(By.name("year")).sendKeys("2015");
    driver.findElement(By.cssSelector("img[alt=\"Save\"]")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("eg");
    driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
    
    if (driver.findElement(By.xpath(".//div[contains(.,'No movies where found.')]")).isDisplayed()){}
    else {
    	throw new Error("Неверный ожидаемый результат");
    }
    
  
    
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}