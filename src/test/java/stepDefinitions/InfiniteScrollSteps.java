package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fucntionsLibrary.CommonFunctions;
import fucntionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.InfiniteScrollPage;

public class InfiniteScrollSteps extends CommonFunctions {

    InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage(driver);

    @When("^I click the infinite scroll link$")
    public void i_click_the_infinite_scroll_link()  {
        infiniteScrollPage.clkScrollLink();
    }

    @When("^I should be able to view the infinite scroll page$")
    public void i_should_be_able_to_view_the_infinite_scroll_page()  {
        Assert.assertEquals(Constants.INFINITE_TEXT,infiniteScrollPage.getTitle());
    }

    @When("^I scroll down to the Bottom of the page twice$")
    public void i_scroll_down_to_the_Bottom_of_the_page_twice()  {
        infiniteScrollPage.scrollDown();
    }

    @When("^I Scroll Up to the Top of the page$")
    public void i_Scroll_Up_to_the_Top_of_the_page()  {
        infiniteScrollPage.scrollUp();
    }

    @Then("^I should be able to validate the text \"([^\"]*)\"$")
    public void i_should_be_able_to_validate_the_text(String infiniteText)  {
        Assert.assertEquals(infiniteText,infiniteScrollPage.getTitle());

    }

}
