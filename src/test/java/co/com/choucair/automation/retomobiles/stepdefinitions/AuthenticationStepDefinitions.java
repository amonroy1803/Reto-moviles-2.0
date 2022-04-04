package co.com.choucair.automation.retomobiles.stepdefinitions;

import co.com.choucair.automation.retomobiles.tasks.Login;
import co.com.choucair.automation.retomobiles.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuthenticationStepDefinitions {

    @Given("^that Brandon wants to enter the Instagram application$")
    public void thatBrandonWantsToEnterTheWordpressApplication() {
        OnStage.theActorCalled("brandon").wasAbleTo((Performable) OpenThe.instagramApp());
    }


    @When("^I login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(user,password));
    }

    @Then("^you should see the login in the application with the message Logged in as$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs() {

    }


}
