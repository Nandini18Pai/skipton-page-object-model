package co.uk.skipton.pages;

import co.uk.skipton.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MortgagesPage extends Utility {

    private static final Logger log = LogManager.getLogger(MortgagesPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Mortgages']")
    WebElement mortgagesText;

    public String getMortgagesText() {
        return getTextFromElement(mortgagesText);
    }


}
