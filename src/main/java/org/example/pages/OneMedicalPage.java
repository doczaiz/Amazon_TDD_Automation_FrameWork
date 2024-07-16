package org.example.pages;

import org.example.configaration.WebTestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.example.configaration.GlobalReUsableMethods.mouseHoverByWebElementWithPerform;
import static org.example.pages.MedicalCareFunctionalityPage.medicalCareFuncHomePage;
import static org.example.webelements.OneMedicalPageWebElements.oneMedicalWebElement;


public class OneMedicalPage extends WebTestBase {
    public OneMedicalPage(WebDriver driver) {
        PageFactory.initElements(WebTestBase.driver, this);
    }
    @FindBy(xpath = oneMedicalWebElement)
    public static WebElement oneMedical;
    public static void verifyOneMedicalPageLink(){
        driver.switchTo().defaultContent();
        mouseHoverByWebElementWithPerform(medicalCareFuncHomePage);
//        String oneMedicalText = oneMedical.getText();
//        getLog(oneMedicalText);
        oneMedical.click();
        String expectedPageTitle = driver.getTitle();
        waitFor(3);
        String actualPageTitle = "Amazon Health: One Medical Membership for Prime Members";
        Assert.assertEquals(actualPageTitle,expectedPageTitle,"The page title doesn't matched");
        getLog("The Page Title : "+expectedPageTitle);
    }
}
