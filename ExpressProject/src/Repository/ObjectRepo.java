package Repository;
import org.openqa.selenium.By;
public class ObjectRepo {
	
	public static By newarrivalsLinkText=By.linkText("NEW ARRIVALS");
	public static By mensnewarrivalsxpath=By.xpath("/html/body/div[2]/header/div[2]/div/nav/ul/li[4]/ul/li[1]/a");
	public static By product1sizexpath=By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[5]/div/div[2]/button/span");
	public static By addtocart1xpath=By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button");
	public static By product2xpath=By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/span[5]/span[1]/a[3]/span/img");
	public static By product2waistxpath=By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[5]/div/div[3]/button/span");
	public static By product2lengthxpath=By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div[3]/button/span");
	public static By addtocart2xpath=By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button");
	public static By cartxpath=By.xpath("/html/body/div[1]/section[1]/div/header/div[2]/div/div[2]/div[3]/a/span");
	public static By product1xpath=By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/span[3]/span[1]/a[3]/span/img");
	public static By product1removexpath=By.xpath("//*[@id=\"remove-btn-0\"]");
	public static By priceAfterRemovingOneproduct=By.xpath("public static By product1removexpath=By.xpath(\"//*[@id=\\\"remove-btn-0\\\"]\");");
	public static By priceBeforeRemovingOneproduct=By.cssSelector("#content > section > section.grid--direction-column.grid--justify-start.grid--wrap.grid__column.grid__col-sm-5.grid__col-xs-12.grid__col-lg-4.grid--order-2 > div > section:nth-child(1) > div:nth-child(2) > div > div._2f7ll > div._30ZF9._3aVVK > span._3OBMm.bodyPrimaryActive");

}
