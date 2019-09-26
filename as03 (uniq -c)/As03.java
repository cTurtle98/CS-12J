import java.util.Scanner;
     2	
     3	/**
     4	 * Ciaran Farley for CS-12J
     5	 * Assignment 03 - copy of "uniq -c"
     6	 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_03
     7	 **/
     8	
     9	public class As03 {
    10	  /** This is the main **/
    11	  public static void main(String[] args) {
    12	    
    13	    // makes scanner object for handling input
    14	    Scanner input = new Scanner(System.in);
    15	    
    16	    //variable declaration for the first input
    17	    String previusLine = "";
    18	    
    19	    //take the first line in
    20	    if (input.hasNextLine()) {
    21	      previusLine = input.nextLine();
    22	    }
    23	    else {
    24	      return;
    25	    }
    26	    
    27	    //rest of the variable declarations so they dont get set if I dont need them
    28	    String nextLine = "";
    29	    int counter = 1;
    30	    
    31	    //start comparing lines
    32	    while (input.hasNextLine()) {
    33	      
    34	      //get the next value for comparing with the last value
    35	      nextLine = input.nextLine();
    36	      
    37	      //strings are weird I know thats how you compare
    38	      if (nextLine.equals(previusLine)) {
    39	        //add to the counter if the values are equal
    40	        counter++;
    41	      }
    42	      else {
    43	        // once nextline is no longer equal to previus line print the previus line
    44	        System.out.println(counter + " " + previusLine);
    45	        //reset the counter at the end of uniquness
    46	        counter = 1;
    47	      }
    48	      
    49	      //set the previus line for the next time the loop runs
    50	      previusLine = nextLine;
    51	      
    52	    }
    53	    
    54	    System.out.println(counter + " " + previusLine);
    55	
    56	  }
    57	}
