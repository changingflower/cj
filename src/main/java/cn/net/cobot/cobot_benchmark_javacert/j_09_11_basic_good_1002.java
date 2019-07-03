package cn.net.cobot.cobot_benchmark_javacert;
import java.net.InetAddress;

//check type:java

//Class IPAddressList remains unchanged
class j_09_11_basic_good_1002 {
	private final IPAddressList ips;

	public j_09_11_basic_good_1002(IPAddressList list) {
		this.ips = list;
	}

	public synchronized void addIPAddress(InetAddress address) {
		ips.addIPAddress(address);
	}

	public synchronized void addAndPrintIPAddresses(InetAddress address) {
		addIPAddress(address);
		InetAddress[] ia = (InetAddress[]) ips.getList().toArray(new InetAddress[0]);
		// ...
	}
}
