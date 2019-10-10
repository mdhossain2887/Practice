package pages;
import org.openqa.selenium.WebDriver;
import Repository.ObjectRepo;
import utility.Shared;

public class NewArrivals {
	WebDriver driver;
	public NewArrivals(WebDriver driver) {
		this.driver=driver;
	}

	public void product1() {
		Shared.clickProduct1(driver.findElement(ObjectRepo.product1xpath));
	}
	public void product1size() {
		Shared.selectSizeforProduct1(driver.findElement(ObjectRepo.product1sizexpath));
	}
	public void addingProduct1ToCart() {
		Shared.clickAddToCart1(driver.findElement(ObjectRepo.addtocart1xpath));
	}
	public void backtoPreviousPage() {
		Shared.navigateBack(driver);
	}
}
