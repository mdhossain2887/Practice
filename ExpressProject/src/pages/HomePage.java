package pages;
import org.openqa.selenium.WebDriver;
import Repository.ObjectRepo;
import utility.Shared;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		
		
		this.driver=driver;
	}
	public void cl(){
		Shared s=  new Shared(driver);
		
	}

	public void goToNewArrivals() {
		
		Shared.MouseOverToNewArrivals(driver, driver.findElement(ObjectRepo.newarrivalsLinkText), driver.findElement(ObjectRepo.mensnewarrivalsxpath));
	}
}
// this is the edited line
