     1	import java.util.Scanner;
     2	
     3	/**
     4	 * Ciaran Farley for CS-12J
     5	 * Displacement given Acceleration
     6	 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
     7	 **/
     8	public class DisplacementGivenAcceleration {
     9	  /** idk why I need this **/
    10	  public static void main(String[] args) {
    11	    Scanner input = new Scanner(System.in);
    12	    
    13	    System.out.println("whats the acceleration? ");
    14	    double acceleration = input.nextDouble();
    15	    
    16	    System.out.println("whats the time? ");
    17	    double time = input.nextDouble();
    18	    
    19	    System.out.println("Whats the initial velocity");
    20	    double velocity0 = input.nextDouble();
    21	    
    22	    double displacement = velocity0 * time + .5 * acceleration * time * time;
    23	    
    24	    System.out.printf("%.2f", displacement);
    25	  }
    26	}
