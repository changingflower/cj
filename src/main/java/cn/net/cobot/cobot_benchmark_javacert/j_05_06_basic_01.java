package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.net.HttpCookie;

public final class j_05_06_basic_01 {
	// java.net.HttpCookie is mutable
	public void useMutableInput(HttpCookie cook) {
		if (cook == null) {
			throw new NullPointerException();
		}

		// Check whether cookie has expired
		if (cook.hasExpired()) {//not compliant
			// Cookie is no longer valid; handle condition by throwing an exception
		}

		// Cookie may have expired since time of check
		doLogic(cook);
	}

	public void useMutableInput2(HttpCookie cookie) {
		if (cookie == null) {
			throw new NullPointerException();
		}

		// Check whether cookie has expired
		boolean flag = cookie.hasExpired();
		if (flag) {
			// Cookie is no longer valid; handle condition by throwing an exception
		}

		// Cookie may have expired since time of check
		doLogic(cookie);
	}

	public void useMutableInput3(HttpCookie cookie) {
		if (cookie == null) {
			throw new NullPointerException();
		}

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
