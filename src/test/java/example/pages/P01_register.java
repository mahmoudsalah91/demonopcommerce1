package example.pages;

import example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class P01_register {
    public P01_register()
    //Constructor pom designPtn

    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement register;

/*
    public WebElement registerlink() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
*/


    @FindBy(id = "gender-male")
    public WebElement selectGenderMale;

    @FindBy(id = "gender-female")
    public WebElement selectGenderFemale;


    @FindBy(id = "FirstName")
    public WebElement enterFirstName;

    @FindBy(id = "LastName")
    public  WebElement enterLastName;


    @FindBy(name = "DateOfBirthDay")
    public WebElement selectDay;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement selectMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement selectYear;


    @FindBy(name = "Email")
    public WebElement enterEmail;


    @FindBy(id = "Password")
    public WebElement enterPassword;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    public WebElement clickRegisterButton;

    @FindBy(className = "result")
    public WebElement displaySuccessMessage;

  /*  public void P01_login ()

    { PageFactory.initElements(Hooks.driver,this);}

    @FindBy(className ="ico-login")
    public WebElement login;
*/
}
