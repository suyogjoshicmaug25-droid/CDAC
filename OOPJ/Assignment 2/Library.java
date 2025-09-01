class Book1{
	private int bookId;
	private String title;
	private String author;
	
	public Book1(int bookId,String title,String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	//setter function
	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	//getter function
	public int getBookId(){
		return bookId;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
}
class Library{
	private String libraryName;
	static private int totalBooks;
	
	public Library(String libraryName){
		this.libraryName = libraryName;
	}
	
	public void addBook(Book1 b){
		totalBooks++; 
		System.out.println("Book added: "+b.getTitle()+" by "+b.getAuthor());
	}
	public void displayTotalBooks(){
		System.out.println("Total Books in "+libraryName+" : "+totalBooks);
	}
	
	public static void main(String[] args){
		Library lib = new Library("City Library");
		//create books
		Book1 b1 = new Book1(101,"Java Programming","James Gosling");
		Book1 b2 = new Book1(102,"Effective Java","Joshua Bloch");

        // Add books to library
        lib.addBook(b1);
        lib.addBook(b2);

        // Display total books
        lib.displayTotalBooks();
	}
}
/*
D:\CDAC\OOPJ\Assignment 2>javac Library.java
D:\CDAC\OOPJ\Assignment 2>java Library

Book added: Java Programming by James Gosling
Book added: Effective Java by Joshua Bloch
Total Books in City Library : 2
*/