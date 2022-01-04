package page;

import org.openqa.selenium.WebDriver;

public class TravelocityCarsResultsPage extends AbstractPage{
    protected TravelocityCarsResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized(String location) {
        return driver.getCurrentUrl().contains(location);
    }
}
