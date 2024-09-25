package LibrarySystem;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<Integer, User> userMap; 

    public UserManager() {
        userMap = new HashMap<>();
    }

    public void addUser(User user) {
        if (userMap.containsKey(user.getUserID())) {
            System.out.println("User with ID " + user.getUserID() + " already exists.");
        } else {
            userMap.put(user.getUserID(), user);
            System.out.println("User added: " + user.getName());
        }
    }
    
    public void removeUser(int id, String name) {
    	User user = userMap.get(id);
    	if(user.getName().equalsIgnoreCase(name) && user.getUserID() == id) {
    		User us = userMap.get(id);
    		us.clearLoan();
    		userMap.remove(id);
    		
    	}
    	else {
        System.out.println("User with ID " + id + " and name" + name + " not found.");
    }
    	
    }

    public void listUsers() {
        if (userMap == null || userMap.isEmpty()) {
            System.out.println("No users available.");
            return;
        }

        System.out.println("List of Users:");
        for (User user : userMap.values()) {
            System.out.println(user);
        }
    }
    public boolean idAvailable(int id)
    {
    	if(userMap.containsKey(id)) {
    		return true;
    	}
    	else return false;
    	
    }
    public void loanBook(int id , String name,  Book bk)
    {
    	 if(userMap.containsKey(id)) {
			   User us = userMap.get(id);
			   us.setLoanedBooks(bk);
			   us.setLoanFee(bk.getBaseLoanFee());
			   return;
			   
		   }
		   else {
			   return;
		   }
    }
}
