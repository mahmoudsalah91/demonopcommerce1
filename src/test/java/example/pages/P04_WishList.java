package example.pages;

import example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_WishList {
    public P04_WishList() { PageFactory.initElements(Hooks.driver,this);}


    @FindBy(css = "input[value='1']")
    public WebElement HTCQty;
}