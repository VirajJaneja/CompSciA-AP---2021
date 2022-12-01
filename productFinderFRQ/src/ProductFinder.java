import java.util.*;
public class ProductFinder {
	
	public static ArrayList<String> expensiveNewProducts(Product[] newProducts, Product[] existingProducts){
		ArrayList<String> results = new ArrayList<String>();
		Product mostExpensive = existingProducts[0];
		for(int k = 0; k<existingProducts.length;k++) {
			if(existingProducts[k].getPrice()>mostExpensive.getPrice())
				mostExpensive = existingProducts[k];
		}
		for(int i = 0; i<newProducts.length; i++) {
			if(newProducts[i].getPrice() > mostExpensive.getPrice()) {
				results.add(newProducts[i].getName());
			}
		}
		return results;
	//To be implemented in the exercise
	}

	
	// Do not run this until you are sure it works!!!
	public static void runProductFinderAcceptanceTest(){
		(new ProductFinderTester()).generateCasesAndRun();
	}

	public static void main(String[] args) {
		runProductFinderAcceptanceTest();

	}


}
