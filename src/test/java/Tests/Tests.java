package Tests;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends Hooks {

    @Test
    public void successfulLogin() {
        Header header = new Header(webDriver);
        LogInPage logInPage = new LogInPage(webDriver);
        Footer footer = new Footer(webDriver);
        header.LogIn();
        String message="Hi nessa.cardenas!";
        logInPage.usernameLogIn("nessa.cardenas");
        logInPage.passwordLogIn("Hola123.");
        logInPage.logInBtn();
        footer.scrollDown();
        Assert.assertEquals(message, footer.LoggedIn());
    }
    @Test
    public void failedLogin() {
        Header header = new Header(webDriver);
        LogInPage logInPage = new LogInPage(webDriver);
        header.LogIn();
        String message="  There was a problem";
        String message2="We couldn't validate your information. Want to try again?";
        logInPage.usernameLogIn("nessa.cardenas");
        logInPage.passwordLogIn("WrongPassword");
        logInPage.logInBtn();
        logInPage.wrongCredentials();
        Assert.assertEquals(message, logInPage.wrongCredentials());
        Assert.assertEquals(message2, logInPage.errorMessages());
    }

    @Test
    public void successfulSearch(){
        MainPage mainPage = new MainPage(webDriver);
        String movieTitle = "Fight Club";
        SearchPage searchPage = mainPage.searchMovie(movieTitle);
        Assert.assertEquals(movieTitle, searchPage.verifySearchMovie());
    }
    @Test
    public void movieGenreFilter(){
        Header header = new Header(webDriver);
        TopRated topRated = new TopRated(webDriver);
        Footer footer = new Footer(webDriver);
        header.topRatedMovies();
        topRated.moviesFilter();
    }
    }

