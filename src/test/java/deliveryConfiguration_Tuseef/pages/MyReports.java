package deliveryConfiguration_Tuseef.pages;

import deliveryConfiguration_Tuseef.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyReports extends BasePage{

    @FindBy(xpath ="//a[@title='File Center']")
    public WebElement FileCenter;

    @FindBy(xpath = "//span[@class='MuiBadge-root']")
    public WebElement icon;

    @FindBy(xpath = "//div[text()='Start impersonating']")
    public WebElement startImp;

    @FindBy (xpath = "//input[@placeholder='add username']")
    public WebElement box;

    @FindBy (xpath = "//span[text()='Start Impersonating']")
    public WebElement startImp2;

    @FindBy(xpath ="//button[@value='reports']")
    public WebElement Myreports;

}