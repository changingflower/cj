package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_05_11_basic_01 {
	public j_05_11_basic_01() {
		if (!performSSNVerification()) {
			throw new SecurityException("Access Denied!");//not compliant
		}
	}

	private boolean performSSNVerification() {
		return false; // Returns true if data entered is valid, else false
                  // Assume that the attacker always enters an invalid SSN
	}

	public void greet() {
		System.out.println("Welcome user! You may now use all the features.");
	}
}
