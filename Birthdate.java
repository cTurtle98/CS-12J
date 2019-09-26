import java.util.GregorianCalendar;
import java.util.Scanner;
 
/**
 * Scanner I/O
 * Selection (decision-making) control flow statement: if
 * 
 * @author Jeffrey Bergamini for CS 12J, jbergamini@jeff.cis.cabrillo.edu
 */
public class Birthdate {
 
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.printf("In what year were you born?: ");
    int year = userInput.nextInt();
    System.out.printf("In what month were you born?: ");
    int month = userInput.nextInt();
    System.out.printf("On what day of the month were you born?: ");
    int day = userInput.nextInt();
 
    GregorianCalendar birthdate = new GregorianCalendar(year, month, day);
    System.out.printf("You are roughly %.2f years old.%n",
        (System.currentTimeMillis() - birthdate.getTimeInMillis()) / 1000.0 / 60 / 60 / 24
            / 365.25);
 
    // More to come...
  }
 
}
