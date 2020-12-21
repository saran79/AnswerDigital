package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage {
    private WebDriver driver;

    // web elements declaration

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[21]/a")
    private WebElement formLink;
    @FindBy(xpath="//*[@id=\"content\"]/div/h2")
    private WebElement logo;
    @FindBy(id="username")
    private WebElement userNameTxtFld;
    @FindBy(id="password")
    private WebElement passwordTxtFld;
    @FindBy(xpath="//*[@id=\"login\"]/button/i")
    private WebElement loginBtn;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement loginInText;
    @FindBy(xpath="//*[@id=\"content\"]/div/a")
    private WebElement logOutBtn;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement logOutText;

  // constructor initialises the web elements in the page using page Factory;
    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // click the Form Authentication link in the home page
    public void clkAuthenticationLink() {
        formLink.click();
    }
    // returns true if logo is displayed in the home page
    public boolean validateLogo() {
        return logo.isDisplayed();
    }
    // sets username in the username Field
    public void setUsername(String userName) {
        userNameTxtFld.sendKeys(userName);
    }
    // sets password in the password Field
    public void setPassword(String password) {
        passwordTxtFld.sendKeys(password);
    }
    // click the Login Button
    public void clkLogin() {
        loginBtn.click();
    }
    // returns the text from the Secured Login Area
    public String getLoginText() {
        return loginInText.getText();
    }
    // click the Logout Button
    public void clkLogout() {
        logOutBtn.click();
    }
    // returns the text from the Secured Logout Area
    public String getLogoutText() {
        return logOutText.getText();
    }


}
