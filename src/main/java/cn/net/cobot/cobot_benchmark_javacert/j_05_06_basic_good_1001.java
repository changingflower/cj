package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.net.HttpCookie;

public final class j_05_06_basic_good_1001 {
	

	public void useMutableInput4(HttpCookie cookie) {
		if (cookie == null) {
			throw new NullPointerException();
		}

		// Create copy
		cookie = (HttpCookie) cookie.clone();

		// Check whether cookie has expired
		if (cookie.hasExpired()) {
			// Cookie is no longer valid; handle condition by throwing an exception
		}

		doLogic(cookie);
	}

	public void useMutableInput5(HttpCookie cookie) {
		if (cookie == null) {
			throw new NullPointerException();
		}

		// Create copy
		cookie = (HttpCookie) cookie.clone();

		// Check whether cookie has expired
		boolean flag = cookie.hasExpired();
		if (flag) {
			// Cookie is no longer valid; handle condition by throwing an exception
		}

		doLogic(cookie);
	}

	public void useMutableInput6(HttpCookie cookie) {
		if (cookie == null) {
			throw new NullPointerException();
		}

		// Create copy
		cookie = (HttpCookie) cookie.clone();

		// Check whether cookie has expired
		boolean flag = false;
		flag = cookie.hasExpired();
		if (flag) {
			// Cookie is no longer valid; handle condition by throwing an exception
		}

		doLogic(cookie);
	}

	public void doLogic(HttpCookie cookies) {

	}

}
