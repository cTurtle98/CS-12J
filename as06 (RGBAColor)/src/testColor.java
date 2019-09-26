
public class testColor {
  
  public static void main(String[] agrs) {
    
  //double[] testArray = { .5, .5, .5, .5 };
  //var testColor = new RgbaColor(testArray);
  //testColor.darken(0.5);
    
  var testColor = new RgbaColor(0, 255, 132);
  System.out.println(testColor.toCssRgbaString());
  System.out.println(testColor.toCssHexString());
  
  }
  
}