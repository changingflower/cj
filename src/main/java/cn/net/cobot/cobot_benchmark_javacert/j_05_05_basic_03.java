package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;
import java.util.Hashtable;

class j_05_05_basic_03 {
    private Hashtable<Integer, String> ht = new Hashtable<>();

    private j_05_05_basic_03() {
        ht.put(1, "123-45-666");
    }
    public Hashtable<Integer, String> getValues() {
        return ht;
    }
    public static void main(String[] args) {
        j_05_05_basic_03 rr = new j_05_05_basic_03();
        Hashtable<Integer, String> ht1 = rr.getValues();
        ht1.remove(1);
        Hashtable<Integer, String> ht2 = rr.getValues();
        ht2.clear();
    }

}
