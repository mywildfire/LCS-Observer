
package observer;

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
            if(!DatabaseManager.getInstance().checkDuplicateUser(userInfo)){
                return true;
            }
            return false;
        }
}
