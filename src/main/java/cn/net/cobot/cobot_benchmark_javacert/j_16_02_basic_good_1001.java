package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_16_02_basic_good_1001 {
	String username = System.getProperty("user.name");
	B b = new B();
	C c = new C();
	int name = 15;
	public void run() {
		int x = 25;
		B bb = getB();
		int d = x + 10;
		if (x != 25) {
			d = 99;
		}
	}

	public B getB() {
		b.run();
		return b;
	}

	class B{
		public void run(){};
	}
	class C{}
	
}
