package co.com.choucair.pruebatecnica.utest.stepdefinitions;

import co.com.choucair.pruebatecnica.utest.model.UtestData;
import co.com.choucair.pruebatecnica.utest.task.OpenUp;
import co.com.choucair.pruebatecnica.utest.task.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TestUtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Juan wants to register as a new user on the utes page$")
    public void JuanWantsToRegisterAsANewUserOnTheUtesPage() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());

    }


    @When("^he the registration form for new users$")
    public void heTheRegistrationFormForNewUsers(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(utestData.get(0).getName(), utestData.get(0).getLastName(), utestData.get(0).getEmailAddress(), utestData.get(0).getMonth(), utestData.get(0).getDay(),
                utestData.get(0).getYear(), utestData.get(0).getCity(), utestData.get(0).getIdioma(), utestData.get(0).getPostalCode(), utestData.get(0).getCountry(), utestData.get(0).getComputer(), utestData.get(0).getVersion(), utestData.get(0).getLanguage(),
                utestData.get(0).getMobileDevice(), utestData.get(0).getModel(), utestData.get(0).getOs(),utestData.get(0).getPassword(), utestData.get(0).getConfirPassword()));

    }


    @Then("^he complete the registration of new user$")
    public void heCompleteTheRegistrationOfNewUser()  throws Exception{

    }
}
