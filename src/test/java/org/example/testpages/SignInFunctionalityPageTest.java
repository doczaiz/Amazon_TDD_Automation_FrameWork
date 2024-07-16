package org.example.testpages;

import org.example.configaration.WebTestBase;
import org.testng.annotations.Test;

import static org.example.pages.SignInFunctionalityPage.verifySignInFunctionalityDropDownMenuLinks;

public class SignInFunctionalityPageTest extends WebTestBase {

    @Test
    public static void verifySignInFunctionalityDropDownMenuLinksTest(){
        verifySignInFunctionalityDropDownMenuLinks();
    }
}
