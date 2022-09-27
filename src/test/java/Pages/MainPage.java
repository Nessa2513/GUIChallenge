package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPage{
    WebDriver webDriver;
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    private By searchBar = By.id("inner_search_v4");
    private By searchButton = By.cssSelector("[value=\"Search\"]");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SearchPage searchMovie(String movie){
        logger.log(Level.INFO,"The movie is being written on searching bar");
        webDriver.findElement(searchBar).sendKeys(movie);
        logger.log(Level.INFO,"The search Button is being pressed");
        webDriver.findElement(searchButton).click();
        return new SearchPage(webDriver);
    }
}
