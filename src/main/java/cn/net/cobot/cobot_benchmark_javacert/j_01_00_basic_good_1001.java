package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_01_00_basic_good_1001 {
	private final int balance;
	private static final int depisit = (int)(Math.random() * 100);
	private static final j_01_00_basic_good_1001 c= new j_01_00_basic_good_1001();

	public j_01_00_basic_good_1001() {
		balance = depisit - 10;
	}

	public static void main(String[] args) {
		System.out.println("The account balance is: "+ c.balance);
	}

}
