package bluetrinket.observer;

/**
 * Created by user on 2/20/2018.
 */

public class User {
    private String username;
    private String password;
    private LeagueRoster[] leagues;
    private UserTeam myTeam;

    public User(String username, String password, LeagueRoster[] leagues, UserTeam myTeam){
        this.username = username;
        this.password = password;
        this.leagues = leagues;
        this.myTeam = myTeam;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LeagueRoster[] getLeagues() {
        return leagues;
    }

    public void setLeagues(LeagueRoster[] leagues) {
        this.leagues = leagues;
    }

    public UserTeam getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(UserTeam myTeam) {
        this.myTeam = myTeam;
    }
}
