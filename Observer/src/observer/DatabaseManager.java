package observer;
import java.util.*;

public class DatabaseManager {

	private static DatabaseManager instance = new DatabaseManager();
        private final Database db = new Database();
        
	private DatabaseManager(){}
	
	public static DatabaseManager getInstance() {
		return instance;
	}
        
        public List<LCSPlayer> getLCSPlayers(){
            return db.getPlayerList();
        }
	
	
}
