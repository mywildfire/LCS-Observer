package observer;

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

    public boolean validate(String[] criteria){
        //[0] is the category, [1] is the search
        if(criteria[1].equals("")) return true;
                
        switch (criteria[0]) {
            case "Name":
                if(name.toLowerCase().contains(criteria[1].toLowerCase())) return true;
                break;
            case "Team":
                if(LCSTeam.toLowerCase().contains(criteria[1].toLowerCase())) return true;
                break;
            case "Role":
                if(role.toLowerCase().contains(criteria[1].toLowerCase())) return true;
                break;
            default:
                return true;
        }

        return false;
    }
    
    @Override
    public String toString(){
        return name + "<br>Role: " + role + "<br>Team: " + LCSTeam + "<br> K: " + kills + " D: " + deaths + " A: " + assists + "<br> CS: " + cs + "<br> Points: " + this.getPoints();
    }
    
    public String[] toArray(){
        String[] temp = {name, role, LCSTeam, ""+kills, ""+deaths, ""+assists, ""+cs};
        return temp;
    }
    
    public int getPoints(){
        return (int) (kills*2 - deaths*.5 + assists*1.5 + cs*.01);
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }


    public float getKills() {
        return kills;
    }


    public float getDeaths() {
        return deaths;
    }



    public float getAssists() {
        return assists;
    }

 
    public float getCs() {
        return cs;
    }

    public String getLCSTeam() {
        return LCSTeam;
    }
}