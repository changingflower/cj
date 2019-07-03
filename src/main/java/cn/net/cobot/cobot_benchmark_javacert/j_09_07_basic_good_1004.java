package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

import java.util.Vector;

public final class j_09_07_basic_good_1004 {
	private final Vector<WebRequest> requests = new Vector<WebRequest>();

	public boolean addWebRequest(WebRequest request) {
		return requests.add(new WebRequest(request.getBandwidth(), request.getResponseTime()));
	}

	public double getAverageBandwidth() {
		if (requests.size() == 0) {
			throw new IllegalStateException("The vector is empty!");
		}
		return calculateAverageBandwidth(0, 0);
	}

	public double getAverageResponseTime() {
		if (requests.size() == 0) {
			throw new IllegalStateException("The vector is empty!");
		}
		return calculateAverageResponseTime(0, 0);
	}

	private double calculateAverageBandwidth(int i, long bandwidth) {
		if (i == requests.size()) {
			return bandwidth / requests.size();
		}
		synchronized (requests.elementAt(i)) {
			// Acquires locks in increasing order
			bandwidth += requests.get(i).getBandwidth();
			return calculateAverageBandwidth(++i, bandwidth);
		}
	}

	private double calculateAverageResponseTime(int i, long responseTime) {
		if (i == requests.size()) {
			return responseTime / requests.size();
		}
		synchronized (requests.elementAt(i)) {
			// Acquires locks in increasing order
			responseTime += requests.get(i).getResponseTime();
			return calculateAverageResponseTime(++i, responseTime);
		}
	}
}
