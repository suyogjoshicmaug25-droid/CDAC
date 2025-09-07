class Book{
	private int bookId;
	private String title;
	private String author;
	
	//Constructor
	public Book(int bookId,String title,String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	//getter methods
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

//interface 
interface Notifyable{
	void sendNotification(String messsage);
}

abstract class LibraryMember implements Notifyable{
	private int memberId;
	private String name;
	
	//Constructor
	public LibraryMember(int memberId,String name){
		this.memberId = memberId;
		this.name = name;
	}
	
	//Getters
	public int getMemberId(){
		return memberId;
	}
	
	public String getName(){
		return name;
	}
	
	//abstract method 
	abstract void borrowBook(Book book);
	
	// Default sendNotification implementation
    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}
// StudentMember with book limit = 3
class StudentMember extends LibraryMember {
    private int borrowedCount = 0;
    private static final int LIMIT = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedCount < LIMIT) {
            borrowedCount++;
            System.out.println("StudentMember " + getName() + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("StudentMember " + getName() + " has reached the borrowing limit!");
        }
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }
}

// FacultyMember with book limit = 5
class FacultyMember extends LibraryMember {
    private int borrowedCount = 0;
    private static final int LIMIT = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedCount < LIMIT) {
            borrowedCount++;
            System.out.println("FacultyMember " + getName() + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("FacultyMember " + getName() + " has reached the borrowing limit!");
        }
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "Data Structures", "Robert Lafore");
        Book b3 = new Book(3, "Operating Systems", "Silberschatz");
        Book b4 = new Book(4, "Database Systems", "Elmasri");

        // Create members
        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        // Student borrows 2 books
        student.borrowBook(b1);
        student.borrowBook(b2);
        System.out.println("StudentMember " + student.getName() + " borrowed " + student.getBorrowedCount() + " books");

        // Faculty borrows 4 books
        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);
        System.out.println("FacultyMember " + faculty.getName() + " borrowed " + faculty.getBorrowedCount() + " books");

        // Send notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
