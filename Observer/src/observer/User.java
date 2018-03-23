package observer;

public class User {
    private String username;
    private String password;
    private League[] leagues;
    private UserTeam myTeam;

    public User(String[] userInfo){
        this.username = userInfo[0];
        this.password = userInfo[1];
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
    
    public League[] getLeagues() {return leagues;}
    public void setLeagues(League[] leagues) {
    	this.leagues = leagues;
    }

    public UserTeam getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(UserTeam myTeam) {
        this.myTeam = myTeam;
    }
}