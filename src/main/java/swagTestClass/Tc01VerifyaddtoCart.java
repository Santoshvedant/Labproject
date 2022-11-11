package swagTestClass;

import org.testng.annotations.Test;

import demoHomePagepomclass.HomePagePomClass;

public class Tc01VerifyaddtoCart extends TestBaseClass
{
	@Test
	public void Addtocartsingle() {
		
		HomePagePomClass x=new HomePagePomClass(driver);
		x.clickAddToCartBagButton1();
	}
}
