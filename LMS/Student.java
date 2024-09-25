package LibrarySystem;

public class Student extends User {
	private int maxBooks;
   
	public Student(int userID, String name, String email, String phoneNumber, String address) {
		super(userID, name, email, phoneNumber, address,"Student");
		maxBooks = 5;
		
		
	}

	@Override
	public int getMaxBooksAllowed() {
		
		return maxBooks;
	}

	@Override
	public double getBaseLoanFee() {
		
		return 0;
	}

}
