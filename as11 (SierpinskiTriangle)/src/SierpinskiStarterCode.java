import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Class SierpinskiStarterCode is a demo for this assignment.
 */
public class SierpinskiStarterCode {

  /**
   * Writes a sample image to file "sierpinski-demo.png"
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    // A 320x240-pixel RGB image
    BufferedImage image = new BufferedImage(320, 240, BufferedImage.TYPE_INT_RGB);
    // Graphics2D is our "drawing" class
    Graphics2D graphics = image.createGraphics();
    // Any clearing operations will use a yellow color
    graphics.setBackground(Color.decode("#ffff00"));
    // Clear the image to the background color
    graphics.clearRect(0, 0, image.getWidth(), image.getHeight());
    // Any drawing operations will use a blue color
    graphics.setColor(Color.decode("#0000ff"));
    // Draw a line from the upper-left corner (0, 0) to the lower-right corner (width - 1, height - 1):
    graphics.drawLine(0, 0, image.getWidth() - 1, image.getHeight() - 1);
    // Draw a line from the lower-left corner (0, height - 1) to the upper-right corner (width - 1, 0):
    graphics.drawLine(0, image.getHeight() - 1, image.getWidth() - 1, 0);
    // Save the image as a PNG file named "sierpinski-demo.png"
    try {
      ImageIO.write(image, "png", new File("sierpinski-demo.png"));
    } catch (Exception e) {
      System.err.println("Unable to write image file!: " + e.getMessage());
    }
  }

}