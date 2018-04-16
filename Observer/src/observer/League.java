package observer;

import java.util.*;

public class League {
    private String name;
    private int id;
    private int maxTeams;
    private List<UserTeam> teams = new ArrayList<>();
    private boolean isUpdated;
    private List<LCSPlayer> freePool = new ArrayList<>();
    
    public League(String name, int numOfTeams){
        this.name = name;
        maxTeams = numOfTeams;
    }
    
    public String getName(){return name;}
    public List<UserTeam> getTeams(){return teams;}
    public boolean isFull(){
        return teams.size() >= maxTeams;
    }
    
    public boolean addTeam(UserTeam team){
        if(!isFull()){
            teams.add(team);
            team.setLeague(this);
            return true;
        }
        return false;
    }
        
}
