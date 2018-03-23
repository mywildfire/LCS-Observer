
package observer;

import java.util.List;

public class MatchupController {
    private static MatchupController instance = new MatchupController();

	private MatchupController(){}
	
	public static MatchupController getInstance() {
		return instance;
	}
        
        public List<Matchup>[] getMatchups(){return DatabaseManager.getInstance().getMatchups();}
}
