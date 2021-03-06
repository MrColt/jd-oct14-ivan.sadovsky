package magazine;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

import magazine.justconstructor.Product;
import magazine.serviceclass.Date;
import magazine.serviceclass.Shop;
import magazine.serviceclass.ShopUI;
import magazine.serviceclass.TypeOfProducts;
import magazine.serviceclass.mainclass.Stock;

public class DemoShop {

	public static void main(String[] args) throws Exception {

		SplashScreen splash = SplashScreen.getSplashScreen();
		Thread.sleep(3000);

		Graphics2D g = splash.createGraphics();
		g.setColor(Color.BLACK);
		g.drawString("Loading. Please wait..", 70, 420);
		splash.update();
		Thread.sleep(2000);

		splash.close();

		Date date = new Date();
		Stock stock = new Stock();
		Shop productshop = new Shop(date, stock);

		Product p = new Product();
		p.setName("Apple");
		p.setBrand("Macintosh");
		p.setType(TypeOfProducts.FRUIT);
		p.setPrice(3);
		stock.addMoreThanOne(p, 300);

		Product p1 = new Product();
		p1.setName("Pear");
		p1.setBrand("Leven");
		p1.setType(TypeOfProducts.FRUIT);
		p1.setPrice(5);
		stock.addMoreThanOne(p1, 200);
		
		Product p2 = new Product();
		p2.setName("Mandarin");
		p2.setBrand("123");
		p2.setType(TypeOfProducts.VEGETABLES);
		p2.setPrice(2);
		stock.addMoreThanOne(p2, 400);
		
		ShopUI ui = new ShopUI(productshop, stock);

	}

}
