
package observer;

public class LeagueController {
     private static LeagueController instance = new LeagueController();

	private LeagueController(){}
	
	public static LeagueController getInstance() {
		return instance;
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
