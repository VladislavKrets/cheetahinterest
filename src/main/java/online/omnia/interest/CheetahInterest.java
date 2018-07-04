package online.omnia.interest;

/**
 * Created by lollipop on 15.08.2017.
 */
public class CheetahInterest {
    private int id;
    private String pid;
    private String value;

    public CheetahInterest(int id, String pid, String value) {
        this.id = id;
        this.pid = pid;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getPid() {
        return pid;
    }

    public String getValue() {
        return value;
    }
}
