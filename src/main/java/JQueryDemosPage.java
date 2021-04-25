import org.openqa.selenium.By;

public class JQueryDemosPage extends Browser {

    private String interactions = "//h3[contains(text(), 'Interactions')]";
    private String widgets = "//h3[contains(text(), 'Widgets')]";
    private String effects = "//h3[contains(text(), 'Effects')]";
    private String utilities = "//h3[contains(text(), 'Utilities')]";
    private String spinnerLink = "//a[contains( text(),'Spinner')]";
    private String autocompleteLink = "//a[contains( text(),'Autocomplete')]";

    public boolean areInteractionsDisplayed() {
        return getDriver().findElement(By.xpath(interactions)).isDisplayed();
    }

    public boolean areWidgetsDisplayed() {
        return getDriver().findElement(By.xpath(widgets)).isDisplayed();
    }

    public boolean areEffectsDisplayed() {
        return getDriver().findElement(By.xpath(effects)).isDisplayed();
    }

    public boolean areUtilitiesDisplayed() {
        return getDriver().findElement(By.xpath(utilities)).isDisplayed();
    }

    public void clickSpinner() {
        getDriver().findElement(By.xpath(spinnerLink)).click();
    }

    public void clickAutocomplete() {
        getDriver().findElement(By.xpath(autocompleteLink)).click();
    }
}
