import java.util.Scanner;

/**
  * Ciaran Farley for CS-12J
  * Displacement Given Time
  * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
**/
public class DisplacementGivenVelocity {
  /** idk why I need this **/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("whats the time? ");
    double time = input.nextDouble();
    
    System.out.println("Whats the initial velocity");
    double velocity0 = input.nextDouble();
    
    System.out.println("whats the final velocity");
    double velocityFinal = input.nextDouble();
    
    double displacement = time * ( ( velocity0 + velocityFinal ) / 2 );
    System.out.printf("%.2f", displacement);
  }
}
