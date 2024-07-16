package org.example.testpages;

import org.example.pages.OneMedicalPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.example.configaration.WebTestBase.driver;
import static org.example.pages.OneMedicalPage.verifyOneMedicalPageLink;

public class OneMedicalPageTest {
    static OneMedicalPage oneMedicalPage;
    public static void getInit() {
        PageFactory.initElements(driver, OneMedicalPage.class);
        oneMedicalPage  = new OneMedicalPage (driver);
    }
    @Test
    public void verifyOneMedicalPageLinkTest(){
        getInit();
        verifyOneMedicalPageLink();
    }

}
