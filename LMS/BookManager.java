package LibrarySystem;

import java.util.HashMap;
import java.util.Map;


public class BookManager {
	private Map<Integer, Book> bookMap; 

	public BookManager() {
		bookMap = new HashMap<>();
		
	}
	
	public void addBook(Book bk) {    // function to book to hashmap
		if (bookMap.containsKey(bk.getBookId())) {
            System.out.println("book with ID " + bk.getBookId() + " already exists.");
        } else {
            bookMap.put(bk.getBookId(), bk);
            System.out.println("book added: " + bk.getTitle());
        }
	}
	public void removeUser(int id, String title) {   // function to remove book from hashmap
	    	Book bk = bookMap.get(id);
	    	if(bk.getTitle().equalsIgnoreCase(title) && bk.getBookId() == id && !bk.getLoanStatus()) {
	    		bookMap.remove(id);
	    		System.out.println("Book removed sucessfully.");
	    	}
	    	else if(!bk.getLoanStatus()) {
	    		System.out.println("Book cannot be removed as it is Loaned by user");
	    	}
	    	else {
	        System.out.println("Book with ID " + id + " and title" + title + " not found.");
	    }
	    	
	    }
	public void listBooks() {
        if (bookMap == null || bookMap.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("List of Books:");
        for (Book bk : bookMap.values()) {
            System.out.println(bk);
        }
    }
	public void listLoanBooks() {
        if (bookMap == null || bookMap.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("List of Books:");
        for (Book bk : bookMap.values()) {
        	if(bk.getLoanStatus()) {
            System.out.println(bk);
        	}
        }
    }
	
	   public boolean idAvailable(int id)
	    {
	    	if(bookMap.containsKey(id)) {
	    		return true;
	    	}
	    	else return false;
	    	
	    }
	   public Book getBook(int id , String title , int days) {
		   if(bookMap.containsKey(id)) {
			   Book bk = bookMap.get(id);
			   bk.setLoanStatus(true);
			   bk.setLoanDays(days); 
			   bk.generateLoanFee();
			   return bk;
		   }
		   else {
			   return null;
		   }
			   
	   }
	   public void extendLoan(int id , String Title, int Days) {
		   if(bookMap.containsKey(id)) {
			   Book bk = bookMap.get(id);
			   bk.extendLoan(bk.getLoanDays() + Days);
			   
		   }
		   else {
			   System.out.println("Book is not Loaned");
			   return;
		   }
	   }
	   public void returnBook(int id , String Title) {
		   if(bookMap.containsKey(id)) {
			   Book bk = bookMap.get(id);
			   bk.returnItem();;
			   
		   }
		   else
		   { System.out.println("Book is not Loaned");
		      return; }
		   
	   }

}
