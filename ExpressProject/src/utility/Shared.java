package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Shared {
	WebDriver dr;
	
	 
	public Shared(WebDriver dr) {
	
		this.dr = dr;
	}
	public static void MouseOverToNewArrivals(WebDriver driver,WebElement ele, WebElement ele2) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		ele2.click();
	}
	public static void clickProduct1(WebElement ele) {
		ele.click();
	}
	public static void selectSizeforProduct1(WebElement ele) {
		ele.click();
	}
	public static void clickAddToCart1(WebElement ele) {
		ele.click();
	}
	public static void clickProduct2(WebElement ele) {
		ele.click();
	}
	public static void selectSizeforProduct2(WebElement ele) {
		ele.click();
	}
	public static void clickAddToCart2(WebElement ele) {
		ele.click();
	}
	
	public static void navigateBack(WebDriver dr) {
		dr.navigate().back();
	}
	public static int verifyCart(WebElement ele) {
		String cartvalue=ele.getText();
		int ctvalue=Integer.parseInt(cartvalue);
		return ctvalue;
	}
	public static void cartCompare(int value1, int value2) {
		if(value2>value1) {
			System.out.println("product number increased");
		}
		else {
			System.out.println("product number is not increased");
		}
	}
	public static void clickOntheCart(WebDriver dr, WebElement ele) {
		ele.click();
	}
	public static void removeaProductFromTheCart(WebDriver dr, WebElement ele) {
		ele.click();
	}
	public static int priceAfterSecondProductAdded (WebElement ele) { 
		String text=ele.getText();
		int price2 = 0;
		try {
			 price2=Integer.parseInt(text);
			
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		return price2;
		
	}
	public static int  priceAfterRemoving1Product(WebElement ele) {
		String text=ele.getText();
		int price1 = 0;
			try {
				 price1=Integer.parseInt(text);
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return price1;
	}
	
	
}
