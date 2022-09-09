package StepDefinition;

import POM.PurchaseProductElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PurchaseProduct_StepsDef {

    PurchaseProductElements productElements = new PurchaseProductElements();

    @Given("Select any product and complete checkout")
    public void select_any_product_and_complete_checkout() {
      productElements.selectAnItem();

    }
    @Then("Validate you successfully purchase product")
    public void validate_you_successfully_purchase_product() {
        productElements.validateSuccessMessage();
    }

}
