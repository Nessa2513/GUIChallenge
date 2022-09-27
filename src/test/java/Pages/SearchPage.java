package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    private By titleVerify = By.xpath("//div[@id='card_movie_4bc88fc1017a3c122d009254']//a/h2");
    public String verifySearchMovie (){
        logger.log(Level.INFO,"Verify Fight Club is the first result on page");
//        System.out.printf(webDriver.findElement(titleVerify).getText());
//        List<WebElement> lista = webDriver.findElements(titleVerify);
//        lista.get(0);
        return webDriver.findElement(titleVerify).getText();
    }
}
