package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirbnbTestScenario2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAirbnbTestScenario2() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1272,678 | ]]
    driver.get("https://www.airbnb.co.in/become-a-host");
    driver.findElement(By.xpath("//*[text() = \"Create a new listing\"]")).click();
    driver.findElement(By.cssSelector("span.t1dqvypu.dir.dir-ltr")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"House\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"A room\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Plot, house, etc. (if applicable)\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Plot, house, etc. (if applicable)\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Plot, house, etc. (if applicable)\"])]")).sendKeys("60 shivlok");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Street address\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Street address\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Street address\"])]")).sendKeys("bedi nagar");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"City / town\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"City / town\"])]")).sendKeys("Jabalpur");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"State/union territory\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"State/union territory\"])]")).sendKeys("Madhya Pradesh");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"PIN code\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"PIN code\"])]")).sendKeys("482001");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Nearby landmark (if applicable)\"])]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Nearby landmark (if applicable)\"])]")).clear();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Nearby landmark (if applicable)\"])]")).sendKeys("shivlok height");
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"District/locality (if applicable)\"])]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//div[@id='react-application']/div/div/div/main/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='react-application']/div/div/div/main/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Yes\"])]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--0-ENSUITE-stepper']/button[2]/span/svg")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--0-ENSUITE-stepper']/button[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--0-ENSUITE-stepper']/button[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--1-DEDICATED-stepper']/button[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--1-DEDICATED-stepper']/button[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--2-SHARED-stepper']/button[2]/span/svg/path")).click();
    driver.findElement(By.xpath("//div[@id='stepper-item--2-SHARED-stepper']/button[2]/span/svg")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Flatmates/housemates\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"TV\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Wifi\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Kitchen\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Paid parking on premises\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Free parking on premises\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Washing machine\"]")).click();
    driver.findElement(By.id("l_d_1658")).click();
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Upload from your device\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Upload from your device\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Add more\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Add more\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Add more\"]")).click();
    driver.findElement(By.cssSelector("span.ly1f39g.dir.dir-ltr > svg")).click();
    driver.findElement(By.xpath("//*[text() = \"Cover Photo\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Save & exit\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Checking out (0)\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Currently hosting (0)\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Arriving soon (0)\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Upcoming (0)\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Complete your listings\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    driver.get("https://www.airbnb.co.in/become-a-host");
    driver.findElement(By.xpath("//*[text() = \"Your House listing started on 22 November 2023\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Add more\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Save & exit\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
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

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
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
