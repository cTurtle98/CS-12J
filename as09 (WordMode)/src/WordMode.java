import java.util.Scanner;
import java.util.TreeMap;

/**
 * a Java program that determines and prints the most frequently occurring word in a body of text in
 * standard input.
 * 
 * @author ciaran farley for CS-12J at cabrillo
 *
 */
public class WordMode {
  /**
   * a comment for comments sake
   * 
   * @param args is the command line arguments0
   */

  public static void main(String[] args) {
    /**
     * something needs to go here
     */

    // all the args processing here
    int minLength;
    try {
      minLength = Integer.parseInt(args[0]);
    } catch (Exception e) {
      minLength = 5;
    }

    var wordCounts = new TreeMap<String, Integer>();

    int mostCommonCount = 0;
    String mostCommonWord = "";

    var stdin = new Scanner(System.in);
    while (stdin.hasNext()) {
      String[] possibleWords =
          stdin.next().replaceAll("(^[^A-Za-z]+)|([^A-Za-z]+$)", "").split("-");
      for (String wordpiece : possibleWords) {

        if (wordpiece.length() < minLength) {
          continue;
        }

        // lowercase all the things
        String wordpiecelower = wordpiece.toLowerCase();

        try {
          wordCounts.put(wordpiecelower, wordCounts.get(wordpiecelower) + 1);
        } catch (Exception e) {
          wordCounts.put(wordpiecelower, 1);
        }
        if (wordCounts.get(wordpiecelower) > mostCommonCount
            || wordCounts.get(wordpiecelower) == mostCommonCount
                && wordpiecelower.compareTo(mostCommonWord) < 0) {
          mostCommonCount = wordCounts.get(wordpiecelower);
          mostCommonWord = wordpiecelower;
        }
      }
    }
    if (mostCommonCount > 0) {
      System.out.println(mostCommonWord + " " + mostCommonCount);
    }
    stdin.close();
  }
}
