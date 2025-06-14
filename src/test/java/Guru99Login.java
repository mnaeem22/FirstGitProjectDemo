import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class Guru99Login {

    public WebDriver driver;
    @BeforeMethod
    public void initializeBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void loginTest(){
        //Enter my username from local repository
        WebElement userIDTextField = driver.findElement(By.name("userName"));
        userIDTextField.sendKeys("test");
        //Enter password from remote
        WebElement passwordTextField = driver.findElement(By.name("password"));
        passwordTextField.sendKeys("test");
        //Click Submit button
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        //Verify Login
        WebElement loginSuccessMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
        Assert.assertTrue(loginSuccessMessage.isDisplayed());

        //For demo purpose

    }

    @AfterMethod
    public void closedBrowser(){
        driver.quit();
    }
}
