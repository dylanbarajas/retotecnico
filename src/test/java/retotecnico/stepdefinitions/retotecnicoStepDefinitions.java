package retotecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retotecnico.tasks.OpenUp;
import retotecnico.tasks.Register;

public class retotecnicoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that dylan wants to register on the uTest platform$")
    public void thatDylanWantsToRegisterOnTheUTestPlatform() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Dylan").wasAbleTo(OpenUp.thePage(), (Register.OnThePage()));
    }


    @When("^he follows the registration steps and writes the information$")
    public void heFollowsTheRegistrationStepsAndWritesTheInformation() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^end registration on the platform$")
    public void endRegistrationOnThePlatform() {
        // Write code here that turns the phrase above into concrete actions

    }

}
