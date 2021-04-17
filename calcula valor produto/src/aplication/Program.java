package aplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> lista = new ArrayList<>();
  
		 System.out.println("Enter the number of products: ");
		 int n = sc.nextInt();
		 
		 for (int i=1; i<=n;i++) {
			 System.out.println("Product " + i +" Data");
			 System.out.println("1 - Common");
			 System.out.println("2 - Used");
			 System.out.println("3 - Imported");
			 int ch = sc.nextInt();
			 
			 System.out.println("Name: ");
			 sc.nextLine();
			 String name = sc.nextLine();
			 System.out.println("Price: ");
			 Double price = sc.nextDouble();
			  if (ch == 2) {
				  System.out.print("Manufacture Date (DD/MM/YYYY):");
				  String date = sc.next();
				  lista.add(new UsedProduct(name,price,date));
			  }else if (ch == 3) {
				  System.out.println("custonFee : ");
				  Double custonFee = sc.nextDouble();
				  lista.add(new ImportedProduct(name, price,custonFee));
			  }else 
			 
				  lista.add(new Product(name,price));
			  
		  
		 }
		 
		  System.out.println("Products: ");
		  for(Product Product : lista) {
				System.out.println(Product.getName()  + " - R$: " + Product.priceTag());
			}
		sc.close();
	}

}
