import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * this code creates a sierpinski triangle
 * 
 * @author ciaran farley for cs-12j at cabrilo college
 */
public class SierpinskiTriangle {

  /**
   * 
   * @param args width height minimum_area foreground/drawing_color output_filename
   */
  public static void main(String[] args) {

    // store args as variables of the proper type
    int widthPixels = Integer.parseInt(args[0]);
    int heightPixels = Integer.parseInt(args[1]);
    double minimumArea = Double.parseDouble(args[2]);
    Color drawingColor = Color.decode(args[3]);
    String filename = args[4];

    // instanciate a buffered image with width and height from args
    var image = new BufferedImage(widthPixels, heightPixels, BufferedImage.TYPE_INT_RGB);

    // instanciate the drawing class for making the image
    Graphics2D graphics = image.createGraphics();

    // calculate the background color
    var backgroundColor = new Color(255 - drawingColor.getRed(), 255 - drawingColor.getGreen(),
        255 - drawingColor.getBlue());

    // set the background color
    graphics.setBackground(backgroundColor);

    // draw the whole image with the background color
    graphics.clearRect(0, 0, image.getWidth(), image.getHeight());

    // set the color for drawing in the image from args
    graphics.setColor(drawingColor);

    double topX = (widthPixels - 1) / 2;
    double topY = 0;
    double leftX = 0;
    double leftY = heightPixels - 1;
    double rightX = widthPixels - 1;
    double rightY = heightPixels - 1;

    triangle(graphics, topX, topY, leftX, leftY, rightX, rightY, minimumArea);

    try {
      ImageIO.write(image, "png", new File(filename));
    } catch (Exception e) {
      System.err.println("Unable to write image file!: " + e.getMessage());
    }

  }

  private static void triangle(Graphics2D graphics, double topX, double topY, double leftX,
      double leftY, double rightX, double rightY, double minimumArea) {
    /*
     * x = width
     * y = height
     * these are cordinates to the point in image format of 0,0 as top left
     */

    // triangle area = height times base div 2
    double triangleArea = Math.abs(topY - leftY) * (Math.abs(leftX - rightX)) / 2;

    // if the next triangle to draw is too small abort
    if (triangleArea < minimumArea) {
      return;
    }

    // draw the lines for this triangle
    graphics.drawLine((int) Math.round(leftX), (int) Math.round(leftY), (int) Math.round(rightX),
        (int) Math.round(rightY));
    graphics.drawLine((int) Math.round(leftX), (int) Math.round(leftY), (int) Math.round(topX),
        (int) Math.round(topY));
    graphics.drawLine((int) Math.round(rightX), (int) Math.round(rightY), (int) Math.round(topX),
        (int) Math.round(topY));

    // draw the lines for the triangles in the triangles
    // T1
    triangle(graphics, topX, topY, /* leftX */midpoint(leftX, topX),
        /* leftY */midpoint(topY, leftY), /* rightX */midpoint(topX, rightX),
        /* rightY */midpoint(topY, rightY), minimumArea);
    // T2
    triangle(graphics, /* topX */midpoint(leftX, topX), /* TopY */midpoint(topY, leftY), leftX,
        leftY, /* rightX */midpoint(leftX, rightX), rightY, minimumArea);
    // T3
    triangle(graphics, /* topX */midpoint(topX, rightX), /* topY */midpoint(topY, rightY),
        /* leftX */midpoint(leftX, rightX), leftY, rightX, rightY, minimumArea);

  }

  private static double midpoint(double num1, double num2) {
    return (num1 + num2) / 2.0;
  }

}
