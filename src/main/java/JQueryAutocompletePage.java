import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class JQueryAutocompletePage extends Browser {

    private String tagsField = "//input[@id='tags']";

    public void insertTag(String text) {
        getDriver().switchTo().frame(0);
        getDriver().findElement(By.xpath(tagsField)).sendKeys(text);
        getDriver().switchTo().parentFrame();
    }

    public void selectAsp() {
        Actions action = new Actions(getDriver());
        for (int i = 0; i < 4; i++) {
            action.sendKeys(Keys.DOWN).build().perform();
        }
        action.sendKeys(Keys.ENTER).build().perform();
    }

    public String getTagsValue() {
        getDriver().switchTo().frame(0);
        String value = getDriver().findElement(By.xpath(tagsField)).getAttribute("value");
        getDriver().switchTo().parentFrame();
        return value;
    }
}
