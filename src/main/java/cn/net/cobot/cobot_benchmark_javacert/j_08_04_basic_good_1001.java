package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class USCurrency_Good {
  private final int quarters;
  private final int dimes;
  private final int nickels;
  private final int pennies;
 
  public USCurrency_Good(Builder builder) {
    this.quarters = builder.quarters;
    this.dimes = builder.dimes;
    this.nickels = builder.nickels;
    this.pennies = builder.pennies;
  }
 
  // Static class member
  public static class Builder {
    private int quarters = 0;
    private int dimes = 0;
    private int nickels = 0;
    private int pennies = 0;
 
    public static Builder newInstance() {
      return new Builder();
    }
 
    private Builder() {}
 
    // Setter methods
    public Builder setQuarters(int quantity) {
      this.quarters = quantity;
      return this;
    }
    public Builder setDimes(int quantity) {
      this.dimes = quantity;
      return this;
    }
    public Builder setNickels(int quantity) {
      this.nickels = quantity;
      return this;
    }
    public Builder setPennies(int quantity) {
      this.pennies = quantity;
      return this;
    }
 
    public USCurrency_Good build() {
      return new USCurrency_Good(this);
    }
  }
}
 
// Client code:
class ExampleClientCode_Good  {
 
  private volatile USCurrency_Good currency;
  // ...
 
  public ExampleClientCode_Good() {
 
    Thread t1 = new Thread(new Runnable() {
        @Override public void run() {
          currency = USCurrency_Good.Builder.newInstance().setQuarters(1).setDimes(1).build();
                        
        }
    });
    t1.start();
 
    Thread t2 = new Thread(new Runnable() {
        @Override public void run() {
        	  currency = USCurrency_Good.Builder.newInstance().setQuarters(2).setDimes(2).build();
        }
    });
    t2.start();
 
    //...
  }
}