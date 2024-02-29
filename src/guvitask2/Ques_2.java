package guvitask2;

import java.util.Scanner;

//Product class
class Product{
	
	//instance variable
	int pid ,quantity;
	double price ;
	
	//constructor
	Product(int pid , double price ,int quantity ){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
   }
	
	//getter method
	public int getPid() { 
		return pid;
		}
	public double getPrice() { 
		return price;
		}
	public int getQuantity() { 
		return quantity;
		}
}


 class XYZ {
	
	Product ProductList[]  = new Product[5];
	
	//array of products
	void userInput() {
			
			Scanner input = new Scanner(System.in);
			for(int i=0;i<ProductList.length;i++)
			{
				System.out.println("Enter your product details " + (i+1));
				int productId=input.nextInt();//input from user for each product
				
				double productPrice=input.nextDouble();
				
				int productQuantity=input.nextInt();
				System.out.println();
			    ProductList[i]=new Product(productId,productPrice,productQuantity);    
			   	  
			}
			input.close();
	}
	
	double totalValue() 
	{
		double totalAmount = 0;
		for (Product prd:ProductList) 
		{
			totalAmount+=prd.price*prd.quantity;
		}
		return totalAmount;
	}
	
	int higherPid()
	{
		double higherPrice = 1;
		int higherPid = 0;
		
		for (Product prd:ProductList)
		{
			if(prd.getPrice()>higherPrice)
			{
				higherPrice=prd.getPrice();
				higherPid = prd.getPid();
			}
		}
		return higherPid;
	}
 }
public class Ques_2{	
      public static void main(String[] args) {
		
          XYZ obj = new XYZ();
	    obj.userInput();//for product details
		double totalAmount = obj.totalValue();//Total amount of all products
		int highValue = obj.higherPid(); //highest product id
		
		System.out.println("Higher Price ID : "+highValue);
		System.out.println("Total Amount : "+totalAmount);

	}
}
