/*addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
*/
class Library{
	private int availableCopies;
	
	//addCopies method
	public void addCopies(int n){
		if(n > 0){
			availableCopies += n;
		}	
	}
	
	//removeCopies method
	public void removeCopies(int n){
		if(n <= availableCopies){
			availableCopies -= n;
		}	
	}
	
	//getCopiesAvailable() method
	public int getCopiesAvailable(){
		return availableCopies;
	}
	public static void main(String[] args){
		Library library1 = new Library();
		library1.addCopies(3);
		library1.removeCopies(1);
		System.out.println("Available copies : "+library1.getCopiesAvailable());
	}
}