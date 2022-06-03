package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class HomePage {

    By btn_HomeIcon = MobileBy.AndroidUIAutomator("new UiSelector().description(\"Home\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkHomePage() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hoş geldin\")"));

    }


    public void checkNavigationButton(String arg0) {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void checkSelectedNavigationButton(String arg0) throws Exception {
        MobileElement mobileElement = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
        if(mobileElement.isSelected())
        {

        }
        else
        {
            throw new Exception("checkSelectedNavigationButton");
        }

    }
}
