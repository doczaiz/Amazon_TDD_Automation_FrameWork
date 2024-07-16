package org.example.pages;


import org.example.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.webelements.AmazonSearchBoxWebElements.searchBoxButtonWebElement;
import static org.example.webelements.AmazonSearchBoxWebElements.searchBoxWebElement;

public class AmazonSearchBox extends WebTestBase {


    public AmazonSearchBox(WebDriver driver) {
        PageFactory.initElements(WebTestBase.driver, this);
    }

    @FindBy(xpath = searchBoxWebElement)
    public static WebElement searchBox;

    @FindBy(xpath = searchBoxButtonWebElement)
    public static WebElement searchBoxButton;

    public static String getTitle() {
//        TestLogger.log("Title");
        return driver.getTitle();

    }


    public static void searchBox() throws IOException {
        searchBox.click();
        searchBox.sendKeys("sofa bed");
        searchBoxButton.click();
    }
    public static void searchList() {
        searchBox.click();
        List<String> productList = new ArrayList<>();
        productList.add("iphone");
        productList.add("baby toys");
        productList.add("usb charger");
//        searchBox.click();
        for (String list : productList) {
            searchBox.sendKeys(list);
            waitFor(3);
            searchBoxButton.click();
            waitFor(2);
            driver.navigate().back();
            getLog(list);
        }
    }

    public static void verifyAllMenuDropDownMenu() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dropDown = driver.findElement(By.cssSelector("#searchDropdownBox"));
        Select object = new Select(dropDown);
        object.selectByVisibleText("Amazon Fresh");

        searchBox.click();

            searchBox.sendKeys("milk");
            searchBoxButton.click();
            waitFor(5);
            getLog("the selected option been clicked : the Test passed");
        }
    }


//    public static void handleCaptcha() {
//        // Locate the CAPTCHA element
//        WebElement captchaElement = driver.findElement(By.id("captchacharacters"));
//
//        // Extract text from the CAPTCHA element (assuming it's text-based)
//        String captchaText = captchaElement.getText();
//
//        // Perform OCR to recognize the CAPTCHA text (using Tesseract OCR in this example)
//        // Use a suitable OCR library and code for your scenario
//
//        // Enter the recognized text into the CAPTCHA input field
//        WebElement captchaInput = driver.findElement(By.id("captchacharacters"));
//        captchaInput.sendKeys(captchaText);
//
//        // Continue with your testing logic
//
//    }


//    public static void captcha() {
//
//        // Locate the CAPTCHA element
//        WebElement captchaElement = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img"));
//
//        // Extract text from the CAPTCHA element
//        String captchaText = captchaElement.getText();
//
//        // Use Tesseract OCR to recognize the CAPTCHA text
//        String ocrResult = performOCR(captchaElement);
//
//        // Enter the recognized text into the CAPTCHA input field
//        WebElement captchaInput = driver.findElement(By.id("captchacharacters"));
//        captchaInput.sendKeys(ocrResult);
//
//        // Continue with your testing logic
//
//
//    }

//    private static String performOCR(WebElement captchaElement) {
////        ITesseract tesseract = new Tesseract();
//        try {
//            // Set the path to the Tesseract OCR executable (change this based on your setup)
//            tesseract.setDatapath("captchacharacters");
//            return tesseract.doOCR(captchaElement.getScreenshotAs(org.openqa.selenium.OutputType.FILE));
//        } catch (TesseractException e) {
//            e.printStackTrace();
//            return "";
//        }
//    }

//    public static void captchaHandling() throws TesseractException, IOException {
//
//        // Locate the CAPTCHA image element
////        WebElement captchaImage = driver.findElement(By.xpath("//*[@class=\"a-row a-text-center\"]"));
////        File captchaImage = driver.findElement(By.xpath("//*[@class=\"a-row a-text-center\"]"));
//        File src = driver.findElement(By.xpath("//*[@class=\"a-row a-text-center\"]")).getScreenshotAs(OutputType.FILE);
//
//        String path = System.getProperty("user.dir") + "/screenshots/captchaV.png";
//        FileHandler.copy((File) src, new File(path));
////        ITesseract image = new Tesseract();
//        image.doOCR(new File(path));
//        String imageText = image.doOCR(new File(path));
//        String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z]", "");
//        System.out.println("Final Captcha is " + finalText);
//
//        // Extract text from the CAPTCHA image (assuming it's an image-based CAPTCHA)
//        String captchaText = finalText;
//        // Locate the CAPTCHA input field
//        WebElement captchaInput = driver.findElement(By.id("captchacharacters"));
//
//        // Enter the recognized text into the CAPTCHA input field
//        captchaInput.sendKeys(captchaText);
//
//        // Continue with your testing logic
//
//
//    }


//    public static String recognizeCaptchaTextFromImage(WebElement captchaImage) throws TesseractException, IOException {
//        // Use an OCR library (e.g., Tesseract) to recognize text from the image
//        // Implement OCR logic here and return the recognized text
////        File src = driver.findElement(By.id("body > div > div.a-row.a-spacing-double-large > div.a-section > div > div > form > div.a-row.a-spacing-large > div > div > div.a-row.a-text-center > img")).getScreenshotAs(OutputType.FILE);
//        String path = System.getProperty("user.dir") + "/screenshots/captchaScreenShot.png";
//        FileHandler.copy((File) captchaImage, new File(path));
////        ITesseract image = new Tesseract();
//        // Provide the path to the Tesseract data directory
//        image.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
//        image.setLanguage("eng"); // Use "eng" for English
//        image.doOCR(new File(path));
//        String imageText = image.doOCR(new File(path));
//        String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println("Final Captcha is " + finalText);
//
//
//        return finalText;
//    }

//    public static void extractTextPicture() throws TesseractException, IOException {
//
//
//        File src = driver.findElement(By.id("captcha Img")).getScreenshotAs(OutputType.FILE);
//        String path = System.getProperty("C:\\Users\\zaizd\\IdeaProjects\\Project_TDD-WebAutomationFramework_QE_SUMMER2023\\Amazon\\ScreenShots\\captchaScreenShot.png");
//        FileHandler.copy(src, new File(path));
////        ITesseract image = new Tesseract();
//        image.doOCR(new File(path));
//        String imageText = image.doOCR(new File(path));
//        String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println("Final Captcha is " + finalText);
////        driver.findElement(By.id("nlpAnswer")).sendKeys(finalText);
//    }


//    void extract(){
//        // Add the reference to Aspose.OCR in your project by specifying Maven Repository configurations
//
//// Create an instance of AsposeOcr class to apply OCR to an image
//        AsposeOcr asposeOcr = new AsposeOcr();
//
//// Read image using RecognizePage method for text extraction
//        String extractedText = asposeOcr.RecognizePage("path_to_your_image.jpg");
//
//// Save extracted text to a text file using FileWriter object
//        try (FileWriter fileWriter = new FileWriter("output.txt")) {
//            fileWriter.write(extractedText);
//        }
//
//    }



