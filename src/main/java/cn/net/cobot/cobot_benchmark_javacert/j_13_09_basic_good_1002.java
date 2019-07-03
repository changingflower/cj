package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.DataOutputStream;
import java.io.IOException;

class j_13_09_basic_good_1002 {
	  public static void main(String[] args)
	                          throws NumberFormatException, IOException {
		    DataOutputStream dos = new DataOutputStream(System.out);
		    dos.writeInt(Integer.valueOf(args[0].toString()));
		    System.out.flush();
	  }
}
