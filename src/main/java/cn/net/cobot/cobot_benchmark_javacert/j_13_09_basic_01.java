package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_13_09_basic_01 {
  public static void main(String[] args) {
    // Any input value > 255 will result in unexpected output
    System.out.write(Integer.valueOf(args[0]));//not compliant
    System.out.flush();
  }
}
