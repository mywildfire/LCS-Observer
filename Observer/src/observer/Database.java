package observer;
import java.io.*;


import java.util.*;

public class Database{
    private List<LCSPlayer> playerList = new ArrayList<>();
    //Need to figure out how we're getting data
    private String readPath = "testAPI.txt";

    public Database(){
        //On creation of a database object it should poll whatever source
        //and pull in data...
    	Scanner in = new Scanner(readPath);
    	List<String> data = new ArrayList<>();
    	while(in.hasNextLine()) {
    		 data.add(in.nextLine());
    	}
        
        for(int i=0; i < data.size(); i++) {
            String[] str = data.get(i).split(" ");
            LCSPlayer play = new LCSPlayer(str[0], str[1], Float.parseFloat(str[2]), Float.parseFloat(str[3]), Float.parseFloat(str[4]), Float.parseFloat(str[5]), str[6]);
            playerList.add(play);

        }
        in.close();
        //Or maybe have this run in a thread
    }
    
    public List<LCSPlayer> getPlayerList(){
        return playerList;
    }

}