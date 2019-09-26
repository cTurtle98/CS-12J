import java.util.Scanner;
	
/**
 * Ciaran Farley for CS-12J
 * Velocity given time
 * https://jeff.cis.cabrillo.edu/classes/cs12js19/assignments/assignment_02
 **/
public class VelocityGivenTime {
  /** idk why I need this **/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("whats the acceleration? ");
    double acceleration = input.nextDouble();
    System.out.println("whats the time? ");
    double time = input.nextDouble();
    System.out.println("Whats the initial velocity");
    double velocity0 = input.nextDouble();
    
    double velocityFinal = velocity0 + acceleration * time;
    
    System.out.printf("%.2f", velocityFinal);
  }
}
