package LibrarySystem;



public interface Loanable {


    // Method to extend the loan period
    void extendLoan(int day);

    // Method to check if the item is currently on loan
    boolean isOnLoan();

    // Method to return the item and clear loan status
    void returnItem();

}
