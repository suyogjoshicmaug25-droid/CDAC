class Customer{
	private String name;
	private String ticketType = "Normal";
	private static int totalTicketsSold;
	
	//Constructors
	public Customer(String name){
		this.name = name;
		totalTicketsSold++;
	}
	
	public Customer(String name,String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		totalTicketsSold++;
	}
	
	public static void printTotalTicketsSold(){
		System.out.println("Total Tickets Sold: "+totalTicketsSold);
	}
	
	public static void main(String[] args){
		Customer c1 = new Customer("Rahul");
		Customer c2 = new Customer("Pooja","Premium");
		Customer c3 = new Customer("Amit");
		
		System.out.println("Customer1: Name: "+c1.name+", Ticket: "+c1.ticketType);
		System.out.println("Customer2: Name: "+c2.name+", Ticket: "+c2.ticketType);
		System.out.println("Customer3: Name: "+c3.name+", Ticket: "+c3.ticketType);
		
		Customer.printTotalTicketsSold();
	}
}

/*
D:\CDAC\OOPJ\Assignment 2>javac Customer.java
D:\CDAC\OOPJ\Assignment 2>java Customer
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/