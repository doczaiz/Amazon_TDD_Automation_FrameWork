package org.example.pages;

import org.example.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static org.example.webelements.SignInFunctionalityPageWebElements.*;

public class SignInFunctionalityPage extends WebTestBase {
    public static void verifySignInFunctionalityDropDownMenuLinks() {
        Actions actions = new Actions(driver);
        WebElement signInFunction = driver.findElement(By.xpath(signInFunctionButtonWeb));
        actions.moveToElement(signInFunction).perform();
        waitFor(3);
        String headerText =driver.findElement(By.xpath(signInFunctionButtonWeb)).getText();
        getLog("the Header : "+headerText);
        Assert.assertEquals("Hello, sign in",headerText,"the header title doesn't match");

        List<WebElement> links = driver.findElements(By.xpath(signInFunctionButtonLinksWeb));
        for (WebElement link : links) {
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");
            System.out.println("Link Text: " + linkText);
            System.out.println("Link URL: " + linkUrl);
        }
    }
}
