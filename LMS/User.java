package LibrarySystem;

import java.util.*;

abstract class User {
	private int userID;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private ArrayList<Book> loanedBooks;
	private int loanFee;
	private String userType;
	
	
	
	public void setLoanFee(int loanFee) {
		this.loanFee = loanFee;
	}

	public User(int userID, String name, String email, String phoneNumber, String address , String type) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.loanedBooks = new ArrayList<>();
		loanFee = 0;
		userType = type;
		
	}

	public int getUserID() {
		return userID;
	}
	

	public void setLoanedBooks(Book bk) {
		if (bk == null) {
            System.out.println("Cannot add a null book.");
            return;
        }
		for (int i = 0; i < loanedBooks.size(); i++) {
            Book book = loanedBooks.get(i);
            if (book.getBookId() == bk.getBookId()) {
            	System.out.println("Book is already Loaned");
            }
            else {
            	loanedBooks.add(bk);
            }
	}
		}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public ArrayList<Book> getLoanedBooks() {
		return loanedBooks;
	}

	public int getLoanFee() {
		return loanFee;
	}	
	public void returnBook(Book bk) {
		if(loanedBooks.contains(bk)){
			
		}
	}
	public void borrowBook(Book bk) {
		if(loanedBooks.size() < getMaxBooksAllowed()) {
			loanedBooks.add(bk);
			loanFee += getBaseLoanFee();
		}
		else {
			System.out.println("Cannot Borrow Book");
		}
			
	}
	public void display() {
		System.out.println(userID + " " + name + " " + email + " " + phoneNumber + " " + address);
	}
	
    public String toString() {
        return "User Type: " + userType + ", UserID: " + userID + ", Name: " + name + ", Email: " + email +
               ", Phone: " + phoneNumber + ", Address: " + address +
               ", Loan Fee: $" + loanFee;
    }
    public void clearLoan() {
    	for (int i = 0; i < loanedBooks.size(); i++) {
    		Book book = loanedBooks.get(i);
    		book.setLoanStatus(false);
    	}
    }
    
	public abstract int getMaxBooksAllowed();
    public abstract double getBaseLoanFee();
	
	
	
	
	
}
