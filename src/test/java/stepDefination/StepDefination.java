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

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password) {
        System.out.println("Username: " + username + " Password: " + password);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("hello world 3");
    }

    @Then("All cards are displayed {string}")
    public void all_cards_are_displayed(String status) {
        System.out.print(status);
    }
}