package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//This class could change its locking policy in the future,
//for example, if new non-atomic methods are added
class IPAddressList {
	private final List<InetAddress> ips = Collections.synchronizedList(new ArrayList<InetAddress>());

	public List<InetAddress> getList() {
		return ips; // No defensive copies required
					// as visibility is package-private
	}

	public void addIPAddress(InetAddress address) {
		ips.add(address);
	}
}

class PrintableIPAddressList extends IPAddressList {
	public void addAndPrintIPAddresses(InetAddress address) {
		synchronized (getList()) {                   //not compliant
			addIPAddress(address);
			InetAddress[] ia = (InetAddress[]) getList().toArray(new InetAddress[0]);
			// ...
		}
	}
}
