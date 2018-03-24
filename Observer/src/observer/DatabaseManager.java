package observer;
import java.util.*;

public class DatabaseManager{

	private static DatabaseManager instance = new DatabaseManager();
        private Database db = new Database();;
        
	private DatabaseManager(){
        }
	
	public static DatabaseManager getInstance() {
		return instance;
	}
        
        public List<LCSPlayer> getLCSPlayers(){
            return db.getPlayerList();
        }
        
        public List<Matchup>[] getMatchups(){
            return db.getMatchups();
        }
        
        public boolean checkDuplicateUser(String[] userInfo){
            return db.checkDuplicateUser(userInfo);
        }
        
        public boolean checkDuplicateLeague(String[] leagueInfo){
            return db.checkDuplicateLeague(leagueInfo);
        }
        
        public void addUser(User newUser){
            db.addUser(newUser);
        }

        public void addLeague(League newLeague){
            db.addLeague(newLeague);
        }
        
}
