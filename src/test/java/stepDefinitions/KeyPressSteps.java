package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fucntionsLibrary.CommonFunctions;
import fucntionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.KeyPressPage;

public class KeyPressSteps  extends CommonFunctions {

    KeyPressPage keyPressPage = new KeyPressPage(driver);

    @When("^I click the Key presses link$")
    public void i_click_the_Key_presses_link()  {
        keyPressPage.clkLink();
    }

    @When("^I will be directed to the Key Presses page$")
    public void i_will_be_directed_to_the_Key_Presses_page()  {
        Assert.assertEquals(Constants.KEYPRESS_TEXT,keyPressPage.getTitle());
    }

    @When("^I press the first key$")
    public void i_press_the_first_key()  {
        keyPressPage.pressFirstKey();
    }

    @When("^I should be able to validate the first text displayed after key press$")
    public void i_should_be_able_to_validate_the_first_text_displayed_after_key_press()  {
        Assert.assertEquals(Constants.KEYPRESS_ONE,keyPressPage.getKeyOne());
    }

    @When("^I press the Second key$")
    public void i_press_the_Second_key()  {
        keyPressPage.pressSecondKey();
    }

    @When("^I should be able to validate the second text displayed after key press$")
    public void i_should_be_able_to_validate_the_second_text_displayed_after_key_press()  {
        Assert.assertEquals(Constants.KEYPRESS_TWO,keyPressPage.getKeyTwo());
    }

    @When("^I press the third key$")
    public void i_press_the_third_key()  {
        keyPressPage.pressThirdKey();
    }

    @When("^I should be able to validate the third text displayed after key press$")
    public void i_should_be_able_to_validate_the_third_text_displayed_after_key_press()  {
        Assert.assertEquals(Constants.KEYPRESS_THREE,keyPressPage.getKeyThree());
    }

    @When("^I press the fourth key$")
    public void i_press_the_fourth_key()  {
        keyPressPage.pressFourthKey();
    }

    @Then("^I should be able to validate the fourth text displayed after key press$")
    public void i_should_be_able_to_validate_the_fourth_text_displayed_after_key_press()  {
        Assert.assertEquals(Constants.KEYPRESS_FOUR,keyPressPage.getKeyFour());
    }

}
