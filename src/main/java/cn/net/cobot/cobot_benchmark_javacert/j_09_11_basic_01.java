package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Calendar;

//check type:java
final class Book_bad {
	// Could change its locking policy in the future
	// to use private final locks
	private final String title;
	private Calendar dateIssued;
	private Calendar dateDue;

	Book_bad(String title) {
		this.title = title;
	}

	public synchronized void issue(int days) {
		dateIssued = Calendar.getInstance();
		dateDue = Calendar.getInstance();
		dateDue.add(dateIssued.DATE, days);
	}

	public synchronized Calendar getDueDate() {
		return dateDue;
	}
}
// Client
public class j_09_11_basic_01 {
	private final Book_bad book;

	j_09_11_basic_01(Book_bad book) {
		this.book = book;
	}

	public void issue(int days) {
		book.issue(days);
	}

	public Calendar getDueDate() {
		return book.getDueDate();
	}

	public void renew() {
		synchronized (book) {           //not compliant
			if (book.getDueDate().before(Calendar.getInstance())) {
				throw new IllegalStateException("Book overdue");
			} else {
				book.issue(14); // Issue book for 14 days
			}
		}
	}
}
