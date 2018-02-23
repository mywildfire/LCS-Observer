package bluetrinket.observer;

/**
 * Created by user on 2/20/2018.
 */

public class LeagueRoster {
    private League league;
    private UserTeam[] teams;

    public LeagueRoster(League league, UserTeam[] teams){
        this.league = league;
        this.teams = teams;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public UserTeam[] getTeams() {
        return teams;
    }

    public void setTeams(UserTeam[] teams) {
        this.teams = teams;
    }
}
