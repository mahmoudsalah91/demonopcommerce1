package example.stepDefs;

import example.pages.P01_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static example.stepDefs.Hooks.driver;

public class D02_loginStepDef extends P01_login {


    P01_login login = new P01_login();

    @Given("user go to login page")
    public void go_to_login() {
        login.login.click();
    }



    @When("user login with \"valid\" \"test@example.com\"")
    public void enterEmail() {
        login.email.sendKeys("test@example93.com");


    }


    @And("user login with \"valid\"\"P@ssw0rd\"")
    public void enterPassword() {
        login.Password.sendKeys("P@ssw0rd");

    }


    @And("user press on login button")
    public void pressLogin() {
        login.loginButton.submit();

    }

    @Then("user login to the system successfully")
    public void loginSuccessfully()
    {

        //Assertion

        SoftAssert soft = new SoftAssert();

        System.out.println(driver.getCurrentUrl());
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

        String expectedResult = "My account";
        String actualResult = login.disableMyaccountTab.getText();
        soft.assertTrue(actualResult.contains(expectedResult));

        soft.assertAll();

    }

    // invalid
    @Given("user go to the login page")
    public void go_to_loginPage() {
        login.login.click();
    }




    @When("user login with \"invalid\" \"wrong@example.com\"")
    public void enterinvalidEmail() {
        login.email.sendKeys("wrong@example.com");


    }



    @And("user login with \"invalid\"\"P@ssw0rd\"")
    public void enterWRONGPassword() {
        login.Password.sendKeys("P@ssw0rd");

    }



    @And("user press on the login button")
    public void pressLoginbutton() {
        login.loginButton.submit();

    }

    @Then("user could not login to the system")
    public void verifyerrormessage()
    {


        //Assertion

        SoftAssert soft = new SoftAssert();
        String ExpectedMessage="Login was unsuccessful. Please correct the errors and try again";
        soft.assertTrue(login.Errormessage.getText().contains(ExpectedMessage));


        // color
        String expectedColor = "rgba(228, 67, 75, 1)";
        String actualColor = login.Errormessage.getCssValue("color");
        System.out.println(actualColor);
        soft.assertTrue(actualColor.contains(expectedColor));

        soft.assertAll();

    }
}



