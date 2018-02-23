package bluetrinket.observer;

/**
 * Created by user on 2/20/2018.
 */

public class LCSPlayer {

    private String name;
    private String role;
    private float kills;
    private float deaths;
    private float assists;
    private float cs;
    private String LCSTeam;
    private boolean isUpdated;

    public LCSPlayer(String name, String role, float kills, float deaths, float assists, float cs, String LCSTeam){
        this.name = name;
        this.role = role;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.cs = cs;
        this.LCSTeam = LCSTeam;
        this.isUpdated = true;
    }

    public String toString(){
        return name + " " + role + " " + kills + " " + deaths + " " + assists + " " + cs + " " + LCSTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getKills() {
        return kills;
    }

    public void setKills(float kills) {
        this.kills = kills;
    }

    public float getDeaths() {
        return deaths;
    }

    public void setDeaths(float deaths) {
        this.deaths = deaths;
    }

    public float getAssists() {
        return assists;
    }

    public void setAssists(float assists) {
        this.assists = assists;
    }

    public float getCs() {
        return cs;
    }

    public void setCs(float cs) {
        this.cs = cs;
    }

    public String getLCSTeam() {
        return LCSTeam;
    }

    public void setLCSTeam(String LCSTeam) {
        this.LCSTeam = LCSTeam;
    }
}
