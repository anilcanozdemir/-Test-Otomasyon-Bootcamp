package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.TutorialPage;
import util.DriverFactory;

public class homePageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }

    @Given("Enes is on Home Page")
    public void enesIsOnHomePage() {
        tutorialPageSteps.clickSkipButton();
        homePage.checkHomePage();
    }

    @Then("should see {string} navigation button")
    public void shouldSeeNavigationButton(String arg0) {
        homePage.checkNavigationButton(arg0);
    }

    @Then("should see {string} selected navigation button")
    public void shouldSeeSelectedNavigationButton(String arg0) throws Exception {
        homePage.checkSelectedNavigationButton(arg0);
    }
}
