package org.example.pages;

import org.example.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.configaration.GlobalReUsableMethods.explicitWaitForElementUsingVisibilityOf;
import static org.example.pages.MedicalCareFunctionalityPage.HamburgerMenu;
import static org.example.pages.MedicalCareFunctionalityPage.medicalCarePharmacy;
import static org.example.webelements.MedicalCareWebElements.hamburgerMenuListWebElementId;

public class MedicalCareAndPharmacyPage extends WebTestBase {
    public MedicalCareAndPharmacyPage(WebDriver driver) {
        PageFactory.initElements(WebTestBase.driver, this);
    }

    public static void verifySelectMedicalCareAndPharmacyFromHamBurger() {
        HamburgerMenu.click();
        waitFor(5);
        List<WebElement> webList = driver.findElements(By.id(hamburgerMenuListWebElementId));
//        getListOfString(webList);
        explicitWaitForElementUsingVisibilityOf(HamburgerMenu);
//        System.out.println(getListOfString(webList));
        for (WebElement optionList : webList) {
//           String option = optionList.getText();
            System.out.println(optionList.getText());
            try {
                medicalCarePharmacy.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", medicalCarePharmacy);
            }
        }
    }
}
