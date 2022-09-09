package StepDefinition;

import POM.AddNewAddressElements;
import io.cucumber.java.en.*;

public class AddNewAddress_stepDef {

  AddNewAddressElements newAddress = new AddNewAddressElements();

    @Given("User click on manage address")
    public void user_click_on_manage_address() {
    newAddress.manageAddress();

    }
    @When("User add {string} {string} {string} {string} {string} {string}")
    public void user_add(String phone, String stAddress, String city, String state, String zipcode, String country) {
    newAddress.addNewAddress(phone,stAddress,city,state,zipcode,country);
    }
    @Then("Validate Address created message successfully")
    public void validate_address_created_message_successfully() {
      newAddress.validateSuccessMessage();
    }




}
