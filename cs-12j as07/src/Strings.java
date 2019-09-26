import java.io.FileInputStream;

/**
 * Strings java program emulates the GNU strings utility
 * 
 * @author Ciaran Farley for CS-12J at Cabrillo college
 *
 */
public class Strings {
  /**
   * this the main public class thing
   */

  /** All acceptable categories of "string" characters (except tab) */
  private static final byte[] ACCEPTABLE_CATEGORIES = { Character.CONNECTOR_PUNCTUATION,
      Character.CURRENCY_SYMBOL, Character.DASH_PUNCTUATION, Character.DECIMAL_DIGIT_NUMBER,
      Character.END_PUNCTUATION, Character.FINAL_QUOTE_PUNCTUATION,
      Character.INITIAL_QUOTE_PUNCTUATION, Character.LOWERCASE_LETTER, Character.MATH_SYMBOL,
      Character.MODIFIER_LETTER, Character.MODIFIER_SYMBOL, Character.OTHER_LETTER,
      Character.OTHER_NUMBER, Character.OTHER_PUNCTUATION, Character.OTHER_SYMBOL,
      Character.SPACE_SEPARATOR, Character.START_PUNCTUATION, Character.UPPERCASE_LETTER };

  private static boolean isValidChar(byte character) {
    if (character == '\t') {
      return true;
    }
    for (byte valid : ACCEPTABLE_CATEGORIES) {
      if (Character.getType(Byte.toUnsignedInt(character)) == valid) {
        return true;
      }
    }
    return false;
  }

  private static void findSequence(String filePath, int minLength) {
    /**
     * @input filePath the path of the file to open to look for character sequences
     * @input minLength the minimum length for character strings to be recognized
     *        prints to stderr is it can't find a given filename
     *        otherwise prints character strings to stdout
     */
    byte[] inputArray;

    try {
      var input = new FileInputStream(filePath);
      
      inputArray = input.readAllBytes();
      
      input.close();
      
      var sequence = new StringBuilder();

      for (byte i : inputArray) {
        if (isValidChar(i)) {
          
          sequence.append((char)Byte.toUnsignedInt(i));
        } else if (!(isValidChar(i))) {
          if (sequence.length() >= minLength) {
            System.out.println(sequence.toString());
          }
          sequence.setLength(0);
        }
      }
    } catch (Exception e) {
      System.err.println("file " + filePath + " does not exist or is empty");
    }
  }
  
  /**
   *  this is the main class that does the stuff
   */
  public static void main(String[] args) {

    int minLength;

    try {
      minLength = Integer.parseInt(args[0]);
    } catch (Exception e) {
      minLength = 4;
      findSequence(args[0], minLength);
    }
    for (int i = 1; i < args.length; i++) {
      findSequence(args[i], minLength);
    }

  }
}
