package page;

import org.openqa.selenium.WebDriver;

public class TravelocityStaysResultsPage extends AbstractPage {
    protected TravelocityStaysResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized(String location, int adults) {
        return driver.getCurrentUrl().contains(location) &&
               driver.getCurrentUrl().contains("adults=" + adults);
    }
}
