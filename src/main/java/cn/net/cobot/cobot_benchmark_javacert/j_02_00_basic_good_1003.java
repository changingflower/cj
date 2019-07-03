package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.File;

public class j_02_00_basic_good_1003 {
    private long l;
    private String s;
    
    void init() {
        this.l = readLong();
        this.s = readString();
    }

    public long readLong() {
        return 100l;
    }
    public String readString() {
        return "hekko";
    }
}