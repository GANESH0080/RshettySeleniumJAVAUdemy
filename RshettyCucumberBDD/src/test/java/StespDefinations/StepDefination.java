package StespDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class StepDefination {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {

		System.out.println("Navigate to URL");
	}

	@When("^User login into application with \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {

		System.out.println("User login with Username as " + strArg1);
		System.out.println("User login with Password as " + strArg2);
		System.out.println("Successfully loggedIn in application");
	}

	@Then("^HomePage is populated$")
	public void homepage_is_populated() throws Throwable {

		System.out.println("Homepage showing");
	}

	@Then("^Cards are \"([^\"]*)\"$")
	public void cards_are_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}
