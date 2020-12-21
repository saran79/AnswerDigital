package pageObjects;

import fucntionsLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage {
    private WebDriver driver;
    private String keyOne;
    private String keyTwo;
    private String keyThree;
    private String keyFour;

    // web elements declaration
    @FindBy(id = "target")
    private WebElement txtField;
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[31]/a")
    private WebElement keyPressLink;
    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    private WebElement keyPressTitle;
    @FindBy(id = "result")
    private WebElement resultTxt;

    CommonFunctions commonFunctions = new CommonFunctions();

    // constructor initialises the web elements in the page using page Factory;
    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // click key press link on the home page
    public void clkLink() {
        keyPressLink.click();
    }

    // returns the title of the page
    public String getTitle() {
        return keyPressTitle.getText();
    }
    //press the first key in the text box
    public void pressFirstKey() {
        try {
            txtField.sendKeys(Keys.ARROW_RIGHT);
            keyOne = resultTxt.getText();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    //press the second key in the text box
    public void pressSecondKey() {
        try {
            txtField.clear();
            txtField.sendKeys(Keys.ESCAPE);
            keyTwo = resultTxt.getText();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        }
    //press the third key in the text box
    public void pressThirdKey() {
        try {
            txtField.clear();
            txtField.sendKeys(Keys.NUMPAD1);
            keyThree = resultTxt.getText();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
    //press the fourth key in the text box
    public void pressFourthKey() {
        try {
            txtField.clear();
            txtField.sendKeys(Keys.NUMPAD7);
            keyFour = resultTxt.getText();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    // return the text of the keys
    public String getKeyOne(){
        return keyOne;
    }
    public String getKeyTwo(){
        return keyTwo;
    }
    public String getKeyThree(){
        return keyThree;
    }
    public String getKeyFour(){
        return keyFour;
    }
}