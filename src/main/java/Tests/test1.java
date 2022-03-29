package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

public static void main (String[] args)
   {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sauli\\Here\\src\\main\\resources\\Drivers\\chromedriver.exe");

    // Initialize browser
    WebDriver driver = new ChromeDriver();

    // Open page
    driver.get("https://es-la.facebook.com/");
    // Maximize page
    driver.manage().window().maximize();
    driver.close();
   }
}
