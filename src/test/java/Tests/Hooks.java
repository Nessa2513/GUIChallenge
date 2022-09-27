package Tests;

import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    protected WebDriver webDriver;


    @BeforeMethod
    public void setDriver(){
        webDriver = new ChromeDriver(); //Creating my WebDriver
        webDriver.manage().window().maximize(); // To open Chrome in a Huge window
        webDriver.navigate().to("https://www.themoviedb.org/"); // To open the page what I want
    }
    @AfterMethod
    public void tearDown(){
        //    webDriver.quit(); // To close Chrome window
    }

}
