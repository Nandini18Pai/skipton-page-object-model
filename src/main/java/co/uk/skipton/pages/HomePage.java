package co.uk.skipton.pages;

import co.uk.skipton.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='mmenu']")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='Savings']")
    WebElement savings;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='Mortgages']")
    WebElement mortgages;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='Financial Planning & Advice']")
    WebElement financialPlanningAndAdvice;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='InsurancePage']")
    WebElement insurance;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='Legacy Planning']")
    WebElement legacyPlanning;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dtoggle menu-section'][normalize-space()='About us']")
    WebElement aboutUs;

    @CacheLookup
    @FindBy(xpath = "//a[@id='headerregion_0_signInSmall']")
    WebElement loginAndSignUpButton;


    public void acceptCookiesOnHomePage() {
        log.info("Accept Cookies: " + acceptCookies .toString());
        clickOnElement(acceptCookies);
    }

    public void selectMenu(String menu) {
        try {
            for (WebElement element : topMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                    log.info("Selecting menu " + menu);
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mouseHoverOnSavingsLinkAndClick() {
        mouseHoverToElementAndClick(savings);
        log.info("Mouse hovering on Savings link and click " + savings.toString());
    }

    public void mouseHoverOnMortgagesLinkAndClick() {
        mouseHoverToElementAndClick(mortgages);
        log.info("Mouse hovering on Mortgages link and click " + mortgages.toString());
    }

    public void mouseHoverOnFinancialPlanningAndAdviceLinkAndClick() {
        mouseHoverToElementAndClick(financialPlanningAndAdvice);
        log.info("Mouse hovering on Financial Planning & Advice link and click " + financialPlanningAndAdvice.toString());
    }

    public void mouseHoverOnInsuranceLinkAndClick() {
        mouseHoverToElementAndClick(insurance);
        log.info("Mouse hovering on InsurancePage link and click " + insurance.toString());
    }

    public void mouseHoverOnLegacyPlanningLinkAndClick() {
        mouseHoverToElementAndClick(legacyPlanning);
        log.info("Mouse hovering on Legacy Planning link and click " + legacyPlanning.toString());
    }
    public void mouseHoverOnAboutUsLinkAndClick() {
        mouseHoverToElementAndClick(aboutUs);
        log.info("Mouse hovering on About Us link and click " + aboutUs.toString());
    }

    public void clickOnLogInAndSignUpButton() {
        log.info("Log in / Sign up: " + loginAndSignUpButton .toString());
        clickOnElement(loginAndSignUpButton);
    }

}
