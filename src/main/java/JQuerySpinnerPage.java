import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class JQuerySpinnerPage extends Browser {

    private String field = "//*[@id='spinner']";
    private String getValueButton = "//*[@id='getvalue']";

    public void insertValue(String text) {
        Actions action = new Actions(getDriver());

        for (int i = 0; i < 31; i++) {
            action.sendKeys(Keys.TAB).build().perform();
        }
        for (int i = 0; i < 13; i++) {

            action.sendKeys(Keys.UP).build().perform();
        }

        for (int i = 0; i < 3; i++) {
            action.sendKeys(Keys.TAB).build().perform();
        }
        action.sendKeys(Keys.ENTER).build().perform();

        System.out.println();
    }
}
