package bluetrinket.observer;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
/**
 * Created by user on 2/20/2018.
 */

public class Database {
    private HashMap playerMap = new HashMap();
    private List<LCSPlayer> playerList = new ArrayList<>();
    //Need to figure out how we're getting data
    private String readPath = "";
    private Context mContext;

    public Database(Context context){
        this.mContext = context;
        //On creation of a database object it should poll whatever source
        //and pull in data...
        List<String> data = readLine("testAPI.txt");
        Log.d("maytag", "dataList size = " + data.size());
        //temp boolean

        for(int i=0; i < data.size(); i++) {
            String[] str = data.get(i).split(" ");
            LCSPlayer play = new LCSPlayer(str[0], str[1], Float.parseFloat(str[2]), Float.parseFloat(str[3]), Float.parseFloat(str[4]), Float.parseFloat(str[5]), str[6]);
            //playerMap.put(str[0], play);
            playerList.add(play);
            Log.d("mytag",play.toString());
        }
        //Or maybe have this run in a thread
    }

    public List<String> getAllPlayerRawData(){
        Log.d("maytag", "We got in the getAlldata func!");
        List<String> tempList = new ArrayList<>();
        Log.d("maytag", "List size = " + playerList.size());
        for(LCSPlayer play : playerList){
            tempList.add(play.toString());
            Log.d("maytag", "Added this to the templist" + play.toString());
        }
        return tempList;
    }

    public List<String> validPlayers(String[] criteria){
        List<String> tempList = new ArrayList<>();
        if(criteria[0].equals("None") && criteria[1].equals("None")){
            return getAllPlayerRawData();
        }
        else{
            for(LCSPlayer play: playerList){
                if(criteria[0].equals("None")){
                    if(play.getLCSTeam().equals(criteria[1])){
                        tempList.add(play.toString());
                    }

                }
                else if(criteria[1].equals("None")){
                    if(play.getRole().equals(criteria[0])){
                        tempList.add(play.toString());
                    }
                }
                else{
                    if(play.getLCSTeam().equals(criteria[1]) && play.getRole().equals(criteria[0])){
                        tempList.add(play.toString());
                    }
                }
            }
        }
        return tempList;
    }

    public List<String> readLine(String path){
        List<String> mLines = new ArrayList<>();

        AssetManager am = mContext.getAssets();
        try {
            InputStream is = am.open("testAPI.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = reader.readLine()) != null) {
                mLines.add(line);
                Log.d("mytag", "Read this: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mLines;
    }
}
