package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
	Product product = new Product();
	System.out.println("Enter product data: ");
	System.out.print ("Name: ");
	product.name = sc.nextLine();
	System.out.print("Price: ");
	product.price = sc.nextDouble();
	System.out.print("Quantity in stock: ");
	product.quantity = sc.nextInt();
	
	System.out.println();
	System.out.println("Product data: ");

	System.out.println();
	System.out.print("Enter the number of products to be added in stock: ");
	int quantity = sc.nextInt(); 
	product.addproduct(quantity);
	
	System .out.println();
	System.out.println("Updata data: " + product);
	
	System.out.println();
	System.out.print("Enter the number of product to be removed from stock: ");
	quantity = sc.nextInt();
	product.removeproducts(quantity);
	
	System.out.println();
	System.out.print("Udate data: " + product);
	
	sc.close();
	
}
}
