import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

/**
 * 
 * HomoglyphDecoder
 * program to decode text written in homoglyphs back to plain text askii
 * 
 * @author ciaran farley for cs-12j at cabrillo college spring 2019
 *
 */
public class HomoglyphDecoder {

  /**
   * 
   * @param args command line input unused
   */
  public static void main(String[] args) throws Exception {

    // open a new buffered reader on an input stream reader on a url of the homoglyphs dictionary
    // from jeff's website
    var homoglyphsReader = new BufferedReader(new InputStreamReader(
        new URL("http://jeff.cis.cabrillo.edu/datasets/homoglyphs_curated.txt").openStream()));

    // make the hashmap
    var homoglyphsMap = new HashMap<Integer, Character>();

    // make a string for each line in my homoglyph dictionary
    for (String homoglyphsLine; (homoglyphsLine = homoglyphsReader.readLine()) != null;) {

      // make an array of ints from the 32bit chars in the dictionary
      int[] homoglyphsLineArray = homoglyphsLine.codePoints().toArray();

      // store the askii character the homoglyphs should become
      char glyph = homoglyphsLine.charAt(0);

      // for each int in the intarray
      for (int homoglyph : homoglyphsLineArray) {

        // add homoglyph to map
        homoglyphsMap.put(homoglyph, glyph);

      }
    }

    // instantiate a buffered reader of an input stream reader of System.in
    var stdin = new BufferedReader(new InputStreamReader(System.in));

    // for each loop for each line of input from the buffered reader
    for (String line; (line = stdin.readLine()) != null;) {

      // for each int representation of 32bit chars from input
      for (int inputhomoglyph : line.codePoints().toArray()) {

        // get the decoded glyph from the map
        Character decodedGlyph = homoglyphsMap.get(inputhomoglyph);

        // if the return from the map is null
        if (decodedGlyph == null) {

          // just print the input
          System.out.print((char) inputhomoglyph);
        } else {
          // translation was successful so print the translated char
          System.out.print(homoglyphsMap.get(inputhomoglyph));
        }
      }
      System.out.println();
    }
  }

}
