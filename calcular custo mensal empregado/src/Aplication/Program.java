package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of employees:");
	int n = sc.nextInt();
	List<Employee> list = new ArrayList<>();
	
	for(int i=1;i <=n;i++) {
		System.out.println("Employee "+ i + " data:");
		System.out.println("Outsource (Y/N) ?");
		char  ch = sc.next().charAt(0);
		System.out.print("Name:");
		sc.nextLine();
		String name= sc.nextLine();
		System.out.print("Hours:");
		int hours = sc.nextInt();
		System.out.print("Value per Hour:");
		double valuePerHour = sc.nextDouble();
			if(ch == 'Y') {
				System.out.print("Additional Change:");
				double addChange = sc.nextDouble();
				list.add(new OutSourceEmployee(name,hours,valuePerHour,addChange));
				
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
			
	}
	System.out.println("Payment:");
	for(Employee emp : list) {
		System.out.println(emp.getName() + " - R$: " + emp.payment());
	}
	
	sc.close();
	
	}

}
