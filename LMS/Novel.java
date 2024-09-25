package LibrarySystem;

import java.time.LocalDate;

public class Novel extends Book {
	private static final int FLAT_LOAN_FEE = 10;
	private boolean extendable;

	public Novel(int bookId, String title, String author, String iSBN, int pubYear, String genre) {
		super(bookId, title, author, iSBN, pubYear, genre, "Novel",0);
		extendable = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generateLoanFee() {
		setBaseLoanFee(FLAT_LOAN_FEE);

	}

	@Override
	public void extendLoan(int day) {
		System.out.println("Novel cannot be extended.");
		
	}

	@Override
	public boolean isOnLoan() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void returnItem() {
		// TODO Auto-generated method stub
		setLoanStatus(false);
		setBaseLoanFee(0);
		setLoanDays(0);
		
	}


}
