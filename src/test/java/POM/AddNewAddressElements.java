package POM;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddressElements extends BasePOM {


    public AddNewAddressElements(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class='action switch']")
    private WebElement myAccountDropDown;

    @FindBy(xpath = "//a[text()='My Account']/.")
    private WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    private WebElement manageAddress;

    @FindBy(xpath = "//span[text()='Add New Address']")
    private WebElement addNewAddressButton;

    @FindBy(id = "telephone")
    private WebElement phoneNumberInput;

    @FindBy(id = "street_1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(css = "select[name='region_id']")
    private WebElement stateDropDown;

    @FindBy(id = "zip")
    private WebElement zipCodeInput;

    @FindBy(id = "country")
    private WebElement countryDropDown;

    @FindBy(xpath = "//span[text()='Save Address']")
    private WebElement saveButton;

    @FindBy(css = "div[role='alert']")
    private WebElement addNewAddressSuccessMsg;

    public void manageAddress(){
        myAccountDropDown.click();
        myAccountButton.click();
        manageAddress.click();

    }
    public void addNewAddress(String phone, String stAddress, String city, String state, String zipcode, String country){
        addNewAddressButton.click();
        phoneNumberInput.sendKeys(phone);
        addressInput.sendKeys(stAddress);
        cityInput.sendKeys(city);
        selectFunction(stateDropDown,state);
        zipCodeInput.sendKeys(zipcode);
        selectFunction(countryDropDown, country);
        saveButton.click();

    }
    public void validateSuccessMessage(){
        waitUntilVisibleAndClickable(addNewAddressSuccessMsg);
        Assert.assertTrue(addNewAddressSuccessMsg.isDisplayed());
    }


}
