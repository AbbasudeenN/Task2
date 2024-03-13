package guvitask4;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeNotWithinRangeException extends Exception{
	
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class NameNotValidException extends Exception{
	
	public NameNotValidException(String message) {
		super(message);
	}
}


class Student{
	
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	
	
	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	
	public void ageCheck()throws AgeNotWithinRangeException{
		
		if(age>=15 && age<=21) {
			System.out.println("student age is Vaild  ");
		}else {
			throw new AgeNotWithinRangeException("Age is not within range , should be 15 - 21");
		}
	}
	
	
	public void nameCheck()throws NameNotValidException{
		
		if(name.matches("a-zA-Z")) {
			System.out.println(" student Name is Vaild  ");
		}
		else {
			throw new NameNotValidException("Name is not vaild , should not contain numbers or special characters");
		}
	}
	
	public void display() {
		
		System.out.println("Student Details:-");
		System.out.println("Roll Number: " +rollNo +" Name: "+name+" Age: "+age+" Course: "+course);		
	}
}

public class Ques_1 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter RollNo , Name , Age and course");
		int rollNo=userInput.nextInt();
		String name = userInput.next();
		int age = userInput.nextInt();
		String course = userInput.next();
		
		Student stdObject = new Student(rollNo,name,age,course);
		
		//Age check
		try {
			stdObject.ageCheck();			
		} catch (AgeNotWithinRangeException e) {
			System.out.println();
			System.out.println(e.getMessage());
		
		//Name check
		try {
			stdObject.nameCheck();
			stdObject.display();
		} catch(NameNotValidException m) {
			System.out.println();
			System.out.println(m.getMessage());
		}
		userInput.close();
	}
	}
}
