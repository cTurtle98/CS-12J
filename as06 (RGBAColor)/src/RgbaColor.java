/**
 * 
 * Class RgbaColor represents a 32-bit RGBA color. Component values are represented internally as
 * Java <code>byte</code> values (range <code>[-128, 127]</code>) for compact storage, but
 * externally and conceptually as int values in the range <code>[0, 255]</code> and/or
 * floating-point values in the range <code>[0.0, 1.0]</code> for convenience.
 * 
 * @see <a href="https://en.wikipedia.org/wiki/RGBA_color_space">RGBA color space</a>
 * 
 * @author Ciaran Farley, cdfarley@jeff.cis.cabrillo.edu
 *
 */
public class RgbaColor {

  /** The red component of this color */
  private byte red;
  /** The green component of this color */
  private byte green;
  /** The blue component of this color */
  private byte blue;
  /** The alpha component of this color */
  private byte alpha;

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0, 255].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * @param alpha the alpha component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(int red, int green, int blue, int alpha) {
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
    this.setAlpha(alpha);
  }

  /**
   * Constructs a new RgbaColor with the specified RGB component values, and an alpha component of
   * 255. All component values provided are assume to fall within [0, 255].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(int red, int green, int blue) {
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
    this.setAlpha(255);
  }

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0, 255].
   * 
   * @param components an array of length at least 4, where [0] contains the red component of the
   *          color, [1], contains the green component, [2] contains the blue component, and [3]
   *          contains the alpha component
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(int[] components) {
    this.setRed(components[0]);
    this.setGreen(components[1]);
    this.setBlue(components[2]);
    this.setAlpha(components[3]);
  }

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0.0, 1.0].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * @param alpha the alpha component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(double red, double green, double blue, double alpha) {
    this.setRed(this.doubleToInt(red));
    this.setGreen(this.doubleToInt(green));
    this.setBlue(this.doubleToInt(blue));
    this.setAlpha(this.doubleToInt(alpha));
  }

  /**
   * Constructs a new RgbaColor with the specified RGB component values, and an alpha component of
   * 1.0. All component values provided are assume to fall within [0.0, 1.0].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(double red, double green, double blue) {
    this.setRed(this.doubleToInt(red));
    this.setGreen(this.doubleToInt(green));
    this.setBlue(this.doubleToInt(blue));
    this.setAlpha(255);
  }

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0.0, 1.0].
   * 
   * @param components an array of length at least 4, where [0] contains the red component of the
   *          color, [1], contains the green component, [2] contains the blue component, and [3]
   *          contains the alpha component
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(double[] components) {
    this.setRed(this.doubleToInt(components[0]));
    this.setGreen(this.doubleToInt(components[1]));
    this.setBlue(this.doubleToInt(components[2]));
    this.setAlpha(this.doubleToInt(components[3]));
  }

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0.0, 1.0].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * @param alpha the alpha component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(float red, float green, float blue, float alpha) {
    this.setRed(this.doubleToInt((double) red));
    this.setGreen(this.doubleToInt((double) green));
    this.setBlue(this.doubleToInt((double) blue));
    this.setAlpha(this.doubleToInt((double) alpha));
  }

  /**
   * Constructs a new RgbaColor with the specified RGB component values, and an alpha component of
   * 1.0. All component values provided are assume to fall within [0.0, 1.0].
   * 
   * @param red the red component of the color
   * @param green the green component of the color
   * @param blue the blue component of the color
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(float red, float green, float blue) {
    this.setRed(this.doubleToInt((double) red));
    this.setGreen(this.doubleToInt((double) green));
    this.setBlue(this.doubleToInt((double) blue));
    this.setAlpha(255);
  }

  /**
   * Constructs a new RgbaColor with the specified RGBA component values. All component values
   * provided are assume to fall within [0.0, 1.0].
   * 
   * @param components an array of length at least 4, where [0] contains the red component of the
   *          color, [1], contains the green component, [2] contains the blue component, and [3]
   *          contains the alpha component
   * 
   * @throws IllegalArgumentException if any component value is out of range
   */
  public RgbaColor(float[] components) {
    this.setRed(this.doubleToInt((double) components[0]));
    this.setGreen(this.doubleToInt((double) components[1]));
    this.setBlue(this.doubleToInt((double) components[2]));
    this.setAlpha(this.doubleToInt((double) components[3]));
  }

  /**
   * Returns the red component of this color.
   * 
   * @return the red component of this color, in the range [0, 255]
   */
  public int getRed() {
    return (int) this.red + 128;
  }

  /**
   * Sets the red component of this color.
   * 
   * @param red the new value for this color's red component, assumed to be in <code>[0, 255]</code>
   * 
   * @throws IllegalArgumentException if the component value is out of range
   */
  public void setRed(int red) {
    this.red = this.intToByte(red);
  }

  /**
   * Returns the green component of this color.
   * 
   * @return the green component of this color, in the range [0, 255]
   */
  public int getGreen() {
    return (int) this.green + 128;
  }

  /**
   * Sets the green component of this color.
   * 
   * @param green the new value for this color's green component, assumed to be in
   *          <code>[0, 255]</code>
   * 
   * @throws IllegalArgumentException if the component value is out of range
   */
  public void setGreen(int green) {
    this.green = this.intToByte(green);
  }

  /**
   * Returns the blue component of this color.
   * 
   * @return the blue component of this color, in the range [0, 255]
   */
  public int getBlue() {
    return (int) this.blue + 128;
  }

  /**
   * Sets the blue component of this color.
   * 
   * @param blue the new value for this color's blue component, assumed to be in
   *          <code>[0, 255]</code>
   * 
   * @throws IllegalArgumentException if the component value is out of range
   */
  public void setBlue(int blue) {
    this.blue = this.intToByte(blue);
  }

  /**
   * Returns the alpha component of this color.
   * 
   * @return the alpha component of this color, in the range [0, 255]
   */
  public int getAlpha() {
    return (int) this.alpha + 128;
  }

  /**
   * Sets the alpha component of this color.
   * 
   * @param alpha the new value for this color's alpha component, assumed to be in
   *          <code>[0, 255]</code>
   * 
   * @throws IllegalArgumentException if the component value is out of range
   */
  public void setAlpha(int alpha) {
    this.alpha = this.intToByte(alpha);
  }

  /**
   * "Darkens" this color by reducing each RGB component by a percentage of the possible range,
   * without any underflow. The alpha component is left unchanged.
   * 
   * @param factor the percentage factor of reduction, in <code>[0.0, 1.0]</code>. For example, if
   *          factor is <code>.0625</code>, each RGB value is reduced by up to <code>16</code>,
   *          since <code>256 * .0625 == 16</code>. All reductions are rounded to the nearest
   *          <code>byte</code> value.
   * 
   * @throws IllegalArgumentException if the factor is outside <code>[0.0, 1.0]</code>
   */
  public void darken(double factor) {
    if (factor < 0.0 || factor > 1.0) {
      throw new IllegalArgumentException(
          "Can't darken by that amount, Component value is out of range.");
    }

    int factorInt = (int) Math.round(factor * 255.0);

    if (this.getRed() > factorInt) {
      this.setRed(this.getRed() - factorInt);
    } else {
      this.setRed(0);
    }

    if (this.getGreen() > factorInt) {
      this.setGreen(this.getGreen() - factorInt);
    } else {
      this.setGreen(0);
    }

    if (this.getBlue() > factorInt) {
      this.setBlue(this.getBlue() - factorInt);
    } else {
      this.setBlue(0);
    }

  }

  /**
   * "Lightens" this color by increasing each RGB component by a percentage of the possible range,
   * without any overflow. The alpha component is left unchanged.
   * 
   * @param factor the percentage factor of increase, in <code>[0.0, 1.0]</code>. For example, if
   *          factor is <code>.0625</code>, each RGB value is increased by up to <code>16</code>,
   *          since <code>256 * .0625 == 16</code>. All increases are rounded to the nearest
   *          <code>byte</code> value.
   * 
   * @throws IllegalArgumentException if the factor is outside <code>[0.0, 1.0]</code>
   */
  public void lighten(double factor) {
    if (factor < 0.0 || factor > 1.0)
      throw new IllegalArgumentException(
          "Can't lighten by that amount, Component value is out of range.");
    int factorInt = (int) Math.round(factor * 255.0);
    if (255 - this.getRed() >= factorInt) {
      this.setRed(this.getRed() + factorInt);
    } else {
      this.setRed(255);
    }
    if (255 - this.getGreen() >= factorInt) {
      this.setGreen(this.getGreen() + factorInt);
    } else {
      this.setGreen(255);
    }
    if (255 - this.getBlue() >= factorInt) {
      this.setBlue(this.getBlue() + factorInt);
    } else {
      this.setBlue(255);
    }
  }

  /**
   * Modifies the RGB components of this color represent its naive RGB complement. The alpha
   * component is left unchanged. For example, a color with RGBA components
   * <code>(0, 120, 255, 200)</code> would subsequently become <code>(255, 135, 0, 200)</code>.
   */
  public void complement() {
    this.setRed(this.complimentary(this.getRed()));
    this.setGreen(this.complimentary(this.getGreen()));
    this.setBlue(this.complimentary(this.getBlue()));
  }

  /**
   * Creates and returns a new color object representing the naive RGB complement of this color.
   * 
   * @return a new RgbaColor representing the naive RGB complement of this color, as calculated in
   *         {@link #complement()}. For example, a color with RGBA components
   *         <code>(0, 120, 255, 200)</code> would return a color object with components
   *         <code>(255, 135, 0, 200)</code>.
   */
  public RgbaColor complementaryColor() {
    return new RgbaColor(this.complimentary(this.getRed()), this.complimentary(this.getGreen()),
        this.complimentary(this.getBlue()), this.getAlpha());
  }

  /**
   * Calculates and returns a standard "hex string" compatible with CSS.
   * 
   * @return a string that represents this color as a lowercase RGB hex string compatible with CSS,
   *         viz. a 7-character string starting with '#' and containing hexadecimal equivalents of
   *         each RGB component. e.g. the color <code>(0, 255, 132)</code> would return a value
   *         of <code>"#00ff84"</code>.
   * 
   * @see <a href="https://www.w3schools.com/cssref/css_colors_legal.asp">CSS Legal Color Values</a>
   */
  public String toCssHexString() {
    return String.format("#%02x%02x%02x", this.getRed(), this.getGreen(), this.getBlue());
  }

  /**
   * Calculates and returns a string representing a RGBA color compatible with CSS.
   * 
   * @return a string that represents this color as a call to the "rgba" CSS function, viz.
   *         the string <code>"rgba(red, green, blue, alpha)"</code>, where the RGB components are
   *         expressed as integers in <code>[0, 255]</code> and the alpha component is represented
   *         as a floating-point value in <code>[0.0, 1.0]</code>, rounded to two digits after the
   *         decimal point. For example, the color <code>(0, 255, 132, 200)</code> would return a
   *         value of <code>"rgba(0, 255, 132, 0.78)"</code>.
   * 
   * @see <a href="https://www.w3schools.com/cssref/css_colors_legal.asp">CSS Legal Color Values</a>
   */
  public String toCssRgbaString() {
    StringBuilder output = new StringBuilder();
    output.append("rgba(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ", "
        + String.format("%.2f", intToDouble(this.getAlpha())) + ")");
    return output.toString();
  }

  /**
   * Returns a string representation of this color.
   * 
   * @return a string representation of this color, formatted as
   *         <code>"(red, green, blue, alpha)"</code>, where each RGBA component is represented as
   *         an integer in <code>[0, 255]</code>. For example, a return value of
   *         <code>"(0, 255, 132, 200)"</code> would represent a color with a red component of
   *         <code>0</code>, a green component of <code>255</code>, a blue component of
   *         <code>132</code>, and an alpha component of <code>200</code>.
   */
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ", "
        + this.getAlpha() + ")");

    return output.toString();
  }

  private byte intToByte(int input) {
    if (input >= 0 && input <= 255)
      return (byte) Math.round(input - 128);
    else {
      throw new IllegalArgumentException(
          "Can't convert from int to byte, Component value is out of range.");
    }
  }

  private int doubleToInt(double input) {
    if (input >= 0.0 && input <= 1.0)
      return (int) Math.round(input * 255.0);
    else {
      throw new IllegalArgumentException(
          "Can't convert from double to Int, Component value is out of range.");
    }
  }

  private double intToDouble(int input) {
    return input / 255.0;
  }

  private int complimentary(int input) {
    return 255 - input;
  }

}
