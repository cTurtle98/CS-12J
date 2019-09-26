public class GradientGenerator {
  public static void main(String[] args) {
    RgbaColor color = new RgbaColor(0, 0, 0, 255); // opaque black
    // We will print this color 65,536 times, representing a 256x256-pixel image.
    // Pixel coordinates are (0, 0) in the upper-left corner, (255, 0) in the upper-right, (0, 255)
    // in the lower-left, and (255, 255) in the lower-right.
    double diagonalLength = Math.sqrt(256 * 256 * 2);
    for (int blue = 0; blue < 256; ++blue) {
      color.setBlue(blue); // Each "row" will have an increasing amount of blue
      for (int red = 0; red < 256; ++red) {
        color.setRed(red); // Each "column" will have an increasing amount of red
        // The amount of green will be dictated by the proximity to the upper-left corner
        double distanceFromCenter = Math.sqrt(red * red + blue * blue);
        color.setGreen((int) Math.round((1 - distanceFromCenter / diagonalLength) * 255));
        System.out.println(color.toCssHexString());
      }
    }
  }
}