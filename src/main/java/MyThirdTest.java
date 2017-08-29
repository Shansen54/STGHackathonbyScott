import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class MyThirdTest{
    @Test
    public void startWebDriver()
    {

    System.setProperty("webdriver.gecko.driver","C:\\DRIVERS\\geckodriver.exe");

    WebDriver driver = new FirefoxDriver();

        //noinspection unused
        WebDriverWait wait = new WebDriverWait(driver, 30);


    driver.get("https:\\www.skiutah.com");

    WebElement topNav = driver.findElement(By.linkText("Deals"));

    topNav.click();

    Actions hover;
        hover = new Actions(driver);

        try {
            synchronized (this) {
                wait(2);
            }
            } catch(InterruptedException e){
                e.printStackTrace();
            }


        hover.moveToElement(topNav);
        hover.perform();

        WebElement subNav = driver.findElement(By.linkText("Beginner"));

    hover.moveToElement(subNav).click();

 //   subNav.click();


    Assert.assertTrue("Title will have Beginner in it",
            driver.getTitle().contains("Beginner"));
    driver.close();
    driver.quit();

}

}
