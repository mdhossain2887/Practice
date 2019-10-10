package pages;
import org.openqa.selenium.WebDriver;
import Repository.ObjectRepo;
import utility.Shared;

public class ProductNoTwo {
	WebDriver driver;
	int p1,p2;
	public ProductNoTwo(WebDriver driver) {
		this.driver=driver;
	}
	public void getProduct2() {
		Shared.clickProduct2(driver.findElement(ObjectRepo.product2xpath));
	}
	public void getWaistOfProduct2() {
		Shared.selectSizeforProduct2(driver.findElement(ObjectRepo.product2waistxpath));
	}
	public void getLengthOfProduct2() {
		Shared.selectSizeforProduct2(driver.findElement(ObjectRepo.product2lengthxpath));
	}
	public void addingProduct2toCart() {
		Shared.clickAddToCart2(driver.findElement(ObjectRepo.addtocart2xpath));
	}
	public void clicktoCart() {
		Shared.clickOntheCart(driver, driver.findElement(ObjectRepo.cartxpath));
	}
	public void seeThePriceForAllProduct() {
		 p1=Shared.priceAfterSecondProductAdded(driver.findElement(ObjectRepo.priceBeforeRemovingOneproduct));
	}
	public void seeThePriceAfterRemovingOneProduct() {
		 p2=Shared.priceAfterRemoving1Product(driver.findElement(ObjectRepo.priceAfterRemovingOneproduct));
	}
	public void priceComparing() {
		if(p2<p1) {
			System.out.println("The price has decreased");
		}
		else {
			System.out.println("The price is not decreased");
		}
	}
	public void removeOneProduct() {
		Shared.removeaProductFromTheCart(driver, driver.findElement(ObjectRepo.product1removexpath));
	}
}
