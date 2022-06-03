package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class TutorialPage {


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By tvTitle=By.id("com.lcwaikiki.android:id/tvTitle");

    public TutorialPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }





    public void checkTvTutorial() {
        driver.findElement(tvTitle);
        
    }



    public void checkButton(String arg0) {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));

    }

    public void checkTitleDescription(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void checkTitle(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void checkText(String arg0) {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void dragAndDropTvTutorial() throws Exception {
        WebElement ele1= driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[2]/android.widget.ImageView"));
        WebElement ele2=driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.ImageView"));
        Actions action = new Actions(driver);
        action.dragAndDrop(ele1, ele2).build().perform();
    }

    public void clickSkipButton() {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")")).click();
    }
}
