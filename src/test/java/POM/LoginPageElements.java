package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements extends BasePOM{
    public LoginPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li//a")
    private WebElement sigInButton;

    @FindBy(xpath = "(//input[@class='input-text'])[2]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(id = "send2")
    private WebElement sigInButton2;

    @FindBy(xpath = "//span[text()='Welcome, Tugba Son!']")
    private WebElement successMessage;

    @FindBy(xpath = "//strong[text()='Try Demo Customer Access']")
    private WebElement unSuccessMessage;

    public void userNavigateToWebsite() {
        sigInButton.click();
    }

    public void userEnterValidCredentials(String data1, String data2) {
        emailInput.sendKeys(data1);
        passwordInput.sendKeys(data2);
        sigInButton2.click();
    }

    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(successMessage.isDisplayed());
    }

    public void userEnterInvalidOrInvalid(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        sigInButton.click();

    }

    public void userShouldNotLoginAndReceiveErrorMessage() {
        Assert.assertTrue(unSuccessMessage.isDisplayed());

    }

}
