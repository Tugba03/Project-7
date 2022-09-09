package POM;


import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseProductElements extends BasePOM{


    public PurchaseProductElements(){PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[id='search']")
    private WebElement searchButton;

    @FindBy(css = "img[class='product-image-photo']")
    private WebElement pickItemOnThePic;

    @FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
    private WebElement pickSize;

    @FindBy(css = "div[class='swatch-option color']")
    private WebElement pickColor;

    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(css = "div[class='minicart-wrapper']")
    private WebElement goToBasket;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//span[text()='Ship Here']")
    private WebElement shipHereButton;

   @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement radioButton;

    @FindBy(xpath = "(//div[@class='primary'])[2]")
    private WebElement nextButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkboxForBillingAdd;

    @FindBy(xpath = "//span[text()='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//span[text()='Thank you for your purchase!']")
    private WebElement successMessage;


    public void selectAnItem(){
        searchButton.sendKeys("pants");
        pickItemOnThePic.click();
        pickSize.click();
        pickColor.click();
        addToCartButton.click();
        goToBasket.click();
        waitUntilVisibleAndClickable(proceedToCheckoutButton);
        waitUntilVisibleAndClickable(shipHereButton);
        waitUntilVisibleAndClickable(radioButton);
        waitUntilVisibleAndClickable(nextButton);
        checkboxForBillingAdd.click();
        waitUntilVisibleAndClickable(placeOrderButton);

    }

    public void validateSuccessMessage(){
        Assert.assertTrue(successMessage.isDisplayed());
    }










}
