package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.atomic.AtomicLong;

//check type:java

final class BankAccount_good2 implements Comparable<BankAccount_good2> {
	private double balanceAmount; // Total amount in bank account
	private final Object lock;

	private final long id; // Unique for each BankAccount
	private static final AtomicLong nextID = new AtomicLong(0); // Next unused ID

	BankAccount_good2(double balance) {
		this.balanceAmount = balance;
		this.lock = new Object();
		this.id = nextID.getAndIncrement();
	}

	@Override
	public int compareTo(BankAccount_good2 ba) {
		return (this.id > ba.id) ? 1 : (this.id < ba.id) ? -1 : 0;
	}

	// Deposits the amount from this object instance
	// to BankAccount instance argument ba
	public void depositAmount(BankAccount_good2 ba, double amount) {
		BankAccount_good2 former, latter;
		if (compareTo(ba) < 0) {
			former = this;
			latter = ba;
		} else {
			former = ba;
			latter = this;
		}
		synchronized (former) {
			synchronized (latter) {
				if (amount > balanceAmount) {
					throw new IllegalArgumentException("Transfer cannot be completed");
				}
				ba.balanceAmount += amount;
				this.balanceAmount -= amount;
			}
		}
	}

	public static void initiateTransfer(final BankAccount_good2 first, final BankAccount_good2 second, final double amount) {

		Thread transfer = new Thread(new Runnable() {
			@Override
			public void run() {
				first.depositAmount(second, amount);
			}
		});
		transfer.start();
	}
}
