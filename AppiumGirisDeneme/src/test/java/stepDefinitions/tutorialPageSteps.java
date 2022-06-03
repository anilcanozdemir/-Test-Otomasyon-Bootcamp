package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TutorialPage;
import util.DriverFactory;

public class tutorialPageSteps {

    static TutorialPage tutorialPage = new TutorialPage(DriverFactory.getDriver());



    @Given("Enes is opened LcWaikiki App")
    public void enesIsOpenedLcWaikikiApp() {

    }

    @Then("should see TvTutorial")
    public void shouldSeeTvTutorial() {
        tutorialPage.checkTvTutorial();
    }

    @Then("should see {string} text")
    public void shouldSeeText(String arg0) {
        tutorialPage.checkText(arg0);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        tutorialPage.checkTitle(arg0);
    }

    @Then("should see {string} title description")
    public void shouldSeeTitleDescription(String arg0) {
        tutorialPage.checkTitleDescription(arg0);
    }

    @Then("should see {string} button")
    public void shouldSeeButton(String arg0) {
        tutorialPage.checkButton(arg0);
    }

    @When("drag and drop TvTutorial")
    public void dragAndDropTvTutorial() throws Exception {

        tutorialPage.dragAndDropTvTutorial();
    }

    @When("click Skip button")
    static public void clickSkipButton() {
        tutorialPage.clickSkipButton();
    }
}
