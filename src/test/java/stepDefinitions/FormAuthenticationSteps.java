package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fucntionsLibrary.CommonFunctions;
import fucntionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.FormAuthenticationPage;

public class FormAuthenticationSteps extends CommonFunctions {

    FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage(driver);

    @Given("^I navigate to the provided Url$")
    public void i_navigate_to_the_provided_Url() {
        driver.get("http://the-internet.herokuapp.com/");
    }

    @When("^I click the Form Authentication Link$")
    public void i_click_the_Form_Authentication_Link() {
        formAuthenticationPage.clkAuthenticationLink();
    }

    @When("^I ll be directed to the Form Authentication page$")
    public void i_ll_be_directed_to_the_Form_Authentication_page() {
        Assert.assertTrue(formAuthenticationPage.validateLogo());
    }

    @When("^I enter the Username as \"([^\"]*)\"$")
    public void i_enter_the_Username_as(String username) {
        formAuthenticationPage.setUsername(username);
    }

    @When("^I enter the Password as \"([^\"]*)\"$")
    public void i_enter_the_Password_as(String password) {
        formAuthenticationPage.setPassword(password);
    }

    @When("^I click the Submit button$")
    public void i_click_the_Submit_button() {
        formAuthenticationPage.clkLogin();
    }

    @Then("^I should not be allowed to login with wrong password$")
    public void i_should_not_be_allowed_to_login_with_wrong_password() {
        Assert.assertEquals(Constants.INVALID_PASSWORD, formAuthenticationPage.getLoginText());
    }

    @Then("^I should not be allowed to login with wrong Username$")
    public void i_should_not_be_allowed_to_login_with_wrong_Username() {
        Assert.assertEquals(Constants.INVALID_USERNAME, formAuthenticationPage.getLoginText());
    }

    @When("^I should be allowed to login Successfully$")
    public void i_should_be_allowed_to_login_Successfully() {
        Assert.assertEquals(Constants.LOGIN_SUCCESS, formAuthenticationPage.getLoginText());
    }

    @When("^I should be able to click Logout$")
    public void i_should_be_able_to_click_Logout() {
        formAuthenticationPage.clkLogout();
    }

    @Then("^I should be able to logout successfully$")
    public void i_should_be_able_to_logout_successfully() {
        Assert.assertEquals(Constants.LOGOUT_SUCCESS, formAuthenticationPage.getLogoutText());

    }

}
