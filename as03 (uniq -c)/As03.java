import java.util.Scanner;

/**
 * Ciaran Farley for CS-12J
 * Assignment 03 - copy of "uniq -c"
 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_03
 **/

public class As03 {
  /** This is the main **/
  public static void main(String[] args) {
    
    // makes scanner object for handling input
    Scanner input = new Scanner(System.in);
    
    //variable declaration for the first input
    String previusLine = "";
    
    //take the first line in
    if (input.hasNextLine()) {
        previusLine = input.nextLine();
    }
    else {
      return;
    }
    
    //rest of the variable declarations so they dont get set if I dont need them
    String nextLine = "";
    int counter = 1;
    
    //start comparing lines
    while (input.hasNextLine()) {
      
       //get the next value for comparing with the last value
      nextLine = input.nextLine();
      
      //strings are weird I know thats how you compare
      if (nextLine.equals(previusLine)) {
       //add to the counter if the values are equal
       counter++;
      }
      else {
        // once nextline is no longer equal to previus line print the previus line
        System.out.println(counter + " " + previusLine);
        //reset the counter at the end of uniquness
       counter = 1;
      }
      
      //set the previus line for the next time the loop runs
      previusLine = nextLine;
      
    }
    
    System.out.println(counter + " " + previusLine);
  }
}
