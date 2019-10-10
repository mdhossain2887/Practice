package pages;
import org.openqa.selenium.WebDriver;
import Repository.ObjectRepo;
import utility.Shared;
public class VerifyCart {
	
	WebDriver driver;
	public VerifyCart(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyCart() {
		Shared.verifyCart(driver.findElement(ObjectRepo.cartxpath));
	}
	
	public int  getTheCartValue1() {
		int velu1=Shared.verifyCart(driver.findElement(ObjectRepo.cartxpath));
		return velu1;
	}
	public int  getTheCartValue2() {
		int velu2=Shared.verifyCart(driver.findElement(ObjectRepo.cartxpath));
		return velu2;
	}
	public void cartCompare() {
		Shared.cartCompare(getTheCartValue1(), getTheCartValue2());
	}	
}
