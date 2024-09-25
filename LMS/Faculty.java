package LibrarySystem;

public class Faculty extends User {
	private int maxBooks;

	public Faculty(int userID, String name, String email, String phoneNumber, String address) {
		super(userID, name, email, phoneNumber, address, "Faculty");
		maxBooks = 10;
		
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
