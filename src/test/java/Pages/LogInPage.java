package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    private By usernameId = By.id("username");
    private By passwordId = By.id("password");
    private By logInButton = By.id("login_button");
    private By redErrorMessage = By.cssSelector(".background_color.red");
    @FindBy (css = ".carton .content ul")
    private WebElement twoMsgErrors;

    private By firstErrorMsg = By.cssSelector(".carton .content ul li:first-child");
    private By secondErrorMsg = By.cssSelector(".carton .content ul li:last-child");

    public void usernameLogIn(String username){
        logger.log(Level.INFO,"The username is being written");
        webDriver.findElement(usernameId).sendKeys(username);
    }
    public void passwordLogIn(String password){
        logger.log(Level.INFO,"The password is being written");
        webDriver.findElement(passwordId).sendKeys(password);
    }
    public void logInBtn(){
        logger.log(Level.INFO,"The Login Button is being pressed");
        webDriver.findElement(logInButton).click();
    }
    public String wrongCredentials(){
        logger.log(Level.INFO, "User credentials are invalid");
        webDriver.findElement(redErrorMessage).getText();
      //  System.out.println(webDriver.findElement(redErrorMessage).getText());
        return webDriver.findElement(redErrorMessage).getText();
    }
    public String errorMessages(){
        logger.log(Level.INFO, "Two error messages are appearing");
        webDriver.findElement(firstErrorMsg).getText();
        return webDriver.findElement(firstErrorMsg).getText();
    }
}
