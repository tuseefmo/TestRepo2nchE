package deliveryConfiguration_Tuseef.step_def;

import deliveryConfiguration_Tuseef.utilities.ConfigurationReader;
import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;
public class Hooks {
    // private static final Logger logger= LogManager.getLogger(Hooks.class);
    @Before
    public void setup(){
        System.out.println("::: Starting Automation:::");
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverFactory.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png", scenario.getName());

        }
        //DriverFactory.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");

    }
        // DriverFactory.closeDriver();
    }