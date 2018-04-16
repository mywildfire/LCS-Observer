
package observer.Controllers;

import java.util.List;
import observer.*;

public class LeagueController {
     private static LeagueController instance = new LeagueController();

	private LeagueController(){}
	
	public static LeagueController getInstance() {
		return instance;
	}
        
        public List<League> getLeagues(){
            return DatabaseManager.getInstance().getLeagues();
        }
        
        public boolean assignTeam(League league, UserTeam team){
            return league.addTeam(team);
            
        }
        
        public boolean createLeague(String[] leagueInfo){
            if(!DatabaseManager.getInstance().checkDuplicateLeague(leagueInfo)){
                League newLeague = new League(leagueInfo[0], Integer.parseInt(leagueInfo[1]));
                DatabaseManager.getInstance().addLeague(newLeague);
                return true;
            }
            return false;
        }
}
