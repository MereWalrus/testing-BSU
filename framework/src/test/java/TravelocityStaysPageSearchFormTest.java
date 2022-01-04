import model.Group;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.TravelocityHomePage;
import page.TravelocityStaysResultsPage;
import service.GroupCreator;
import util.CommonConditions;

public class TravelocityStaysPageSearchFormTest extends CommonConditions {
    @Test
    public void maxNumberOfAdultsStaysPageTest() {
        Group group = GroupCreator.groupFromProperty();
        TravelocityHomePage homePage = new TravelocityHomePage(driver);

        homePage.openHomePage()
                .openRoomForm()
                .changeAdultsNumberByMaxValue()
                .clickRoomFormApplyButton();

        final int maxNumberOfAdults = Integer.parseInt(homePage.getNumberOfAdults());

        Assert.assertEquals(maxNumberOfAdults, group.getMaxNumberOfAdults());
    }

    @Test
    public void findStaysTest() {
        Group group = GroupCreator.groupFromProperty();
        TravelocityHomePage homePage = new TravelocityHomePage(driver);
        TravelocityStaysResultsPage resultsPage = homePage.openHomePage()
                                                          .enterDestination(group.getDestination())
                                                          .openRoomForm()
                                                          .addAdults(group.getNumberOfAdults(), group.getDefaultNumberOfAdults())
                                                          .clickRoomFormApplyButton()
                                                          .searchHotels();

        Assert.assertTrue(resultsPage.isInitialized(group.getDestination(), group.getNumberOfAdults()));
    }
}
