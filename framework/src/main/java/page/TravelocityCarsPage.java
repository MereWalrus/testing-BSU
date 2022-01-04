package page;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TravelocityCarsPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getRootLogger();

    private By searchButtonLocator = By.xpath("//button[text()='Search']");

    private By locationButtonLocator = By.xpath("//button[@aria-label='Pick-up']");

    private By locationInputLocator = By.xpath("//input[@id='location-field-locn']");

    protected TravelocityCarsPage(WebDriver driver) {
        super(driver);
    }

    public TravelocityCarsResultsPage searchCars() {
        findElementByLocatorAndClick(searchButtonLocator);
        LOGGER.log(Level.INFO, "Searching...");
        return new TravelocityCarsResultsPage(driver);
    }

    public TravelocityCarsPage enterLocation(String location) {
        findElementByLocatorAndClick(locationButtonLocator);
        findElementByLocatorAndClick(locationInputLocator).sendKeys(location + Keys.ENTER);
        LOGGER.log(Level.INFO, "Location [{}] is entered", location);
        return this;
    }
}
