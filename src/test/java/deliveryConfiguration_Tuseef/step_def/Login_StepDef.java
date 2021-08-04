package deliveryConfiguration_Tuseef.step_def;

import deliveryConfiguration_Tuseef.pages.Login;
import deliveryConfiguration_Tuseef.utilities.BrowserUtils;
import deliveryConfiguration_Tuseef.utilities.ConfigurationReader;
import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDef {

    Login login = new Login();

    @Given("I am on the website")
    public void i_am_on_the_website() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(5);

    }

    @When("I enter the correct credentials")
    public void i_enter_the_correct_credentials() {

        login.setLogin();
    }

    @Then("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {

        String expectedTitle = "Client Center";
        //BrowserUtils.waitVisibilityOf(DriverFactory.getDriver().findElement(By.xpath("//title")));
        BrowserUtils.wait(1);
        Assert.assertEquals("Title verification is failed!!!", "Client Center", DriverFactory.getDriver().getTitle());
    }



}



    /*
    @Given("I am on the search box")
    public void iAmOnTheSearchBox() {
        System.out.println("I am on the search box");
        BrowserUtils.wait(3);
    }
    @When("I search in as {string}")
    public void iSearchInAs(String Canada) {
        BrowserUtils.wait(3);
        login.searchBox.sendKeys("Canada"+ Keys.ENTER);

    }

    @Then("I should verify the result shows Canada data sources")
    public void iShouldVerifyTheResultShowsCanadaDataSources() {
        BrowserUtils.wait(3);
        String actual=  login.canada.getText();
        System.out.println(actual);
        BrowserUtils.wait(3);
        String expected="Canada Beauty POS Monthly - FF Profile";
        Assert.assertEquals(expected,actual);

    }


    @When("I view the first Run Daemon checkbox")
    public void iViewTheFirstRunDaemonCheckbox() {
        BrowserUtils.wait(3);
        login.firstRD.isSelected();
        BrowserUtils.wait(3);
        
    }

    @Then("I should verify that the first checkbox is selected")
    public void iShouldVerifyThatTheFirstCheckboxIsSelected() {
        BrowserUtils.wait(3);
        if(login.firstRD.isSelected()){
            System.out.println("1st checkbox is selected");
        }else{
            System.out.println("1st checkbox is NOT selected");}
        
    }

    @And("I click the second Run Daemon button to uncheck the box")
    public void iClickTheSecondRunDaemonButtonToUncheckTheBox() {
        BrowserUtils.wait(3);
        login.secondRD.click();
        
    }

    @Then("I should verify that second Run Daemon check box is selected")
    public void iShouldVerifyThatSecondRunDaemonCheckBoxIsSelected() {
        BrowserUtils.wait(3);
        if (!login.secondRD.isSelected()) {
            System.out.println("2nd checkbox is NOT selected");
        }else{
            System.out.println("2nd checkbox is selected");
        }


     */

