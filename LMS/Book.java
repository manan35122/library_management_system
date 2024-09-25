package LibrarySystem;

import java.time.LocalDate;

abstract class Book implements Loanable{
	private int bookId;
	private String title;
	private String author;
	private String ISBN;
	private int pubYear;
	private String genre;
	boolean loanStatus;     //true if book is loaned
	private int baseLoanFee;
	private String bookType;
	private int LoanDays;
	
	public Book(int bookId, String title, String author, String iSBN, int pubYear, String genre, String type, int fee) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.pubYear = pubYear;
		this.genre = genre;
		loanStatus = false;
		bookType = type;
		baseLoanFee = fee;
		LoanDays = 0;
		
	}
	

	public int getLoanDays() {
		return LoanDays;
	}


	public void setLoanDays(int loanDays) {
		LoanDays = loanDays;
	}


	public String getTitle() {
		return title;
	}

	public int getBookId() {
		return bookId;
	}

	public String getAuthor() {
		return author;
	}
	public void setLoanStatus(boolean loanStatus) {
        this.loanStatus = loanStatus;
    }
	public boolean getLoanStatus() {
        return loanStatus;
    }
	public int getBaseLoanFee() {
        return baseLoanFee;
    }
	
	public String toString() {
	    return "Book Type: " + bookType+
	    	   ", Book ID: " + bookId + 
	           ", Title: " + title + 
	           ", Author: " + author + 
	           ", ISBN: " + ISBN + 
	           ", Publication Year: " + pubYear + 
	           ", Genre: " + genre +
	           ", Loan Status: " + loanStatus +
	            ", Loan Fee: " + baseLoanFee;	      
	}

	public abstract void generateLoanFee();
	public abstract void returnItem(); 


	public void setBaseLoanFee(int baseLoanFee) {
		this.baseLoanFee = baseLoanFee;
	}



}
