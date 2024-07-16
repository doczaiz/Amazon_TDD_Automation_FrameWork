package org.example.pages;

//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HomeWork {

    public static void main(String[] args) {
       splitchar();
    }

    public void init() {
//        try {
//            URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
//            img = ImageIO.read(url);
//        } catch (IOException e) {
//        }
//    }
//
//    public void paint(Graphics g) {
//        g.drawImage(img, 50, 50, null);
    }


    static void splitchar(){

        try {
            File imageFile = new File("C:\\Users\\zaizd\\IdeaProjects\\Project_TDD-WebAutomationFramework_QE_SUMMER2023\\Amazon\\ScreenShots\\captchaV.png");
            BufferedImage image = ImageIO.read(imageFile);

            // Process the image to extract individual letters
            // Your processing logic goes here
            File outputFile = new File(new File("user dir") + "/screenshots/newImage.png");
            ImageIO.write(image, "png", outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
//    public static String extractText1() {
//
////        ITesseract instance = new Tesseract();
////
////        // Provide the path to the Tesseract data directory
////        instance.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
////
////        // Set the language for text recognition
////        instance.setLanguage("eng"); // Use "eng" for English
////
////        String extractedText = null;
////        try {
////            File imageFile = new File("C:\\Users\\zaizd\\IdeaProjects\\Project_TDD-WebAutomationFramework_QE_SUMMER2023\\Amazon\\ScreenShots\\captchaScreenShot.png");
////            extractedText = instance.doOCR(imageFile);
////            System.out.println(extractedText);
////        } catch (Exception e) {
////            System.err.println(e.getMessage());
////        }
////
//        return extractedText;
//    }
}
