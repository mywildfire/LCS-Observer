package observer;
import java.io.*;


import java.util.*;

public class Database{
    private List<LCSPlayer> players = new ArrayList<>();
    private List<UserTeam> teams = new ArrayList<>();
    private List<League> leagues = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    //Need to figure out how we're getting data
    private final File dataFile = new File("testAPI.txt");
    private List<Matchup>[] matchups = new List[9]; 

    public Database(){
        //On creation of a database object it should poll whatever source
        //and pull in data...
        generatePlayers();
        generateUserTeams();
        generateMatchups();
    }
    
    
    public boolean checkDuplicateUser(String[] userInfo){
        for(User account: users){
            if(account.getUsername().equals(userInfo[0]) && account.getPassword().equals(userInfo[1])) return true;
        }
        return false;
    }
    
    public boolean checkDuplicateLeague(String[] leagueInfo){
        for(League league: leagues){
            if(league.getName().equals(leagueInfo[0])) return true;
        }
        return false;
    }
    
    public boolean checkDuplicateTeam(String teamInfo){
        for(UserTeam team: teams){
            if(team.getName().equals(teamInfo)) return true;
        }
        return false;    
    }
    
    public void addUser(User newUser){
        users.add(newUser);
    }
    
    public void addLeague(League newLeague){
        leagues.add(newLeague);
    }
    
    public void addTeam(UserTeam newTeam){
        teams.add(newTeam);
    }
    
    public List<LCSPlayer> getPlayerList(){
        return players;
    }
    
    public List<Matchup>[] getMatchups(){return matchups;}
    
    public List<League> getLeagues(){return leagues;}
    
    public List<UserTeam> getTeams(){return teams;}
    
    public List<User> getUsers(){return users;}
    
    public List<UserTeam> getAvailableTeams(){
        List<UserTeam> temp = new ArrayList<UserTeam>();
        
        for(UserTeam team: teams){
            if(team.isAvailable()) temp.add(team);
        }
        
        return temp;
    }
    private void generatePlayers(){
        Scanner in = new Scanner(System.in);
        try{
            in = new Scanner(dataFile);
        }
        catch(FileNotFoundException e){
            
        }
    	List<String> data = new ArrayList<>();
    	while(in.hasNextLine()) {
    		 data.add(in.nextLine());
    	}
        
        for(int i=0; i < data.size(); i++) {
            String[] str = data.get(i).split(" ");
            LCSPlayer play = new LCSPlayer(str[0], str[1], Float.parseFloat(str[2]), Float.parseFloat(str[3]), Float.parseFloat(str[4]), Float.parseFloat(str[5]), str[6]);
            players.add(play);

        }
        in.close();
    }
    private void generateMatchups(){
        //=  {  };
        
        for(int i=0; i<9; i++){
            List<Matchup> temp = new ArrayList<Matchup>();
            Random rn = new Random();
            //temporary random matchup assignment
            for(int x=0; x<teams.size()/2; x++){
                temp.add(new Matchup(teams.get(rn.nextInt(teams.size()-1)), teams.get(rn.nextInt(teams.size()-1))));
            }
            
            matchups[i] = temp;
        }
    }
    
    private void generateUserTeams(){
        for(int i = 0; i < 20; i++){
            Random rn = new Random();
            int num = rn.nextInt(21);
            LCSPlayer[] team1 = {randP(), randP(), randP(), randP(), randP()};
            LCSPlayer[] team2 = {randP(), randP(), randP(), randP(), randP()};
            teams.add(new UserTeam("Team " + i, team1, team2));
        }
    }
    
    private LCSPlayer randP(){
        Random rn = new Random();
        return players.get(rn.nextInt(players.size()));
    }

}