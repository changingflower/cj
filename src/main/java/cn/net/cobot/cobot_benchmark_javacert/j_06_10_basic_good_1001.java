package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

class j_06_10_basic_good_1001 {
  public enum Roshambo {ROCK, PAPER, SCISSORS}
  private Roshambo value;
 
  public j_06_10_basic_good_1001(Roshambo value) {
    this.value = value;
  }
 
  public int beats(Object that) {
    if (!(that instanceof j_06_10_basic_good_1001)) {
      throw new ClassCastException();
    }
    j_06_10_basic_good_1001 t = (j_06_10_basic_good_1001) that;
    return (value == t.value) ? 0
      : (value == Roshambo.ROCK && t.value == Roshambo.PAPER) ? -1
      : (value == Roshambo.PAPER && t.value == Roshambo.SCISSORS) ? -1
      : (value == Roshambo.SCISSORS && t.value == Roshambo.ROCK) ? -1
      : 1;
  }
}