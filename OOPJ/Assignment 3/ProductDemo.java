//28. Online Shopping Cart System
import java.util.ArrayList;
import java.util.List;
class Product{
	private int productId;
	private String name;
	private double price;
	
	//Constructor
	public Product(int productId,String name,double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	//getter methods
	public int getProductId(){
		return productId;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	//Setter methods 
	public void setProductId(int productId){
		this.productId=productId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
}
abstract class CartItem{
	abstract public double calculateTotalPrice();
}

interface Discountable{
	public void applyDiscount(double percentage);
}
class Cart extends CartItem implements Discountable{
	private List<Product> products = new ArrayList<>();
	
	//Add product to cart
	public void addProduct(Product p){
		products.add(p);
	}
	
	//Apply discount to a specific product
	@Override
	public void applyDiscount(double percentage){
		if(!products.isEmpty()){
			Product p = products.get(0);
			double discountedPrice = p.getPrice() - (p.getPrice()*percentage/100);
			p.setPrice(discountedPrice);
			System.out.println("Applying "+percentage+" % discount to "+p.getName());
		}
	}
	
	//Calculate total price of all products
	@Override
	public double calculateTotalPrice(){
		double total = 0;
		for(Product p: products){
			total += p.getPrice();
		}
		return total;
	}
	
}
public class ProductDemo{
	public static void main(String[] args){
		//Create products
		Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);
		
		// Create cart and add products
        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
		
		// Apply discount to Laptop
        cart.applyDiscount(10);

        // Display total price
        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
	}
}