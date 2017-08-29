import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MySecondTest {

    private WebDriver.Navigation navigate;

    @Test
    public void startWebDriver(){

        System.setProperty("webdriver.gecko.driver","C:\\DRIVERS\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https:\\www.skiutah.com");
        driver.findElement(By.linkText("Deals")).click();
        driver.getCurrentUrl().contains("Ski and Snowboard");
        Assert.assertTrue("Title will have Utah Ski Resorts in it",
                driver.getTitle().contains("Utah Ski Resorts"));
        driver.close();
        driver.quit();


    }
}
