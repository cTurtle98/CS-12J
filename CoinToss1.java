public class CoinToss1 {
  /** Print either "Heads" or "Tails" but not both. "Randomly." */
  public static void main(String[] args) {
    if (Math.random() < .5) {
      System.out.println("Heads");
    else
      System.out.println("Tails");
  }
}

