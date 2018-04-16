
package observer.Controllers;

import observer.User;

public class AccountManager {
     private static AccountManager instance = new AccountManager();

	private AccountManager(){}
	
	public static AccountManager getInstance() {
		return instance;
	}
        
        public boolean checkDuplicate(String[] userInfo){
            if(!DatabaseManager.getInstance().checkDuplicateUser(userInfo)){
                User newUser = new User(userInfo);
                DatabaseManager.getInstance().addUser(newUser);
                return true;
            }
            return false;
        }
        
        public boolean login(String[] userInfo){
            User user = DatabaseManager.getInstance().findUser(userInfo);
            if(user != null){
                return DatabaseManager.getInstance().verifyPassword(user, userInfo[1]);
            }
            else{
                return false;
            }
            
        }
}
