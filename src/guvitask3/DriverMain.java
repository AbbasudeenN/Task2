package guvitask3;

import java.util.Scanner;
//interface 
 interface Taxable {
	
	double salesTax=7;
	double incomeTax =10.5;
	
	abstract void calTax();

}




class Employee implements Taxable{
	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	//Constructor
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}


	//tax calculate
	public void calTax() {
		
		double yearlyTax= empSalary *(incomeTax/100);
		System.out.println("Employee ID : "+empId + " Name : "+empName + " Salary : "+empSalary);
		System.out.println("Yearly Income Tax is : " +yearlyTax );
		
	}
}




class Product implements Taxable{
	private int pId;
	private double price;
	private int quantity;
	
	
	//constructor
      public Product(int pId, double price, int quantity) {
		super();
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}



		//tax calculate
      public void calTax() {
		
		double unitPrice=price/quantity;
		double unitTax= unitPrice *(salesTax/100);
		System.out.println("ProductID : "+pId + " ProductPrice : "+price + " ProductQuantity : "+quantity);
		System.out.println("Product Sales Tax is : " +unitTax );
		
	}
}





public class DriverMain{
		
		public static void main(String[] args) {
			
			Scanner userInput = new Scanner(System.in);
			
			//Employee class object
			System.out.println("Enter Employee Details ID,Name,Salary");
			int empId = userInput.nextInt();
			String empName = userInput.next();
			double empSalary = userInput.nextDouble();
			
			Employee empObject = new Employee(empId,empName,empSalary);
			empObject.calTax();
			
			
			//Product class object
			System.out.println();
			System.out.println("Enter Product Details ID,Price,Quantity");
			int prdId = userInput.nextInt();
			double prdPrice = userInput.nextDouble();
			int prdQuantity = userInput.nextInt();
			
			Product productObject = new Product(prdId ,prdPrice,prdQuantity );
			productObject.calTax();
			
			userInput.close();
			
		}
	}

