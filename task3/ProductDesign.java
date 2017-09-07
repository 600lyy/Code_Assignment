package task3;

import java.util.TreeMap;

public class ProductDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnitTest.runTestItems();
	}
	
	public static void printProduct(Product product) {
		System.out.println(product.toString());
	}
}

abstract class Product {
	String mName;
	double mPrice;
	TreeMap<String, Object> mProductAttribute;
	
	public Product(String name, double price) {
		this.mName = name;
		this.mPrice = price;
		this.mProductAttribute = new TreeMap<>();
		this.addProductAttribute("price", mPrice);
	}
	
	public void addProductAttribute(String key, Object value) {
		this.mProductAttribute.put(key, value);
	}
	
	public String toString() {
		return "[Product=" + mName + "," + " Attributes: " + mProductAttribute + "]";
	}
	
	public int attributeSize() {
		return this.mProductAttribute.size();
	}
	
	public void printProduct() {
		System.out.println(this.toString());
	}
}


class Bike extends Product {
	public Bike(String name, double price, String color, int size) {
		super(name, price);
		this.mColor = color;
		this.mSize = size;
		this.addProductAttribute("color", mColor);
		this.addProductAttribute("size", 27);
	}
	
	String mColor;
	int mSize;
}

class KitchenTable extends Product {
	public KitchenTable(String name, double price) {
		super(name, price);
	}

}

class UnitTest {
	public static void runTestItems() {
		test_01_bike();
		test_02_table();
	}
	public static void test_01_bike() {
		Bike bike = new Bike("bike", 100, "Red", 27);
		TreeMap<String, Object> batch = new TreeMap<String, Object>();
		TreeMap<String, String> place  = new TreeMap<String, String>();
		place.put("County", "Sweden");
		place.put("City", "Stockholm");
		batch.put("Place", place);
		batch.put("Year", "2017");
		bike.addProductAttribute("Batch", batch);
		int attributeNumber = bike.attributeSize();
		if (4 == attributeNumber) {
			System.out.println("Passed---Test_01_bike");
			bike.printProduct();
		}
		else {
			System.out.println("Failled!!!---Test_01");
			bike.printProduct();
		}
	}
	
	public static void test_02_table() {
		KitchenTable table = new KitchenTable("kitchenTable", 12.5);
		TreeMap<String, Double> dimension = new TreeMap<String, Double>();
		dimension.put("width", 13.5);
		dimension.put("length", 17.5);
		dimension.put("height", 20.5);
		table.addProductAttribute("Dimension", dimension);
		int attributeNumber = table.attributeSize();
		if (2==attributeNumber) {
			System.out.println("Passed---Test_02_table");
			table.printProduct();
		}
		else {
			System.out.println("Failed!!!---Test_02_table");
			table.printProduct();
		}
	}
}
