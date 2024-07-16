package org.example.testpages;

import org.example.configaration.WebTestBase;
import org.example.pages.AmazonSearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.example.configaration.GlobalReUsableMethods.getCurrentUrl;
import static org.example.pages.AmazonSearchBox.*;

public class AmazonSearchBoxTest extends WebTestBase {


    static AmazonSearchBox amazonSearchBox;


    public static void getInit() {
        PageFactory.initElements(driver, AmazonSearchBox.class);
        amazonSearchBox = new AmazonSearchBox(driver);
    }
    @Test
    public static void verifyUrlTest() throws IOException {
        waitFor(10);
//        extractText();
        String actualUrl = "https://www.amazon.com/";
        Assert.assertEquals(actualUrl, getCurrentUrl(), "the title is not match");
        getLog(getCurrentUrl());
        getLog("===================             The Url Test Passed             =============================");
    }
    @Test
    public static void verifyTitleTest(){
        waitFor(10);
        // get the title for the Web application
        String actualTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(actualTitle, AmazonSearchBox.getTitle(), "the title is not match");
        getLog(getTitle());
        getLog("===================         The Title Test Passed               =============================");
    }
    @Test
    public static void searchBoxTest() throws  IOException {
//        Search for one product (sofa bed).
        getInit();
        waitFor(10);
        searchBox();
        waitFor(3);
        getLog("===================       The Search Box Test Passed         ===============================");
    }
    @Test
    public static void validateSearchListTest() {
        // run a search list
        getInit();
        waitFor(10);
        searchList();
        getLog("===================     The Validation of Search List Test Passed   ========================");
    }
    @Test
    public static void verifyAllDropDownMenuTest() {
        getInit();
        waitFor(10);
        verifyAllMenuDropDownMenu();
        getLog("================     The verification of All DropDown Menu Test Passed   ====================");
    }
}



