package bluetrinket.observer;

/**
 * Created by user on 2/20/2018.
 */

public class League {

    private String name;
    private int id;
    private LCSPlayer[] freePool;
    private boolean isUpdated;

    public League(String name, int id, LCSPlayer[] freePool){
        this.name = name;
        this.id = id;
        this.freePool = freePool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LCSPlayer[] getFreePool() {
        return freePool;
    }

    public void setFreePool(LCSPlayer[] freePool) {
        this.freePool = freePool;
    }
}
