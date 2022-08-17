package example.stepDefs;

import example.pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef extends P03_homePage {


    P03_homePage currencyList = new P03_homePage();

    @When("user click on  currency dropdown list and Select Euro currency")
    public void goList() {
        currencyList.currencyList.click();
        currencyList.EURO.click();
    }

    @Then("shown on the 4 products displayed in Home page")
    public void verfyifydisplayingProducts() {
        int size = driver.findElements(By.xpath("//span[@class='price actual-price']")).size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
        String text = driver.findElements(By.xpath("//span[@class='price actual-price']")).get(i).getText();
            Assert.assertTrue(text.contains("€"));

    }
}
}








