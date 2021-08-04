package deliveryConfiguration_Tuseef.step_def;

import deliveryConfiguration_Tuseef.pages.MyReports;
import deliveryConfiguration_Tuseef.utilities.BrowserUtils;
import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyReports_StepDef {

    MyReports myReports = new MyReports();

    @Given("I am on the main web page")
    public void iAmOnTheMainWebPage() {
        String expectedTitle="Client Center";
        String actualTitle=DriverFactory.getDriver().getTitle();
        BrowserUtils.wait(7);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("I click File Center module")
    public void i_click_File_Center_module() {
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(10);
        myReports.FileCenter.click();
    }

    @Then("I make sure that there is no {string} module")
    public void iMakeSureThatThereIsNoModule(String arg0) throws InterruptedException {
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        DriverFactory.getDriver().navigate().refresh();

        List<WebElement> myReportsModule=DriverFactory.getDriver().findElements(By.xpath("//span[text()='My Reports']"));
        if (myReportsModule.size()==0){
            System.out.println("There is no My Reports Module..Passed!!!");
        }else{
            System.out.println("My Reports Module shows up before impersonating...Failed!!!");
        }
    }

    @Then("I click the user icon")
    public void iClickTheUserIcon() throws InterruptedException {

        BrowserUtils.wait(7);
        myReports.icon.click();
        System.out.println("T icon");
    }

    @And("I click the {string} link")
    public void iClickTheLink(String startImp) throws InterruptedException {
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        myReports.startImp.click();
    }

    @Then("I add {string} as a username in the field")
    public void iAddAsAUsernameInTheField(String arg0) throws InterruptedException {
        BrowserUtils.wait(7);
        Thread.sleep(5000);
        myReports.box.sendKeys("Bob Backline");
    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) throws InterruptedException {
        BrowserUtils.wait(7);
        Thread.sleep(5000);
        myReports.startImp2.click();
    }

    @Then("I click on the My Reports button")
    public void iClickOnTheMyReportsButton() {
        BrowserUtils.wait(8);
        myReports.Myreports.click();
    }

    @And("I am in the Myreports module")
    public void iAmInTheMyreportsModule() {
        BrowserUtils.wait(10);
        if (myReports.Myreports.isDisplayed()) {
            System.out.println("PASSED!!My Reports Module is here");
        } else {
            System.out.println("FAILED");
        }

    }
}





