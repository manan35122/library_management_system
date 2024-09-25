# Library Management System
# Overview:
The Library Management System (LMS) is a console-based application designed to manage book loans, returns, and user registrations in a library. The system efficiently handles different types of books and users, ensuring a smooth tracking of all transactions between them. It demonstrates object-oriented programming principles including encapsulation, abstraction, polymorphism, and inheritance, alongside the use of interfaces, composition, and aggregation.

# Features:
# 1. User Management:
The system supports multiple user types: Students, Faculty, and Public Members.
Each user has the following properties:
. User ID
. Name
. Email
. Phone Number
. Address
. List of Loaned Books
. Total Loan Fees
User Types and Constraints:
. Student: Can borrow up to 5 books.
. Faculty: Can borrow up to 10 books.
. Public Member: Can borrow up to 3 books but with a higher base fee.
# 2. Book Management:
The system handles various types of books: Textbooks, Novels, and Reference Books.
Each book contains the following properties:
. Book ID
. Title
. Author
. ISBN
. Publication Year
. Genre
. Loan Status
. Base Loan Fee
Book Types and Features:
. Textbook: Primarily for academic use. Loan fees are based on the duration of the loan and can be extended once.
. Novel: General reading, has a flat loan rate, and cannot be extended.
. Reference Book: Only for in-library reading and cannot be loaned out.
# 3. Loan Transactions:
Users can borrow and return books based on their category limitations.
The system calculates loan costs based on book type and loan duration.
Users can request an extension (if applicable), and additional fees will be calculated.
Damage or late return penalties are applied to all books.
# 4. Penalties:
Late Return Fees: Flat rate per day of delay, configurable by the library.
Textbooks: Have an additional extension fee if extended beyond the initial loan period.
# System Functionalities:
1) Book Management:

. Add new books (Textbooks, Novels, Reference Books).
. Display available books.
. Remove books that are not loaned.
2) User Management:

. Add new users (Students, Faculty, Public Members).
. Display user details.
3) Loan Transactions:

. Loan a book to a user and track the transaction.
. Display loan details.
. Calculate and display the total loan cost.
. Manage loan extensions with additional fees, if applicable.
# System Requirements:
. Encapsulation: Protects the internal state of classes.
. Abstraction: Hides complex internal implementations from the user.
. Polymorphism: Manages different loan calculations based on book type.
. Inheritance: Base classes are created for books and users to handle shared attributes and behaviors.
. Interfaces: Defines methods related to loan operations for loanable items.
. Composition/Aggregation: Manages relationships between users and books.
# Technologies Used:
Java: Programming language used for implementing the Library Management System.
Java Collections Framework: For managing collections such as ArrayList and HashMap.
# How to Run:
Clone the Repository: Download the project to your local machine.
Compile the Project: Compile the Java files using javac.
Run the Application: Execute the main class file in the console. You will be presented with a menu to manage books, users, and loans.
# Future Improvements:
Integration with a database for persistent storage.
Development of a GUI interface for a better user experience.
Expansion of the system to manage fines and penalties more dynamically.
# Conclusion:
This project demonstrates the application of core Object-Oriented Programming principles in Java while solving a real-world problem of managing library resources. The flexible design allows for easy extension and modification for future needs.
