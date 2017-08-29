import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstTest {

    @Test
    public void startWebDriver(){

        System.setProperty("webdriver.gecko.driver","C:\\DRIVERS\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https:\\www.skiutah.com");
        Assert.assertTrue("Title will have Ski Utah in it",
                driver.getTitle().contains("Ski Utah"));

        driver.close();
        driver.quit();


    }
}