package deliveryConfiguration_Tuseef.step_def;

import deliveryConfiguration_Tuseef.pages.Logout;
import deliveryConfiguration_Tuseef.utilities.BrowserUtils;
import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Driver;

public class Logout_StepDef {

    Logout logout=new Logout();

    @When("I click the Icon on top right side")
    public void iClickTheIconOnTopRightSide() {
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(3);
        logout.Bbutton.click();
    }

    @And("I select {string}")
    public void iSelect(String arg0) {
        BrowserUtils.wait(7);
        logout.Signout.click();
    }

    @Then("I should be able to logout")
    public void iShouldBeAbleToLogout() {
        BrowserUtils.wait(3);
        String actualT= DriverFactory.getDriver().getTitle();
        String ExpectedT="Sign in";

        Assert.assertEquals(ExpectedT,actualT);
        BrowserUtils.wait(3);

        System.out.println("Actual Title is : " + actualT);
        System.out.println("Expected Title is : " + ExpectedT);

        if(actualT.equals(ExpectedT)) {
            System.out.println("I already logged out!");
        }else{
            System.out.println("Something is wrong, did not log out");
        }

    }
}
