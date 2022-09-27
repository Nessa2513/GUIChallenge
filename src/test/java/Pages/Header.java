package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Header extends BasePage{
    public Header(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    private By logInButton = By.cssSelector("ul.primary a[href*='login']");
    private By moviesSelection = By.cssSelector("a.no_click.k-link.k-menu-link[href='/movie']");
    private By topRated = By.cssSelector("a.k-link.k-menu-link[href='/movie/top-rated']");

    public void LogIn(){
        logger.log(Level.INFO,"Log in button has been pressed");
        webDriver.findElement(logInButton).click();
    }

    public void topRatedMovies(){
        logger.log(Level.INFO,"The user wants to see the top rated movies");
        webDriver.findElement(moviesSelection).click();
        webDriver.findElement(topRated).click();
    }
}
