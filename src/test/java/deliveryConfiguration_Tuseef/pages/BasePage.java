package deliveryConfiguration_Tuseef.pages;

import deliveryConfiguration_Tuseef.utilities.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

}
