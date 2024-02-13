import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserTest {

	public static void main(String[] argsl) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\bhu_trainings\\chrome-win32\\chrome-win32\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("http//www.google.com");
				}
}
