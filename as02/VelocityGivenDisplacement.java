  1	import java.util.Scanner;
     2	
     3	/**
     4	 * Ciaran Farley for CS-12J
     5	 * Assignment02 - Velocity given displacement
     6	 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
     7	 **/
     8	public class VelocityGivenDisplacement {
     9	  /** idk why I need this **/
    10	  public static void main(String[] args) {
    11	    
    12	    Scanner input = new Scanner(System.in);
    13	   
    14	    System.out.println("Whats the initial velocity");
    15	    double velocity0 = input.nextDouble(); 
    16	    
    17	    System.out.println("whats the acceleration? ");
    18	    double acceleration = input.nextDouble();
    19	    
    20	    System.out.println("Whats the displacement?");
    21	    double displacement = input.nextDouble();
    22	    
    23	    double velocity = Math.sqrt(velocity0 * velocity0 + 2 * acceleration * displacement);
    24	    
    25	    System.out.printf("%.2f", velocity);
    26	  }
    27	}
