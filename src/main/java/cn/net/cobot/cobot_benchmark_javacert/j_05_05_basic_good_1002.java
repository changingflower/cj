package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;

class j_05_05_basic_good_1002 {
    private Date[] date;

    public j_05_05_basic_good_1002() {
        date = new Date[20];
        for (int i = 0; i < date.length; i++) {
            date[i] = new Date();
        }
    }

    public Date[] getDate() {
        Date[] dates = new Date[date.length];
        for (int i = 0; i < date.length; i++) {
            dates[i] = (Date) date[i].clone();
        }
        return dates;
    }
}
