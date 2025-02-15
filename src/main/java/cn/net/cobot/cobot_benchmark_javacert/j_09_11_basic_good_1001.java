package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Calendar;

//check type:java
final class Book {
	// Could change its locking policy in the future
	// to use private final locks
	private final String title;
	private Calendar dateIssued;
	private Calendar dateDue;

	Book(String title) {
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
public final class j_09_11_basic_good_1001 {
	private final Book book;
	private final Object lock = new Object();

	j_09_11_basic_good_1001(Book book) {
		this.book = book;
	}

	public void issue(int days) {
		synchronized (lock) {
			book.issue(days);
		}
	}

	public Calendar getDueDate() {
		synchronized (lock) {
			return book.getDueDate();
		}
	}

	public void renew() {
		synchronized (lock) {
			if (book.getDueDate().before(Calendar.getInstance())) {
				throw new IllegalStateException("Book overdue");
			} else {
				book.issue(14); // Issue book for 14 days
			}
		}
	}
}
