package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber; 


@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("hello world 1");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("hello world 2");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("hello world 3");
    }

    @And("^All cards are also displayed$")
    public void all_cards_are_also_displayed() throws Throwable {
    	System.out.println("hello world 4");
    }

}