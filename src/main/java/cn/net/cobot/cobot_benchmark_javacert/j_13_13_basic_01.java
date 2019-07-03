package cn.net.cobot.cobot_benchmark_javacert;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class j_13_13_basic_01 {
	public void logRemoteIPAddress(String name) {
		Logger logger = Logger.getLogger("com.organization.Log");
		InetAddress machine = null;
		try {
			machine = InetAddress.getByName(name);
		} catch (UnknownHostException e) {
			Exception w = MyExceptionReporter.handle(e);
		} catch (SecurityException e) {
			Exception w = MyExceptionReporter.handle(e);
			// should not have sensitive information about SecurityException
			logger.severe(name + "," + machine.getHostAddress() + "," + e.toString());	//not compliant
			String passengerAge = "26";
			// cannot be info warning and severe
			logger.info("Age: " + passengerAge);	//not compliant
			logger.finest("Age: " + passengerAge);
		}
	}
}