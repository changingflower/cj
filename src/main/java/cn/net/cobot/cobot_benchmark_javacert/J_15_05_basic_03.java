package cn.net.cobot.cobot_benchmark_javacert;

import java.lang.reflect.Field;

public class J_15_05_basic_03 {
	public static void main(String[] args) {
		SunToolkit obj = new SunToolkit();
		String arg = args[0];
		Class in = arg.getClass();
		Field out = obj.getField(in, arg);
		System.out.println(out);
	}
}