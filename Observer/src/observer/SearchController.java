package observer;
import java.util.*;

public class SearchController {
    
    private static SearchController instance = new SearchController();

	private SearchController(){}
	
	public static SearchController getInstance() {
		return instance;
	}
        
        public List<LCSPlayer> validatePlayers(String[] searchCriteria){
            List<LCSPlayer> lst = DatabaseManager.getInstance().getLCSPlayers();
            
            if(searchCriteria.length == 0) return lst;
            
            List<LCSPlayer> matchingPlayers = new ArrayList<>();
            
            for(LCSPlayer player : lst){
                if(player.validate(searchCriteria)){
                    matchingPlayers.add(player);
                }
            }
            
            return matchingPlayers;
        }
}