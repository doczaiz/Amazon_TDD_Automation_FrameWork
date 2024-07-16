package org.example.testpages;

import org.example.configaration.WebTestBase;
import org.example.pages.MedicalCareAndPharmacyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.example.pages.MedicalCareAndPharmacyPage.verifySelectMedicalCareAndPharmacyFromHamBurger;

public class MedicalCareAndPharmacyPageTest extends WebTestBase {
    static MedicalCareAndPharmacyPage medicalCareAndPharmacyPage;

    public static void getInit() {
        PageFactory.initElements(driver, MedicalCareAndPharmacyPage.class);
        medicalCareAndPharmacyPage = new MedicalCareAndPharmacyPage(driver);
    }

    @Test
    public void validateSelectMedicalCareAndPharmacyFromHamBurger(){
        getInit();
        verifySelectMedicalCareAndPharmacyFromHamBurger();
    }
}
