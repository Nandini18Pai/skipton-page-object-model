package co.uk.skipton.steps;

import co.uk.skipton.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    @And("I accept the cookies")
    public void iAcceptTheCookies() {
    HomePage homePage = new HomePage();
    homePage.acceptCookiesOnHomePage();

    }



    @When("I mouse hover on {string} tab and click")
    public void iMouseHoverOnTabAndClick(String tab) {
        HomePage homePage = new HomePage();
        if (tab.contains("Savings")) {
            homePage.mouseHoverOnSavingsLinkAndClick();
        } else if (tab.contains("Mortgages")) {
            homePage.mouseHoverOnMortgagesLinkAndClick();
        } else if (tab.contains("Financial Planning & Advice")) {
            homePage.mouseHoverOnFinancialPlanningAndAdviceLinkAndClick();
        } else if (tab.contains("InsurancePage")) {
            homePage.mouseHoverOnInsuranceLinkAndClick();
        } else if (tab.contains("Legacy Planning")) {
            homePage.mouseHoverOnLegacyPlanningLinkAndClick();
        } else if (tab.contains("About Us")) {
            homePage.mouseHoverOnAboutUsLinkAndClick();
        }

    }

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @And("I select {string} option")
    public void iSelectOption(String option) {
        new HomePage().selectMenu(option);
    }

    @Then("I should navigate to {string} page successfully")
    public void iShouldNavigateToPageSuccessfully(String menu) {
        HomePage homePage = new HomePage();
        if (menu.contains("Savings")) {
            Assert.assertEquals(new SavingsPage().getSavingsAccountsText(), menu, "Not Navigate to " + menu + " page");
        } else if (menu.contains("Mortgages")) {
            Assert.assertEquals(new MortgagesPage().getMortgagesText(), menu, "Not Navigate to " + menu + " page");
        } else if (menu.contains("Financial Planning & Advice")) {
            Assert.assertEquals(new FinancialPlanningAndAdvicePage().getFinancialAdviceText(), menu, "Not Navigate to " + menu + " page");
        } else if (menu.contains("Insurance")) {
            Assert.assertEquals(new InsurancePage().getInsuranceText(), menu, "Not Navigate to " + menu + " page");
        } else if (menu.contains("Legacy Planning")) {
            Assert.assertEquals(new LegacyPlanningPage().getLegacyPlanningText(), menu, "Not Navigate to " + menu + " page");
        } else if (menu.contains("About Us")) {
            Assert.assertEquals(new AboutUsPage().getAboutUsText(), menu, "Not Navigate to " + menu + " page");
        }


//        @And("I see the text {string}")
//        public void iSeeTheText (String text){
//
//
//
//
//        }





    }


}