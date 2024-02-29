package guvitask2;

import java.util.Scanner;

//Parent class
class Persons{
	
	//instance variable
	int age ; 
	String name ;
	
	//Parent class constructor
	Persons(String name , int age){
		this.name=name;
		this.age=age;
	}
}

//child class
class Employee extends Persons{
	
	int employeeId ; int salary;
	
	//child class constructor
	    Employee(String name , int age ,int employeeId ,int salary){
		super(name,age);//super 
		this.employeeId = employeeId;
		this.salary = salary;
		
	}
	void display() {
		
		System.out.println("Name : "+ name + "  Age : "+ age + "  Employee ID : "+employeeId + "  Salary : "+salary);
	}
}

//Main class
public class Ques_4 { 
	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name ,Age ,Emp ID and Salary ");
		String name=input.nextLine();//input 
		int age = input.nextInt();;
		int employeeId = input.nextInt();
		int salary = input.nextInt();
		input.close();
		
		//object for child class
		Employee obj = new Employee(name,age,employeeId ,salary);
		obj.display();//output

	}

}

