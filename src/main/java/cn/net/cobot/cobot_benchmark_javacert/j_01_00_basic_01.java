package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_01_00_basic_01   {
	private final int balance;
	private static final j_01_00_basic_01 c= new j_01_00_basic_01();
	private static final int depisit = (int)(Math.random() * 100);

	public j_01_00_basic_01() {
		balance = depisit - 10;//not compliant
	}

	public static void main(String[] args) {
		System.out.println("The account balance is: "+ c.balance);
	}
}
