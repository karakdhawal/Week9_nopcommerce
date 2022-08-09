import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTesting {

    public static void main (String [] args){

        FireFoxBrowserTesting obj = new FireFoxBrowserTesting();
        obj.firefoxtest();
    }

    public void firefoxtest () {

        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
