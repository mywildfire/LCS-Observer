package bluetrinket.observer;

import java.util.List;

/**
 * Created by user on 2/23/2018.
 */

public class SearchController {
    DatabaseManager db;
    public SearchController(DatabaseManager db){
        this.db = db;
    }

    public List<String> lookup(String[] searchCriteria){
        return db.validPlayers(searchCriteria);
    }
}
