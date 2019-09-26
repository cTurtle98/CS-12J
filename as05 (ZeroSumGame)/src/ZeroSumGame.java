import java.util.Scanner;

/**
 * ZeroSumGame assignment 05
 * 
 * @author Ciaran Farley for CS-12J at Cabrillo College Spring 2019
 * 
 */

public class ZeroSumGame {
  /**
   * run this program with command line arguments
   * the first is the initial value for each player
   * the rest are the names of all the players you want to keep track of
   * 
   * after the program starts it will ask for input
   * input is delimited by spaces
   * first input it the person to take from
   * second is who to give to
   * third is how much to transfer
   */
  public static void main(String[] names) {
    int initialAmount = Integer.parseInt(names[0]);
    int[] balances = new int[names.length];
    Scanner input = new Scanner(System.in);

    // set the balance array values to the initial amount
    for (int i = 0; i < balances.length; ++i)
      balances[i] = initialAmount;

    // Process a command
    while (input.hasNext()) {
      // parse input
      String fromName = input.next();
      int fromIndex = findIndex(names, fromName);
      String toName = input.next();
      int toIndex = findIndex(names, toName);
      int amount = input.nextInt();

      // update balances
      balances[fromIndex] = balances[fromIndex] - amount;
      balances[toIndex] = balances[toIndex] + amount;

    }
    // Print highest and lowest
    int highestIndex = findIndexHighest(balances);
    int lowestIndex = findIndexLowest(balances);

    // print highest
    System.out.print("Highest: ");
    System.out.print(names[highestIndex]);
    System.out.print(" (");
    System.out.print(balances[highestIndex]);
    System.out.println(")");

    // print lowest
    System.out.print("Lowest: ");
    System.out.print(names[lowestIndex]);
    System.out.print(" (");
    System.out.print(balances[lowestIndex]);
    System.out.println(")");

    input.close();
  }

  private static int findIndex(String[] namesArray, String name) {
    for (int i = 0; i <= namesArray.length; ++i)
      if (namesArray[i].equals(name))
        return i;
    return -1;
  }

  private static int findIndexHighest(int[] balances) {
    int currentHighest = 0;
    for (int i = 1; i <= balances.length - 1; ++i)
      if (balances[i] > currentHighest)
        currentHighest = balances[i];
    for (int i = 1; i <= balances.length; ++i)
      if (balances[i] == currentHighest)
        return i;
    return -1;
  }

  private static int findIndexLowest(int[] balances) {
    int currentLowest = balances[0];
    for (int i = 1; i <= balances.length - 1; ++i)
      if (balances[i] < currentLowest)
        currentLowest = balances[i];
    for (int i = 1; i <= balances.length; ++i)
      if (balances[i] == currentLowest)
        return i;
    return -1;
  }

}
