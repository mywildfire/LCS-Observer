package observer.Controllers;

import java.util.List;
import observer.*;

/**
 *
 * @author user
 */
public class TeamController {
    private static TeamController instance = new TeamController();
	
	public static TeamController getInstance() {
		return instance;
	}
        
        public boolean createTeam(String name, LCSPlayer[] l1, LCSPlayer[] l2){
            if(!DatabaseManager.getInstance().checkDuplicateTeam(name)){
                UserTeam newTeam = new UserTeam(name);
                DatabaseManager.getInstance().addTeam(newTeam);
                return true;
            }
            return false;
        }
        
        public List<UserTeam> getTeams(){
            return DatabaseManager.getInstance().getTeams();
        }
        public List<UserTeam> getAvailableTeams(){
            return DatabaseManager.getInstance().getAvailableTeams();
        }
}
