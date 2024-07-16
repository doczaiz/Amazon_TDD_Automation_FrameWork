package org.example.testpages;

import org.example.configaration.WebTestBase;
import org.example.pages.MedicalCareFunctionalityPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.example.pages.MedicalCareAndPharmacyPage.verifySelectMedicalCareAndPharmacyFromHamBurger;
import static org.example.pages.MedicalCareFunctionalityPage.*;

public class MedicalCareFunctionalityTest extends WebTestBase {

    public static MedicalCareFunctionalityPage medicalCareFunctionalityPage;

    public static void getInit() {
        PageFactory.initElements(driver, MedicalCareFunctionalityPage.class);
        medicalCareFunctionalityPage = new MedicalCareFunctionalityPage(driver);
    }
        @Test
    public static void verifyMedicalCareFunctionalityTest()  {
        getInit();
//        verifyMedicalCare();
        getLog("===================    verify Medical Care Functionality Test Passed =========================");
    }

    @Test
    public static void verifySelectMedicalCareFromHamBurgerMenuTest() {
        getInit();
        verifySelectMedicalCareAndPharmacyFromHamBurger();
        getLog("=================    verify Select Medical Care From Hamburger Menu Test Passed   ===============");
    }
    @Test
    public void verifyAmazonHeathMenuTest(){
        getInit();
        verifySelectMedicalCareAndPharmacyFromHamBurger();
        verifyAmazonHeathMenuTitle();
        getListOfAmazonHealthMenu();
        getLog("=================                   verify Amazon Heath Menu Test Passed         ===============");
    }
    @Test
    public void getListOfAmazonHealthMenuTest(){
        getInit();
        getListOfAmazonHealthMenu();
    }
    @Test
    public void getAllLinksInAmazonHealthMainMenuTest() throws IOException {
        getInit();
        getAllLinksInAmazonHealthMainMenu();
        getLog("=================         Get All Links In Amazon Health Main Menu Test Passed     ===============");
    }

}



