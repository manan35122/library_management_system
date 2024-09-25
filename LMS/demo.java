package LibrarySystem;

import java.util.Scanner;

public class demo {
	private static void createNewUser(Scanner scanner , String userType ,  UserManager userManager) {
        System.out.println("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();         

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        String phoneNo = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();

        User newUser = null;
        userType.toLowerCase();
        if (userType.equalsIgnoreCase("student")  && !userManager.idAvailable(id)) {
            newUser = new Student(id, name, email, phoneNo, address);
        }
        else if (userType.equalsIgnoreCase("faculty") && !userManager.idAvailable(id)) {
            newUser = new Faculty(id, name, email, phoneNo, address);
        }
        else if (userType.equalsIgnoreCase("public member") && !userManager.idAvailable(id)) {
            newUser = new PublicMember(id, name, email, phoneNo, address);
        }
        else {
        	System.out.println("User NOT Created");
        	return;
        }
        userManager.addUser(newUser);
        newUser.display();
        
        System.out.println("User created successfully!");
        
          
    }
	  private static void createNewBook(Scanner scanner, BookManager bookManager , String bookType) {
	        System.out.println("Enter Book ID: ");
	        int bookId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.println("Enter Title: ");
	        String title = scanner.nextLine();

	        System.out.println("Enter Author: ");
	        String author = scanner.nextLine();

	        System.out.println("Enter ISBN: ");
	        String ISBN = scanner.nextLine();

	        System.out.println("Enter Publication Year: ");
	        int pubYear = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.println("Enter Genre: ");
	        String genre = scanner.nextLine();

	       

	        Book newBook = null;
	        if (bookType.equalsIgnoreCase("Textbook")  && !bookManager.idAvailable(bookId)) {
	            newBook = new Textbook(bookId, title, author, ISBN, pubYear, genre);
	        }
	        else if (bookType.equalsIgnoreCase("Novel")  && !bookManager.idAvailable(bookId)) {
	            newBook = new Novel(bookId, title, author, ISBN, pubYear, genre);
	        }
	        else if (bookType.equalsIgnoreCase("Reference")  && !bookManager.idAvailable(bookId)) {
	            newBook = new ReferenceBook(bookId, title, author, ISBN, pubYear, genre);
	        }
	        else {
	        	System.out.println("book NOT Created");
	        	return;
	        }
	        bookManager.addBook(newBook);
	        newBook.toString();
	        
	        System.out.println("Book added successfully!");
	        
	  }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        BookManager bookManager = new BookManager();
        boolean running = true;

        while (running) {
        	//Menu 
        	
            System.out.println("Choose an option from the following: ");
            System.out.println("1) Create New User");
            System.out.println("2) Remove User");
            System.out.println("3) Add New Book");
            System.out.println("4) Display All Users");
            System.out.println("5) Display All Books");
            System.out.println("6) Remove Book");
            System.out.println("7) Loan Book");
            System.out.println("8) Display Loan Books");
            System.out.println("9) Extend Loan");
            System.out.println("10) Return Book");
            System.out.println("11) Exit");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	 System.out.println("Select User Type: ");
                	String type = scanner.next();
                    createNewUser(scanner,type,userManager);
                     break;
                 

                case 2:
                    // Code to remove a user
                    System.out.println("Enter Id: ");
                    int id = scanner.nextInt();       
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    userManager.removeUser(id, name);
                    break;

                case 3:
                    //add new book               	
                	System.out.println("Enter Book Type: ");
                	String booktype = scanner.next();
                	createNewBook(scanner, bookManager , booktype);
                   
                   break;
                case 4:
                	// displays all users
                    userManager.listUsers();
                    break;
                    
                case 5:
                	// displays all books
                    bookManager.listBooks();
                    break;
                    
                case 6:
                    // Code to remove a book
                    System.out.println("Enter Id: ");
                    int bookid = scanner.nextInt();       
                    System.out.println("Enter Title: ");
                    String title = scanner.next();
                    bookManager.removeUser(bookid, title);
                    break;
                    
                case 7:
                    // Loan Book
                    System.out.println("Enter Book Id: ");
                    int loanId = scanner.nextInt();       
                    System.out.println("Enter Book Title: ");
                    String loanTitle = scanner.next();
                    System.out.println("Enter User Id: ");
                    int id1 = scanner.nextInt();       
                    System.out.println("Enter User Name: ");
                    String name1= scanner.next();
                    System.out.println("Number of Days: ");
                    int days= scanner.nextInt();
                    Book bk = bookManager.getBook(loanId, loanTitle, days);
                    if(bk!=null) {
                    userManager.loanBook(id1, name1, bk);
                    }
                    
                    break;
                    
                case 8:
                    // display all loan Book
                    bookManager.listLoanBooks();                  
                    break;
                case 9:
                    // extend LOAN
                	 System.out.println("Enter Book Id: ");
                     int loanId1 = scanner.nextInt();       
                     System.out.println("Enter Book Title: ");
                     String loanTitle1 = scanner.next();
                     System.out.println("Enter Days you want to extend: ");
                     int day = scanner.nextInt();
                     bookManager.extendLoan(loanId1 , loanTitle1 , day);
                                     
                    break;
                case 10:
                    // return book
                	 System.out.println("Enter Book Id: ");
                     int loanId2 = scanner.nextInt();       
                     System.out.println("Enter Book Title: ");
                     String loanTitle2 = scanner.next();
                
                     bookManager.returnBook(loanId2 , loanTitle2);
                                     
                    break;

                case 11:
                    // Exit the program
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }

        scanner.close();
    }
    
    
}

