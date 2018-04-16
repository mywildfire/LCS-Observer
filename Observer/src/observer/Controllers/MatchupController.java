
package observer.Controllers;

import java.util.List;
import observer.Matchup;

public class MatchupController {
    private static MatchupController instance = new MatchupController();

	private MatchupController(){}
	
	public static MatchupController getInstance() {
		return instance;
	}
        
        public List<Matchup>[] getMatchups(){return DatabaseManager.getInstance().getMatchups();}
        
        public List<Matchup> selectWeek(int index){
            return DatabaseManager.getInstance().getMatchups()[index];
        }
      
}
