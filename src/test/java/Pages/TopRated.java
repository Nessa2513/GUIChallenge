package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TopRated extends BasePage{
    public TopRated(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
   // WebDriver webDriver;
    private By filters = By.cssSelector("div[class='filter_panel card closed'] div[data-callback] h2");
    private By actionFilter = By.cssSelector("#with_genres a[class='no_click'][href=\"/discover/movie?with_genres=28\"]");
    private By searchFilter = By.cssSelector(".apply.full.background_color.light_blue.enabled.fixed p.load_more .no_click.load_more");
    private By actionMovies = By.cssSelector("page_wrapper");

    public void moviesFilter(){
        logger.log(Level.INFO,"The user is looking the top rated movies");
        logger.log(Level.INFO,"The filters Button is being pressed");
        webDriver.findElement(filters).click();
        logger.log(Level.INFO,"The user wants to filter for 'action' movies");
        logger.log(Level.INFO,"The page is scrolling down");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(500,document.body.scrollHeight)");
        webDriver.findElement(actionFilter).click();
        webDriver.findElement(searchFilter).click();
        webDriver.findElement(actionMovies);
        Random random= new Random();
        Select actionMovies = new Select(webDriver.findElement( By.cssSelector("page_wrapper")));
        actionMovies.selectByIndex(random.nextInt());
    }
}
