package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login {
    private final JavascriptExecutor js;
    private final WebDriverWait wait;
    private WebDriver webDriver;
    private Actions actions;

    public login(JavascriptExecutor js, WebDriverWait wait) {
        super();
        this.webDriver = Hooks.webDriver;
        this.js = (JavascriptExecutor) webDriver;
        this.actions = new Actions(webDriver);
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    @Given("User open the website Official")
    public void userOpenTheWebsiteOfficial() throws InterruptedException {
        WebElement openWebSite = webDriver.findElement(By.xpath("//img[@alt='logo-vega']"));
        openWebSite.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);

    }

    @When("User input Username and Password in page")
    public void userInputUsernameAndPasswordInPage() throws InterruptedException {
        WebElement userName = webDriver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("addiyat.sandi@gmail.com");
        WebElement password = webDriver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Nashta@2023");
        WebElement clickSignIn = webDriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth css-1kol59t']"));
        clickSignIn.click();
        Thread.sleep(1000);

    }

    @Then("User already on landing page")
    public void userAlreadyOnLandingPage() {

    }


}