package package1;
import org.junit.Test;
import pages.HomePage;
import pages.NewArrivals;
import pages.ProductNoTwo;
import pages.VerifyCart;

public class Smoke extends BaseTest{
	HomePage hp;
	NewArrivals na;
	ProductNoTwo pt;
	VerifyCart vc;

	@Test
	public void expressTest() {
		vc=new VerifyCart(driver);
		hp=new HomePage(driver);
		pt=new ProductNoTwo(driver);
		
		hp.goToNewArrivals();
		na=new NewArrivals(driver);
		na.product1();
		na.product1size();
		na.addingProduct1ToCart();
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vc.getTheCartValue1();
		na.backtoPreviousPage();
		
		pt.getProduct2();
		pt.getWaistOfProduct2();
		pt.getLengthOfProduct2();
		pt.addingProduct2toCart();
		pt.clicktoCart();
		pt.seeThePriceForAllProduct();
		pt.removeOneProduct();
		pt.seeThePriceAfterRemovingOneProduct();
		pt.priceComparing();
		vc.getTheCartValue2();
		vc.cartCompare();	
	}
}
