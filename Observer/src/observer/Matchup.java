
package observer;


public class Matchup {
    private UserTeam team1;
    private UserTeam team2;
    private String name;
    public Matchup(UserTeam team1, UserTeam team2){
        this.team1 = team1;
        this.team2 = team2;
        this.name = team1.getName() + " vs " + team2.getName();
    }
    
    public UserTeam getTeam1(){return team1;}
    public UserTeam getTeam2(){return team2;}
    public String getName(){return name;}
    
    public int[] getStatSum(){
        //calculate both team scores.
        float teamsum1 = 0;
        for(LCSPlayer player: team1.getPlayers()){
            teamsum1 += player.getPoints();
        }
        
        float teamsum2 = 0;
        for(LCSPlayer player: team2.getPlayers()){
            teamsum2 += player.getPoints();
        }
        
        return new int[]{(int)teamsum1, (int)teamsum2};
    }
}
