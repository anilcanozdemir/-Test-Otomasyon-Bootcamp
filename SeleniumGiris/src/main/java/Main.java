import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ///////////////URL///////////////////////////////////////
        driver.get("https://www.google.com/");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        String pageSource =driver.getPageSource();
        //////////////////MANAGE//////////////////////////////////////
        //Manage/Timeouts
        driver. manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver. manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Manage/Window
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();//F11
        int xDüzlemi=driver.manage().window().getPosition().getX();//Pixel coordinates
        int yDüzlemi=driver.manage().window().getPosition().getY();
        driver.manage().window().setPosition(new Point (0,0));
        driver.manage().window().setSize(new Dimension(500,500));
        ///////////////////////QUIT-CLOSE//////////////////////////////
        driver.quit();
        driver.close();

        driver.navigate().back();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().forward();
        driver.navigate().refresh();








        ////////////////////HANDLES////////////////////


        Set<String> windowHandles=driver.getWindowHandles();
        for (String handle:windowHandles
             ) {

        }
        String windowHandle=driver.getWindowHandle();


        ////////////////////SWITCHES-FRAMES/////////////////
        driver.switchTo().frame(1);
        driver.switchTo().defaultContent();
        /////////////////FIND ELEMENTS///////////////////////
        driver.findElement(By.name("xd"));
        driver.findElements(By.name("sde"));


        /////////////////FIND ELEMENT //////////////////////
        WebElement webElement1 = driver.findElement(By.name(""));
        WebElement webElement2 = driver.findElement(By.id(""));
        WebElement webElement3 = driver.findElement(By.linkText(""));
        WebElement webElement4 = driver.findElement(By.partialLinkText(""));
        WebElement webElement5 = driver.findElement(By.tagName(""));
        WebElement webElement6 = driver.findElement(By.className("logo"));
        WebElement webElement7 = driver.findElement(By.xpath(""));


        webElement6.click();
        webElement6.sendKeys("ayakkabi");
        String text=webElement6.getText();
        webElement6.clear();
        String webElement6Attribute=webElement6.getAttribute("class");
        String cssValue=webElement6.getCssValue("color");
        int webElement6LocationX=webElement6.getLocation().getX();
        int webElement6LocationY=webElement6.getLocation().getX();
        Dimension webElement6Size=webElement6.getSize();
        int webElement6Height=webElement6.getRect().getHeight();
        int webElement6Width=webElement6.getRect().getWidth();
        String tagName=webElement6.getTagName();
        webElement6.isDisplayed();
        webElement6.isEnabled();
        webElement6.isSelected();
        webElement6.findElement(By.name(""));
        webElement6.findElements(By.name(""));


        /////////////////FIND ELEMENTS //////////////////////
        List<WebElement> webElementList=driver.findElements(By.cssSelector(".menu-header-item__title"));
        for (WebElement elem:webElementList
             ) {
            if(elem.getText().equals("Kadın")) {
              elem.click();
              break;
            }
        }
    }
}
