import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main (String [] args){

        EdgeBrowserTesting obj = new EdgeBrowserTesting();
        obj.edgeTest();

    }

    public void edgeTest () {

        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();


    }
}
