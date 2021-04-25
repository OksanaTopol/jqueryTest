import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    static ChromeDriver driver;

    public static ChromeDriver getDriver() {
        return driver;
    }


    public static void up() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void down() {
        driver.close();
        driver.quit();
    }

    public static void load(String url) {
        driver.get("https://jqueryui.com/demos");
    }

    public static String getPopUpText() {
        return driver.switchTo().alert().getText();
    }

    public static Alert getPopUp() {
        return driver.switchTo().alert();
    }

    public static void acceptPopUp() {
        driver.switchTo().alert().accept();
    }

}
