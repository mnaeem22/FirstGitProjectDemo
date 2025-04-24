import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTests {
    public WebDriver driver;
    public String demoURL = "https://demo.guru99.com/test/newtours/";

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get(demoURL);
    }

    @Test(priority = 1, groups = "Smoke Test")
    public void validateMercuryPageTitle(){

        String actualMercuryPageTile = driver.getTitle();
        String expectedMercuryPageTitle = "ABC";
        //Validate Page Title
        Assert.assertEquals(actualMercuryPageTile,expectedMercuryPageTitle);

    }
    @AfterTest
    public void Exit(){
        driver.quit();
    }
}
