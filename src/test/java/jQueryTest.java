import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class jQueryTest {

    @BeforeMethod
    public void launchBrowser() {
        Browser.up();
        Browser.load("https://jqueryui.com/demos");
    }

    @AfterMethod
    public void browserQuit() {
        Browser.down();
    }

    @Test(priority = 1)
    public void leftMenuTest() {
        JQueryDemosPage jQueryDemosPage = new JQueryDemosPage();
        assertTrue(jQueryDemosPage.areInteractionsDisplayed(), "Interactions item is not displayed");
        assertTrue(jQueryDemosPage.areWidgetsDisplayed(), "Widgets item is not displayed");
        assertTrue(jQueryDemosPage.areEffectsDisplayed(), "Effects item is not displayed");
        assertTrue(jQueryDemosPage.areUtilitiesDisplayed(), "Utilities item is not displayed");
    }

    @Test(priority = 2)
    void spinnerGetValueTest() {

        String value = "13";
        JQueryDemosPage jQueryDemosPage = new JQueryDemosPage();
        jQueryDemosPage.clickSpinner();
        JQuerySpinnerPage jQuerySpinnerPage = new JQuerySpinnerPage();

        jQuerySpinnerPage.insertValue(value);

        String popUpText = Browser.getPopUpText();
        Browser.acceptPopUp();
        assertEquals(popUpText, value, "Pop up contains wrong value");

    }

    @Test(priority = 3)
    void autocompleteTagFieldValueTest() {

        String value = "A";
        String displayedValue = "Asp";
        JQueryDemosPage jQueryDemosPage = new JQueryDemosPage();
        jQueryDemosPage.clickAutocomplete();
        JQueryAutocompletePage jQueryAutocompletePage = new JQueryAutocompletePage();

        jQueryAutocompletePage.insertTag(value);
        jQueryAutocompletePage.selectAsp();
        String actual = jQueryAutocompletePage.getTagsValue();
        assertEquals(actual, displayedValue, "Tags Field contains wrong value");
    }
}
