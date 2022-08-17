package example.stepDefs;

import example.pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static example.stepDefs.Hooks.driver;


public class D04_searchStepDef extends P03_homePage {

    P03_homePage homePage= new P03_homePage ();
    @When("user search for book")
    public void enterData () throws InterruptedException {
        //Initialize data table
        homePage.search.sendKeys("book");
        homePage.search.sendKeys(Keys.ENTER);
    }
        @Then("each result contains the search word book")
        public void assertResults()
    {
        SoftAssert soft = new SoftAssert();

        int actualResult = driver.findElements(By.className("item-box")).size();
        System.out.println("result : "+ actualResult);
        List<WebElement> books = driver.findElements(By.className("item-box"));
        for (int i=1; i<=books.size(); i++)
        {
            String actualString= books.get(1).getText().toLowerCase();
            soft.assertTrue(actualString.contains("book"));
            soft.assertAll();
        }


    }
    @When("user search for laptop")
    public void enterlaptop () throws InterruptedException {
        //Initialize data table
        homePage.search.sendKeys("laptop");
        homePage.search.sendKeys(Keys.ENTER);
    }
    @Then("each result contains the search word laptop")
    public void assertResults2()
    {
        SoftAssert soft = new SoftAssert();

        int actualResult = driver.findElements(By.className("item-box")).size();
        System.out.println("result : "+ actualResult);
        List<WebElement> laptops = driver.findElements(By.className("item-box"));
        for (int i=1; i<=laptops.size(); i++)
        {
            String actualString= laptops.get(1).getText().toLowerCase();
            soft.assertTrue(actualString.contains("laptop"));
            soft.assertAll();

        }


    }

    @When("user search for nike")
    public void enternike () throws InterruptedException {
        //Initialize data table
        homePage.search.sendKeys("nike");
        homePage.search.sendKeys(Keys.ENTER);
    }
    @Then("each result contains the search word nike")
    public void assertResults3()
    {
        SoftAssert soft = new SoftAssert();

        int actualResult = driver.findElements(By.className("item-box")).size();
        System.out.println("result : "+ actualResult);
        List<WebElement> nike = driver.findElements(By.className("item-box"));
        for (int i=1; i<=nike.size(); i++)
        {
            String actualString= nike.get(1).getText().toLowerCase();
            soft.assertTrue(actualString.contains("nike"));
            soft.assertAll();

        }


    }


        @When("user search for items by SKU")
        public void enterSKU () {

            homePage.search.sendKeys("AP_MBP_13");
            homePage.search.sendKeys(Keys.ENTER);
            homePage.productTitle.click();
        }
        @Then("verify it contains the sku using in search")
        public void verifySKU () {
        String actualresult=driver.findElement(By.id("sku-4")).getText();
        Assert.assertTrue(actualresult.equals("AP_MBP_13"));
    }

        // assertion


        /*soft.assertEquals(actualResult,expectedResult);*/


       /* Thread.sleep(1000);
       int str= homePage.search.findElements(By.className("product-item")).size();
       System.out.println(str);

*/
    }



