package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

final class BankAccount_good1 {
	private double balanceAmount; // Total amount in bank account
	private static final Object lock = new Object();

	BankAccount_good1(double balance) {
		this.balanceAmount = balance;
	}

	// Deposits the amount from this object instance
	// to BankAccount instance argument ba
	private void depositAmount(BankAccount_good1 ba, double amount) {
		synchronized (lock) {
			if (amount > balanceAmount) {
				throw new IllegalArgumentException("Transfer cannot be completed");
			}
			ba.balanceAmount += amount;
			this.balanceAmount -= amount;
		}
	}

	public static void initiateTransfer(final BankAccount_good1 first, final BankAccount_good1 second, final double amount) {

		Thread transfer = new Thread(new Runnable() {
			@Override
			public void run() {
				first.depositAmount(second, amount);
			}
		});
		transfer.start();
	}
}
