package package1;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;
	@BeforeClass
	public  static void openBrowser() {
		driver=new FirefoxDriver();
		driver.get("https://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public  static void QuitBrowser() {
		driver.quit();
	}
}
