package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;

public final class j_05_04_basic_01 {
	private Date date;

	public j_05_04_basic_01(Date d) {
		this.date = d;
	}

	public void setDate(Date d) {
		this.date = d;
	}

	public Date getDate() {
		return date; // not compliant
	}
}