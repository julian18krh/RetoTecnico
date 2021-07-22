package stepdefinitios;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import task.SignUp;
import task.OpenUp;
import task.EndRegister;

import java.util.List;


public class UTestStepDefinitios {
    @Before
        public void setStage (){ OnStage.setTheStage(new OnlineCast());  }

    @Given("^than Cristian wants to enter the Utest platform$")
    public void thanCristianWantsToEnterTheUtestPlatform(List<UTestData> UTestData) throws Exception {
        OnStage.theActorCalled("Cristian").wasAbleTo(OpenUp.thePage(),(SignUp.onThePage(UTestData.get(0).getStrName(), UTestData.get(0).getSstrLname())));
    }
    @When("^he assigns password to the user$")
    public void heassignspasswordtotheuser(List<UTestData> UTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(EndRegister.the(UTestData.get(0).getStrPassword()));

    }

    @Then("^he validates that the registration was successful$")
    public void heValidatesThatTheRegistrationWasSuccessful(List<UTestData> UTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UTestData.get(0).getStrConfirm())));
    }






}
