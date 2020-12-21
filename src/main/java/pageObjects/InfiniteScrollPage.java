package pageObjects;

import fucntionsLibrary.CommonFunctions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfiniteScrollPage {

    private WebDriver driver;

    // web elements declaration
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[26]/a")
    private WebElement infiniteScrollLink;
    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    private WebElement infiniteScrollTitle;

    // constructor initialises the web elements in the page using page Factory;
        public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
// click the infinite scroll page link
    public void clkScrollLink() {
        infiniteScrollLink.click();
    }
// return the title of the page
    public String getTitle() {
        return infiniteScrollTitle.getText();
    }
    // Scroll down to the bottom of the page
    public void scrollDown() {

        try {
            Actions action = new Actions(driver);
            Thread.sleep(3000);
            //SCROLL DOWN FIRST TIME
            action.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(3000);
            //SCROLL DOWN SECOND TIME
            action.sendKeys(Keys.PAGE_DOWN).build().perform();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    // Scroll up back to the top
    public void scrollUp(){
            try {
                Actions action = new Actions(driver);
                Thread.sleep(3000);
                //SCROLL UP
                action.sendKeys(Keys.PAGE_UP).build().perform();
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
    }
}