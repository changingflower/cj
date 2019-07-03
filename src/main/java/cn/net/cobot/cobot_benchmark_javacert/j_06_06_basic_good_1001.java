package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.net.HttpCookie;

class j_06_06_basic_good_1001 implements Cloneable {
	  HttpCookie[] cookies;
	 
	  j_06_06_basic_good_1001(HttpCookie[] c) {
	    cookies = c;
	  }
	 
	  public Object clone() throws CloneNotSupportedException {
	    final j_06_06_basic_good_1001 clone = (j_06_06_basic_good_1001) super.clone();
	    clone.doSomething(); // Invokes overridable method
	    clone.cookies = clone.deepCopy();
	    return clone;
	  }
	 
	  void doSomething() { // Overridable
	    for (int i = 0; i < cookies.length; i++) {
	      cookies[i].setValue("" + i);
	    }
	  }
	 
	  final HttpCookie[] deepCopy() {
	    if (cookies == null) {
	      throw new NullPointerException();
	    }
	 
	    // Deep copy
	    HttpCookie[] cookiesCopy = new HttpCookie[cookies.length];
	 
	    for (int i = 0; i < cookies.length; i++) {
	      // Manually create a copy of each element in array
	      cookiesCopy[i] = (HttpCookie) cookies[i].clone();
	    }
	    return cookiesCopy;
	  }
	}
	 
	class Sub2 extends j_06_06_basic_good_1001 {
	  Sub2(HttpCookie[] c) {
	    super(c);
	  }
	 
	  public Object clone() throws CloneNotSupportedException {
	    final Sub2 clone = (Sub2) super.clone();
	    clone.doSomething1();
	    return clone;
	  }
	 
	  final void doSomething1() { // Erroneously executed
	    for (int i = 0;i < cookies.length; i++) {
	      cookies[i].setDomain(i + ".foo.com");
	    }
	  }
	 
	  public static void main(String[] args)
	      throws CloneNotSupportedException {
	    HttpCookie[] hc = new HttpCookie[20];
	    for (int i = 0 ; i < hc.length; i++){
	      hc[i] = new HttpCookie("cookie" + i,"" + i);
	    }
	    j_06_06_basic_good_1001 bc = new Sub2(hc);
	    bc.clone();
	  }
	}