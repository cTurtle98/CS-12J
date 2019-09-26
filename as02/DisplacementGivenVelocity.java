     1	import java.util.Scanner;
     2	
     3	/**
     4	  * Ciaran Farley for CS-12J
     5	  * Displacement Given Time
     6	  * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
     7	**/
     8	public class DisplacementGivenVelocity {
     9	  /** idk why I need this **/
    10	  public static void main(String[] args) {
    11	    Scanner input = new Scanner(System.in);
    12	    
    13	    System.out.println("whats the time? ");
    14	    double time = input.nextDouble();
    15	    
    16	    System.out.println("Whats the initial velocity");
    17	    double velocity0 = input.nextDouble();
    18	    
    19	    System.out.println("whats the final velocity");
    20	    double velocityFinal = input.nextDouble();
    21	    
    22	    double displacement = time * ( ( velocity0 + velocityFinal ) / 2 );
    23	    System.out.printf("%.2f", displacement);
    24	  }
    25	}
