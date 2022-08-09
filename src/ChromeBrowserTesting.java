import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main (String [] args) {
        ChromeBrowserTesting obj = new ChromeBrowserTesting();
        obj.chromtest();
    }

    public void chromtest (){
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); // creating object of chrome driver
        driver.get(baseUrl); // opening the browser using obj from above in intelliJ
        driver.manage().window().maximize(); // maximising the browser
        String title = driver.getTitle();
        System.out.println(title);
        driver.close(); // closing browser
    }
}
