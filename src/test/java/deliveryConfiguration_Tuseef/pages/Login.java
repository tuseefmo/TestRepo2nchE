package deliveryConfiguration_Tuseef.pages;


import deliveryConfiguration_Tuseef.utilities.BrowserUtils;
import deliveryConfiguration_Tuseef.utilities.ConfigurationReader;
import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

    private static final Logger logger=Logger.getLogger(Login.class);

    @FindBy(id = "Username")
    private WebElement userName;

    @FindBy(id = "nextBtn")
    private WebElement NextButton;

    @FindBy(xpath="//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement sign;

    @FindBy(id="idSIButton9")
    private WebElement yesButton;




    /*
    @FindBy(xpath="//span[@class='MuiButtonBase-root MuiTableSortLabel-root jss108 MuiTableSortLabel-active']")
    private WebElement sorting;
    //xpath syntax = "//div@class='paste your locator here']"

    @FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input MuiAutocomplete-input jss206 MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[.='Canada Beauty POS Monthly - FF Profile']")
    //xpath="//div[.='yourtext']"
    public WebElement canada;

@FindBy(xpath = "//table[@aria-labelledby='tableTitle']/tbody/tr[1]/td[5]/span/span/input")
    public WebElement firstRD;

    @FindBy(xpath = "//table[@aria-labelledby='tableTitle']/tbody/tr[2]/td[5]/span/span/input")
    public WebElement secondRD;
     */



    public void setLogin() {

    String userNameValue= ConfigurationReader.getProperty("userNameValue");
    String passwordValue= ConfigurationReader.getProperty("passwordValue");
        userName.sendKeys(userNameValue);
        BrowserUtils.wait(5);
    NextButton.click();
        BrowserUtils.wait(5);
        password.sendKeys(passwordValue);
        BrowserUtils.wait(5);
        sign.click();

        BrowserUtils.wait(5);
        yesButton.click();

    }



}

