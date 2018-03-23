package observer;

import java.util.*;

public class League {
    private String name;
    private int id;
    private List<User> users = new ArrayList<>();
    private UserTeam[] teams;
    private boolean isUpdated;
    private List<LCSPlayer> freePool = new ArrayList<>();
    
    public League(String name, int numOfTeams){
        this.name = name;
        teams = new UserTeam[numOfTeams];
    }
    
    public String getName(){return name;}
    
}
