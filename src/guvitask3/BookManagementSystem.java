package guvitask3;

import java.util.Scanner;
class Book{
	
	// instance attributes
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	
	
	//constructor
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;//initially books available 
	}

	
	
	//getter and setter

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}




class Library{
	
	private Book[] books;
	private int size = 0;
	
	//constructor
	public Library() {
		this .books = new Book[5];
	}
		
	//adding books	
	public void addBook(Book book) {
		if(size<books.length) {
		books[size]= book;
		size++;
		}
	}
	
	//removing books
	public void replaceBook(int bookId) {
		
		for(Book book:books) {
			if (book.getBookId()==bookId) {
				book.setAvailable(false);	
			}
		}
	}
	
	
	//search book
	public void searchBook(int bookId) {
		
		for(Book book:books) {
			if (book.getBookId()==bookId) {
				System.out.println("Book Found - " + " Title: "+book.getTitle());
			}
		}
		
	}
	
	//displaying book details
	public void displayBooks() {
		
		for(Book book:books) {
			System.out.println("BookID: " + book.getBookId()+ " Title: " + book.getTitle()+" AuthorName: " + book.getAuthor()+" IsAvailable: "+book.isAvailable());	
		}
		
	}	
}





public class BookManagementSystem {

	public static void main(String[] args ) {
  	  
  	  //object
  	  Library libraryobj = new Library();
  	  //Input         
  	  Scanner userInput = new Scanner(System.in);
  	  int userSize = 5,bookId;
  	  String bookName,bookAuthor;
  	  for(int i = 0;i<userSize ; i++) {
  		  
  		  System.out.println("Enter the Book Id , Title , AuthorName ,");
  		  bookId = userInput.nextInt();
  		  bookName = userInput.next();
  		  bookAuthor = userInput.next();
  		  Book book=new Book(bookId ,bookName ,bookAuthor);
  		  libraryobj.addBook(book);  
  	  }
  	  
  	  System.out.println();
  	  System.out.println("Enter the BookId to remove");
  	  bookId = userInput.nextInt();
  	  libraryobj.replaceBook(bookId);
  	  
  	  System.out.println();
  	  System.out.println("Enter the BookId to search");
  	  bookId = userInput.nextInt();
  	  libraryobj.searchBook(bookId);
  	  
  	  
  	  System.out.println();
  	  System.out.println("All Book Details:-");
  	  libraryobj.displayBooks();//output
  	  userInput.close();

}

}


