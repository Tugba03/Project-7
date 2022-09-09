package StepDefinition;

import POM.LoginPageElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginStepsDefinition {

    LoginPageElements lp = new LoginPageElements();

    @Given("User navigate to website")
    public void userNavigateToWebsite() {
        lp.userNavigateToWebsite();
    }

    @When("User enter valid credentials")
    public void userEnterValidCredentials(DataTable dataTable) {
        List<List<String>> testData = dataTable.asLists();
        for (List <String>data : testData){
            lp.userEnterValidCredentials(data.get(0), data.get(1));

        }
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        lp.userShouldLoginSuccessfully();
    }

    @When("User enter invalid {string} or invalid {string}")
    public void userEnterInvalidOrInvalid(String email, String password) {
        lp.userEnterInvalidOrInvalid(email, password);
    }

    @Then("User should not login and receive error message")
    public void userShouldNotLoginAndReceiveErrorMessage() {
        lp.userShouldNotLoginAndReceiveErrorMessage();
    }
}


