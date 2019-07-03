package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
class GrantAccess2 {
  public static void displayAccountStatus() {
    System.out.println("Account details for admin: XX");
  }
}

class GrantUserAccess2 extends GrantAccess2 {
  public static void displayAccountStatus() {
    System.out.println("Account details for user: XX");
  }
}

public class j_06_07_basic_good_1002 {
  public static void choose(String username) {
    if (username.equals("admin")) {
      GrantAccess2.displayAccountStatus();
    } else {
      GrantUserAccess2.displayAccountStatus();
    }
  }

  public static void main(String[] args) {
    choose("user");
  }
}
