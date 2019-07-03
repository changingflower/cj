package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class GrantAccess_bad {
  public static void displayAccountStatus() {
    System.out.println("Account details for admin: XX");
  }
}

class GrantUserAccess_bad extends GrantAccess_bad {
  public static void displayAccountStatus() {           //not compliant
    System.out.println("Account details for user: XX");
  }
}

public class j_06_07_basic_01 {
  public static void choose(String username) {
    GrantAccess_bad admin = new GrantAccess_bad();
    GrantAccess_bad user = new GrantUserAccess_bad();
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
