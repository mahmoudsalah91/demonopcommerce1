package example.stepDefs;

import example.pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

import static example.stepDefs.Hooks.driver;

public class D07_followUsStepDef extends P03_homePage {

    P03_homePage homePage = new P03_homePage();

    @When("user click on facebook link")
    public void CliconFacebookicon() throws InterruptedException {
        homePage.Facebookicon.click();
        Thread.sleep(3000);


    }

    @Then("user verify that facebook page display")
    public void NavigatetoFacebookURL() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

    @When("user click on twitter link")
    public void Clicontwittericon() throws InterruptedException {
        homePage.Twittericon.click();
        Thread.sleep(3000);


    }

    @Then("user verify that twitter page display")
    public void NavigatetotwitterURL() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

    @When("user click on RSS link")
    public void Cliconrssicon() throws InterruptedException {
        homePage.RSSicon.click();
        Thread.sleep(3000);


    }

    @Then("user verify that RSS page display")
    public void NavigatetorssURL() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

    @When("user click on youtube link")
    public void Cliconyoutubeicon() throws InterruptedException {
        homePage.YouTubeicon.click();
        Thread.sleep(3000);


    }

    @Then("user verify that youtube page display")
    public void NavigatetoyoutubeURL() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));


    }
}