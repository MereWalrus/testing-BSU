import model.Location;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.TravelocityCarsResultsPage;
import page.TravelocityHomePage;
import service.LocationCreator;
import util.CommonConditions;

public class TravelocityCarsPageSearchFormTest extends CommonConditions {
    @Test
    public void findCarsTest() {
        Location testLocation = LocationCreator.locationsFromProperty();
        TravelocityHomePage homePage = new TravelocityHomePage(driver);
        TravelocityCarsResultsPage resultsPage = homePage.openCarsPage()
                                                         .enterLocation(testLocation.getPickupLocation())
                                                         .searchCars();

        Assert.assertTrue(resultsPage.isInitialized(testLocation.getPickupLocation()));
    }
}
