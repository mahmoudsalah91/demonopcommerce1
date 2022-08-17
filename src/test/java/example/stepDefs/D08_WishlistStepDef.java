package example.stepDefs;

import example.pages.P03_homePage;
import example.pages.P04_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static example.stepDefs.Hooks.driver;

public class D08_WishlistStepDef extends P03_homePage {

    P03_homePage homePage = new P03_homePage();
    P04_WishList Wishlist = new P04_WishList();

    @When("user click on wishlist button ❤️ on this product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void ClickonWishlist() throws InterruptedException {
        homePage.HTCWishlisticon.click();


    }

    @Then("user see success message")
    public void Verifysuccessmessage() throws InterruptedException {
        SoftAssert soft = new SoftAssert();

        String expectedResult = "The product has been added to your wishlist";
        String actualResult = homePage.successmessage.getText();
        soft.assertEquals(actualResult.contains(expectedResult),true);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        // color
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = homePage.disablecolor.getCssValue("background-color");
        System.out.println(actualColor);
        soft.assertTrue(actualColor.contains(expectedColor));

        soft.assertAll();
    }

    @When("user click on wishlist button HTC")
    public void ClickonWishlisthtc() throws InterruptedException {
        homePage.HTCWishlisticon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        Thread.sleep(4000);
    }

    @And("user click on Wishlist Tab")
    public void clickonWishlistTab() {
        homePage.WishlistLink.click();

    }
    @Then("Verify user product add in wichlistpage")
        public void Verifyaddproduct () {

              String actualqtr = Wishlist.HTCQty.getAttribute("value");
              int Actualint= Integer.parseInt(actualqtr);
              System.out.println(actualqtr);

            int expectedqtr = 1;
            Assert.assertEquals(Actualint, expectedqtr);



    }
}


