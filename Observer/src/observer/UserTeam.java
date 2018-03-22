package observer;

public class UserTeam {
    private String name;
    private LCSPlayer[] players;
    private LCSPlayer[] backupPlayers;
    private boolean isUpdated;

    public UserTeam(String name, LCSPlayer[] players, LCSPlayer[] backupPlayers){
        this.name = name;
        this.players=players;
        this.backupPlayers=backupPlayers;
        this.isUpdated=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LCSPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(LCSPlayer[] players) {
        this.players = players;
    }

    public LCSPlayer[] getBackupPlayers() {
        return backupPlayers;
    }

    public void setBackupPlayers(LCSPlayer[] backupPlayers) {
        this.backupPlayers = backupPlayers;
    }

    public boolean isUpdated() {
        return isUpdated;
    }

    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }
}