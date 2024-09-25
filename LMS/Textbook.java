package LibrarySystem;

import java.time.LocalDate;

public class Textbook extends Book {
	
	private static final int BASE_LOAN_FEE = 15;
	private int Extendable;
	
	public Textbook(int bookId, String title, String author, String iSBN, int pubYear, String genre) {
		super(bookId, title, author, iSBN, pubYear, genre , "Textbook", 0);
	    Extendable = 0;
		
		
	}

	@Override
	public void generateLoanFee() {
		setBaseLoanFee(BASE_LOAN_FEE + getLoanDays());

	}
	

	@Override
	public void extendLoan(int day) {
		if(Extendable < 1) {
			Extendable++;
			setLoanDays(getLoanDays() + day);
			generateLoanFee();
		}
		else {
			System.out.println("Book Loan Cannot be Extended more");
		}
		
		
	}

	@Override
	public boolean isOnLoan() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void returnItem() {
		setLoanStatus(false);
		setBaseLoanFee(0);
		setLoanDays(0);
		Extendable--;
		
	}
	

}
