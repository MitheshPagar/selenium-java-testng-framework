package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class LoginPage {

    WebDriver driver;
    WaitUtils wait;

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public void login(String user, String pass) {

        wait.WaitByVisibility(username);
        driver.findElement(username).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        wait.WaitForClickability(loginBtn);
        driver.findElement(loginBtn).click();
    }
}
