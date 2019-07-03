package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;

class j_05_05_basic_02 {
    private Date[] date;

    public j_05_05_basic_02() {
        date = new Date[20];
        for (int i = 0; i < date.length; i++) {
            date[i] = new Date();
        }
    }

    public Date[] getDate() {
        return date; // Or return date.clone()
    }

}
