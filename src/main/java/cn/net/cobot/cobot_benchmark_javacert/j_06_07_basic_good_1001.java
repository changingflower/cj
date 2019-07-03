package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_06_07_basic_good_1001 {
  public static void choose(String username) {
    GrantAccess_good1 admin = new GrantAccess_good1();
    GrantAccess_good1 user = new GrantUserAccess_good1();

    if (username.equals("admin")) {
      admin.displayAccountStatus();
    } else {
      user.displayAccountStatus();
    }
  }

  public static void main(String[] args) {
    choose("user");
  }
}
class GrantAccess_good1 {
	  public void displayAccountStatus() {
	    System.out.print("Account details for admin: XX");
	  }
	}

	class GrantUserAccess_good1 extends GrantAccess_good1 {
	  @Override
	  public void displayAccountStatus() {
	    System.out.print("Account details for user: XX");
	  }
	}
