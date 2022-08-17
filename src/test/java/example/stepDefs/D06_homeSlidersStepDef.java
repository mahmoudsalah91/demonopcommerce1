package example.stepDefs;

import example.pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user click on first slider")
    public void ClcikonNokiaSlider() throws InterruptedException {

        homePage.NokiaSlider.click();
        Thread.sleep(1000);


    }
    @Then("Verify user redirect to this url nokia-lumia-1020")
    public void VerifyRedirectToURL(){
    String ActualURL =driver.getCurrentUrl();
    String expectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(ActualURL,expectedURL);

    }
    @When("user click on second slider")
    public void ClcikonIphoneSlider() throws InterruptedException {
        Thread.sleep(4000);

        homePage.IphoneSlider.click();

    }
    @Then("Verify user redirect to Iphone URL")
    public void VerifyRedirectToURL2() throws InterruptedException {
        String ActualURL =driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(ActualURL,expectedURL);

    }
}
