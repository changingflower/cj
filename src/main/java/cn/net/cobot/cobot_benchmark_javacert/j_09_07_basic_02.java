package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

import java.util.Vector;

public final class j_09_07_basic_02 {
	  private final Vector<WebRequest> requests = new Vector<WebRequest>();

	  public boolean addWebRequest(WebRequest request) {
	    return requests.add(new WebRequest(request.getBandwidth(),
	                        request.getResponseTime()));
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
	    return calculateAverageResponseTime(requests.size() - 1, 0);
	  }

	  private double calculateAverageBandwidth(int i, long bandwidth) {
	    if (i == requests.size()) {
	      return bandwidth / requests.size();
	    }
	    synchronized (requests.elementAt(i)) {
	      bandwidth += requests.get(i).getBandwidth();
	      // Acquires locks in increasing order
	      return calculateAverageBandwidth(++i, bandwidth);
	    }
	  }

	  private double calculateAverageResponseTime(int i, long responseTime) {
	    if (i <= -1) {
	      return responseTime / requests.size();
	    }
	    synchronized (requests.elementAt(i)) {                     //not compliant
	      responseTime += requests.get(i).getResponseTime();
	      // Acquires locks in decreasing order
	      return calculateAverageResponseTime(--i, responseTime);
	    }
	  }
}

class WebRequest {
	
	private int width, time;
	
	public WebRequest(int width, int time) {
		this.width = width;
		this.time = time;
	}

	public int getBandwidth() {
		return width;
	}

	public int getResponseTime() {
		return time;
	}
	
}
