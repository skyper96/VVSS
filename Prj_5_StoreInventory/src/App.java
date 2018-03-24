

import java.io.IOException;

import model.Product;
import controller.StoreController;
import ui.StoreUI;

public class App {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StoreController c=new StoreController();
		c.readProducts("products.txt");

		StoreUI u = new StoreUI(c);
		u.run();
	}
}
