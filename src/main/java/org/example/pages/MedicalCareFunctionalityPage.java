package org.example.pages;

import org.example.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.example.configaration.GlobalReUsableMethods.*;
import static org.example.webelements.MedicalCareWebElements.*;

public class MedicalCareFunctionalityPage extends WebTestBase {

    public MedicalCareFunctionalityPage(WebDriver driver) {
        PageFactory.initElements(WebTestBase.driver,this);
    }

    @FindBy(id = hamburgerMenuFuncWebElementId)
    public static WebElement HamburgerMenu;
    @FindBy(xpath = medicalCarePharmacyWebElement)
    public static WebElement medicalCarePharmacy;
    //    =========================================================
    @FindBy(id = medicalCareFuncHomePageWebId)
    public static WebElement medicalCareFuncHomePage;
    @FindBy(id = medicalCareFuncHomePageHeaderWeb)
    public static WebElement medicalCareFuncHomePageHeader;
    @FindBy(xpath = amazonHealthMenuWebElement)
    public static WebElement amazonHealthMenu;
    @FindBy(xpath = amazonHealthMenuListWebElement)
    public static WebElement amazonHealthMenuList;
    //    @FindBy(xpath = oneMedicalWebElement)
//    public static WebElement oneMedical;
    @FindBy(xpath = amazonPharmacyWebElement)
    public static WebElement amazonPharmacy;
    @FindBy(xpath = amazonClinicWebElement)
    public static WebElement amazonClinic;
    @FindBy(xpath = allHealthOnAmazonWebElement)
    public static WebElement allHealthOnAmazon;


//    public static void verifyMedicalCare() throws TesseractException {
////        System.out.println(getCurrentUrl());
////        mouseHoverByWebElementWithPerform(medicalCareFuncHomePage);
////        String actualTitle = "Medical Care";
////        Assert.assertEquals(actualTitle,medicalCareFuncHomePage.getText(),"the title of the functionality doesn't match");
////        System.out.println("the title of Functionality : "+ medicalCareFuncHomePage.getText());
//
////        mouseHoverByWebElement(medicalCareFuncHomePageHeader);
//
//
////        String medicalCareFuncHomePageHeader = MedicalCareFunctionalityPage.medicalCareFuncHomePageHeader.getText();
////        Assert.assertEquals("Explore Medical Care",medicalCareFuncHomePageHeader,"the title doesn't match");
////        getLog(medicalCareFuncHomePageHeader);
//
////        List<String> medicalCareList = Collections.singletonList(medicalCareFuncHomePage.getText());
//
////        List<WebElement> functionList = driver.findElements(By.linkText("Medical Care"));
////        List<WebElement> medicalCareList = Collections.singletonList(medicalCareFuncHomePage);
////        for (WebElement list : functionList) {
////            String medicalContent = list.getText();
////            System.out.println(medicalContent);
////        }
//        Actions actions = new Actions(driver);
//        WebElement parentElement = driver.findElement(By.id(medicalCareFuncHomePageWebId));
//        actions.moveToElement(parentElement).build().perform();
//        WebElement hiddenElement = driver.findElement(By.xpath(medicalCareFuncHomePageHeaderWeb));
////        WebElement hiddenElement2 = driver.findElement(By.xpath("//img[@alt=\"One Medical\"]"));
//        if (hiddenElement.getText().contains("Explore Medical Care")) {
//            System.out.println(" \" Explore Medical Care \" Header is visible after hover.");
//        } else {
//            System.out.println("Element is not visible after hover.");
//        }
//        //        waitFor(30);
//        // Add Tesseract dependency to your project
//        // Initialize Tesseract
//        ITesseract image = new Tesseract();
//        image.setDatapath("DataTest/tessdata"); // Set path to Tesseract data
//        image.setLanguage("eng"); // Specify the language (e.g., English)
//
//        // Read text from the image
//        String extractedText = image.doOCR(new File("ScreenShots/PrimeOneMedical_RGB_SquidInk_-_Desktop4x.png"));
////        System.out.println("Extracted Text: " + extractedText);
//
//        if (extractedText.contains("prime | one medical")) {
//            System.out.println(" \" prime | one medical \" Header is visible after hover.");
//        } else {
//            System.out.println("Element is not visible after hover.");
//        }
//        String extractedPharText = image.doOCR(new File("ScreenShots/Pharmacy_logo_-_Desktop4x.png"));
//        String newText = extractedPharText.replaceAll("\\s","");
////        System.out.println("Extracted Text: " + newText);
//        if (newText.contains("pharmacy")) {
//            System.out.println(" \" Pharmacy \" Header is visible after hover.");
//        } else {
//            System.out.println("Element is not visible after hover.");
//        }
//        String extractedClinicText = image.doOCR(new File("ScreenShots/Clinic_logo_-_Desktop4x.png"));
////        System.out.println("Extracted Text: " + extractedClinicText);
//        if (extractedClinicText.contains("clinic")) {
//            System.out.println(" \" Clinic \" Header is visible after hover.");
//        } else {
//            System.out.println("Element is not visible after hover.");
//        }
//        getLog("===================       The verify Medical Care Test Passed         ===============================");
//    }
    public static void verifyAmazonHeathMenuTitle() {
        waitFor(3);
//        fluentWaitUntilConditionMeet(amazonHealthMenu).getText();
        String expectedTitle = amazonHealthMenu.getText();
        System.out.println("The Title : " + expectedTitle);
        String actualTitle = "Amazon Health";
        Assert.assertEquals(actualTitle, amazonHealthMenu.getText(), "the title does not match");
        getLog("===================       Amazon Heath Menu Title Test Passed         ===========================");
    }

    public static void getListOfAmazonHealthMenu() {
        HamburgerMenu.click();
        waitFor(3);
        medicalCarePharmacy.click();
        WebElement health = driver.findElement(By.xpath(amazonHealthMenuListWebElement));
        fluentWaitUntilConditionMeet(health);
        List<WebElement> amazonHealthList = driver.findElements(By.xpath(amazonHealthMenuListWebElement));
        for (WebElement list : amazonHealthList) {
            String newList = list.getText();
            getLog(newList);
            getLog("===================    Get List Of Amazon Health Menu Test Passed      =====================");
        }
    }

    public static void getAllLinksInAmazonHealthMainMenu() throws IOException {
//        getListOfAmazonHealthMenu();
        HamburgerMenu.click();
        waitFor(3);
        medicalCarePharmacy.click();
        getLog("=============  the list of all the links and images  ============");
        //Step:1-->Get the list of all the links and images
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        linksList.addAll(driver.findElements(By.tagName("img")));
//        for (WebElement links : linksList) {
//            getLog(links.getText());
//        }
        System.out.println("Total number of links and images--------->>> " + linksList.size());

        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        List<WebElement> activeLinks = new ArrayList<WebElement>();
        for (int i = 0; i < linksList.size(); i++) {
            System.out.println(linksList.get(i).getAttribute("href"));
            if (linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript") && (!linksList.get(i).getAttribute("href").contains("mailto")))) {
                activeLinks.add(linksList.get(i));
            }
        }
        System.out.println("Total number of active links and images-------->>> " + activeLinks.size());
        //Step:3--> Check the href url, with http connection api
        for (int j = 0; j < activeLinks.size(); j++) {
            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "--------->>> " + response);
        }
        getLog("===================    get AllLinks In Amazon Health Main Menu Test Passed      =====================");
    }

}

