import java.util.Scanner;

/**
 * Ciaran Farley for CS-12J
 * Assignment02 - Velocity given displacement
 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
 **/
public class VelocityGivenDisplacement {
  /** idk why I need this **/
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
   
    System.out.println("Whats the initial velocity");
    double velocity0 = input.nextDouble(); 
    
    System.out.println("whats the acceleration? ");
    double acceleration = input.nextDouble();
    
    System.out.println("Whats the displacement?");
    double displacement = input.nextDouble();
    
    double velocity = Math.sqrt(velocity0 * velocity0 + 2 * acceleration * displacement);
    
    System.out.printf("%.2f", velocity);
  }
}
