package LibrarySystem;

import java.time.LocalDate;

public class ReferenceBook extends Book {
	

	public ReferenceBook(int bookId, String title, String author, String iSBN, int pubYear, String genre) {
		super(bookId, title, author, iSBN, pubYear, genre, "Reference Book" ,0);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generateLoanFee() {
		System.out.println("Reference Book cannot be Loaned.");

	}
	


	@Override
	public boolean isOnLoan() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void extendLoan(int Days) {
		System.out.println("Cannot Loan this book");
		
	}

	@Override
	public void returnItem() {
		setLoanStatus(false);
		setBaseLoanFee(0);
		setLoanDays(0);
		
	}

}
