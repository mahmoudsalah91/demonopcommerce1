package example.stepDefs;

import example.pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef extends P01_register {
    /*@Given("user go to register page")
    public void goRegisterPage()
    {
        System.out.println("This is a test before start coding");

        registerlink().click();
    }*/


    P01_register register = new P01_register();

    @Given("user go to register page")
    public void go_to_register()
    {
        register.register.click();
    }

    /*@Given("user go to register page")
    public void go_to_register()
    {
        register.registerlink().click();

    }*/
    @When("user select gender type")
    public void select_gender() throws InterruptedException {
      register.selectGenderFemale.click();
        Thread.sleep(1000);

        register.selectGenderMale.click();
    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enter_name() throws InterruptedException {
        register.enterFirstName.sendKeys("automation100");

        Thread.sleep(1000);

        register.enterLastName.sendKeys("tester100");
    }

    @And("user enter date of birth")
    public void enter_birthDate()
    {
        register.selectDay.click();
        register.selectDay.findElement(By.cssSelector("option[value=\"2\"]")).click();

        register.selectMonth.click();
        register.selectMonth.findElement(By.cssSelector("option[value=\"6\"]")).click();

        register.selectYear.click();
        register.selectYear.findElement(By.cssSelector("option[value=\"1991\"]")).click();
    }
    @And("user enter email \"test@example.com\" field")
    public void enter_email()
    {
        register.enterEmail.sendKeys("test@example93.com");
    }
    P01_register enterPassword = new P01_register();
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void enter_password()
    {
        register.enterPassword.sendKeys("P@ssw0rd");

        register.ConfirmPassword.sendKeys("P@ssw0rd");

    }
    @And("user clicks on register button")
    public void click_registerButton()
    {
        register.clickRegisterButton.submit();
    }

    @Then("success message is displayed")
    public void display_SuccessMessage()
    {
        register.displaySuccessMessage.findElements(By.className("result"));

        //Assertion
        SoftAssert soft = new SoftAssert();

        String expectedResult = "Your registration completed";
        String actualResult = register.displaySuccessMessage.getText();
        soft.assertTrue(actualResult.contains(expectedResult));

        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = register.displaySuccessMessage.getCssValue("color");
        soft.assertTrue(actualColor.contains(expectedColor));

        soft.assertAll();



    }
}