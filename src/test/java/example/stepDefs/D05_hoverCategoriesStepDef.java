package example.stepDefs;

import example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static example.stepDefs.Hooks.driver;


public class D05_hoverCategoriesStepDef extends P03_homePage {
    Actions action = new Actions(driver);
    P03_homePage homePage = new P03_homePage();
    public String selectItem;
  @Given("user hover on the selected category")
  public void hovertomaincategory() throws InterruptedException {
      //action.moveToElement(driver.findElement(By.cssSelector("a[href=\"/computers\"]"))).perform();
      action.moveToElement(homePage.MainCategory).perform();


  }
  @When("user select Desktops sub cateogries")
  public void selectDesktops(){
      action.moveToElement(homePage.MainCategory).perform();
       selectItem = driver.findElement(By.cssSelector("a[href=\"/desktops\"]")).getText().toLowerCase();
      driver.findElement(By.cssSelector("a[href=\"/desktops\"]")).click();
      System.out.println(selectItem);

  }
  @Then("Assert that Desktops title is equal or contains")
  public void verifyDesktops() {
     // String expectedResult = "https://demo.nopcommerce.com/desktops";
      //String selectItem = driver.findElement(By.cssSelector("a[href=\"/desktops\"]")).getText()
      String actualResult = driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText().toLowerCase();
      System.out.println(actualResult);
      Assert.assertEquals(selectItem,actualResult);


  }






}