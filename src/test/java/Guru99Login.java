import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99Login {

    public WebDriver driver;
    @BeforeMethod
    public void initializeBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void loginTest(){
        //Enter user name
        WebElement userIDTextField = driver.findElement(By.name("userName"));
        userIDTextField.sendKeys("test");
        //Enter password
        WebElement passwordTextField = driver.findElement(By.name("password"));
        passwordTextField.sendKeys("test");
        //Click Submit button
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

    }

    @AfterMethod
    public void closedBrowser(){
        driver.quit();
    }
}
