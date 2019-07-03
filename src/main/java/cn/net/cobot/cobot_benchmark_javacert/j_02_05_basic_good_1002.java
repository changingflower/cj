package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.IOException;
import java.io.InputStream;

public class j_02_05_basic_good_1002 {
	//Exception
	//This exception does not apply 
	//if a value modified by an increment or decrement operator is subsequently read or written.
	public void func_02_05_basic_02_good(InputStream in) {// compliant
		int i;
		// Process chars until '' found
		try {
			while ((i = in.read()) != -1 && i != '\'' && (i = in.read()) != -1 && i != '\'') {
				// ...
			}
		//EXP05-J-EX1: The conditional-or || and conditional-and && operators have well-understood 
		//semantics. Writes followed by subsequent writes or reads do not violate this rule 
		//if they occur in different operands of || or &&. Consider the following code example:

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
