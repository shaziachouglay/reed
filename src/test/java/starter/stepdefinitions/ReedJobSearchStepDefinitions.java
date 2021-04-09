package starter.stepdefinitions;

import com.google.common.collect.TreeTraverser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.search.SearchForJobs;

public class ReedJobSearchStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) a non registered user has opened the reed application$")
    public void ANonRegisteredUserHasOpenedTheReedApplication(String actorName) {
        OnStage.theActor(actorName).attemptsTo(
                NavigateTo.theReedHomePage()
        );
    }

    @When("^she searches for job by type of job (.*) and (.*)$")
    public void sheSearchesForJobByTypeOfJobJobTitleAndLocation(String jobType, String location) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchForJobs.using(jobType,location)
        );
    }

    @Then("^she should be able to see jobs related to the type of job searched (.*)$")
    public void sheShouldBeAbleToSeeJobsRelatedToTheTypeOfJobSearchedJobTitle(String expectedResults) {
    }
}
