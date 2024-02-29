package guvitask2;


import java.util.Scanner;

class Person{
	
	//instance variable
	int age  ; String name;
	
	//constructor
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	//instance method
	void display() {
		System.out.println("Name : "+ name + "  Age : "+age);
	}
}

public class Ques_1 {

	public static void main(String[] args) {
		
		int age=18;
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Type your Name ");
		String name = input.nextLine();//input 
		input.close();
		
		//object
		Person obj = new Person(name ,age);
		obj.display();

	}

}

