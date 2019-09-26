import java.util.Scanner;
 
/**
 * Taking advantage of cascading cases in a switch statement. Modulo division again.
 * 
 * @author Jeffrey Bergamini for CS 12J, jbergamini@jeff.cis.cabrillo.edu
 */
public class DaysInMonth {
 
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.print("Year? ");
    int year = stdin.nextInt();
    System.out.print("Month? ");
    int month = stdin.nextInt();
 
    int numDays;
 
    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11: // September, April, June and November
        numDays = 30;
        break;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12: // Most others
        numDays = 31;
        break;
      case 2: // February
        numDays = 28; // TODO
        break;
      default:
        numDays = 0;
        break;
    }
    if (numDays > 0) {
      System.out.printf("%04d-%02d --> %d days%n", year, month, numDays);
    }
  }
 
}
