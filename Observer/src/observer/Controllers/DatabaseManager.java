package observer.Controllers;
import java.util.*;
import observer.*;

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
        
        public List<League> getLeagues(){
            return db.getLeagues();
        }
        public List<UserTeam> getTeams(){
            return db.getTeams();
        }
        public List<UserTeam> getAvailableTeams(){
            return db.getAvailableTeams();
        }
        
        
        public boolean checkDuplicateUser(String[] userInfo){
            return db.checkDuplicateUser(userInfo);
        }
        
        public boolean checkDuplicateLeague(String[] leagueInfo){
            return db.checkDuplicateLeague(leagueInfo);
        }
        
        public boolean checkDuplicateTeam(String teamInfo){
            return db.checkDuplicateTeam(teamInfo);
        }
        
        public void addUser(User newUser){
            db.addUser(newUser);
        }

        public void addLeague(League newLeague){
            db.addLeague(newLeague);
        }
        
        public void addTeam(UserTeam newTeam){
            db.addTeam(newTeam);
        }
        
        public User findUser(String[] userInfo){
            List<User> users = db.getUsers();
            for(User usr: users){
                if(usr.getUsername().equals(userInfo[0])){
                    return usr;
                }
            }
            return null;
        }
        
        public boolean verifyPassword(User user, String password){
            return user.checkPassword(password);
        }
        
}
