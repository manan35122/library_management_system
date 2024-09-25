package LibrarySystem;

public class PublicMember extends User {
	private int maxBooks;

	public PublicMember(int userID, String name, String email, String phoneNumber, String address) {
		super(userID, name, email, phoneNumber, address, "Public Member");
		maxBooks = 3;
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
