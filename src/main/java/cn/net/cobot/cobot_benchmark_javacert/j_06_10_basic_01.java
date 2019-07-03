package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_06_10_basic_01 implements Comparable {
  public enum Roshambo {ROCK, PAPER, SCISSORS}
  private Roshambo value;
 
  public j_06_10_basic_01(Roshambo value) {
    this.value = value;
  }
 
  public int compareTo(Object that) {	//not compliant
    if (!(that instanceof j_06_10_basic_01)) {
      throw new ClassCastException();
    }
    j_06_10_basic_01 t = (j_06_10_basic_01) that;
    return (value == t.value) ? 0
      : (value == Roshambo.ROCK && t.value == Roshambo.PAPER) ? -1
      : (value == Roshambo.PAPER && t.value == Roshambo.SCISSORS) ? -1
      : (value == Roshambo.SCISSORS && t.value == Roshambo.ROCK) ? -1
      : 1;
  }
}
