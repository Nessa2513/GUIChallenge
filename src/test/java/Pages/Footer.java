package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Footer extends BasePage{
    public Footer(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    private By loggedInButton = By.cssSelector(".rounded.logged_in");

    public String LoggedIn() {
        logger.log(Level.INFO, "A welcome message is appearing");
        return webDriver.findElement(loggedInButton).getText();
    }
    public void scrollDown(){
        logger.log(Level.INFO,"The page is scrolling down");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
