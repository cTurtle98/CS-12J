import java.util.Scanner;

/**
 * Cabrillo COllege CS-12J Assignment 04
 * DNA to RNA translator and protein finder
 * 
 * @author Ciaran Farley
 */
public class ProteinFinder {
  /** this is required for good grade yay */
  public static void main(String[] args) {

    // Instantiate a string builder for creating the RNA string from the DNA input
    StringBuilder rnaBuilder = new StringBuilder();

    // Instantiate a scanner for reading from system in
    Scanner stdin = new Scanner(System.in);

    // check for scanner having a line of input
    while (stdin.hasNextLine())
      // add the DNA to the RNA while converting it to RNA
      rnaBuilder.append(stdin.nextLine().replace('T', 'U'));

    // convert the RNA string builder object to a string
    String rna = rnaBuilder.toString();

    // Instantiate a string builder for building the protein
    StringBuilder protein = new StringBuilder();

    // for each index of the start Codon before there are no more indexes
    for (int startCodonIndex = rna.indexOf("AUG"); startCodonIndex != -1; startCodonIndex =
        // find the next index at the end of each cycle
        rna.indexOf("AUG", startCodonIndex + 1)) {

      // make a substring of the RNA storing the next codon
      String nextCodon = rna.substring(startCodonIndex, startCodonIndex + 3);

      //
      int currentCodonIndex = startCodonIndex;

      while (!isStopCodon(nextCodon) && currentCodonIndex <= rna.length() - 6) {
        // add the amino acid for the current codon to the protein
        protein.append(proteinTranslate(nextCodon));

        // add 3 to the index to get the next codon on the next cycle
        currentCodonIndex = currentCodonIndex + 3;

        // get the next codon from the RNA string
        nextCodon = rna.substring(currentCodonIndex, currentCodonIndex + 3);
      }

      // if protein is longer than 20 chars and the next codon is an end codon
      if (protein.length() >= 20 && isStopCodon(nextCodon)) {
        // print the protein
        System.out.println(protein);
      }
      // cleanup, remove protein value for next loop over
      protein.setLength(0);
    }
    stdin.close();
  }

  private static boolean isStopCodon(String codon) {
    switch (codon) {
      case "UAA":
      case "UAG":
      case "UGA":
        return true;
      default:
        return false;
    }
  }

  private static char proteinTranslate(String codon) {
    switch (codon) { // https://en.wikipedia.org/wiki/Genetic_code#RNA_codon_table
      case "UUU":
      case "UUC":
        return 'F';
      case "UUA":
      case "UUG":
      case "CUU":
      case "CUC":
      case "CUA":
      case "CUG":
        return 'L';
      case "AUU":
      case "AUC":
      case "AUA":
        return 'I';
      case "AUG":
        return 'M';
      case "GUU":
      case "GUC":
      case "GUA":
      case "GUG":
        return 'V';
      case "UCU":
      case "UCC":
      case "UCA":
      case "UCG":
        return 'S';
      case "CCU":
      case "CCC":
      case "CCA":
      case "CCG":
        return 'P';
      case "ACU":
      case "ACC":
      case "ACA":
      case "ACG":
        return 'T';
      case "GCU":
      case "GCC":
      case "GCA":
      case "GCG":
        return 'A';
      case "UAU":
      case "UAC":
        return 'Y';
      case "CAU":
      case "CAC":
        return 'H';
      case "CAA":
      case "CAG":
        return 'Q';
      case "AAU":
      case "AAC":
        return 'N';
      case "AAA":
      case "AAG":
        return 'K';
      case "GAU":
      case "GAC":
        return 'D';
      case "GAA":
      case "GAG":
        return 'E';
      case "UGU":
      case "UGC":
        return 'C';
      case "UGG":
        return 'W';
      case "CGU":
      case "CGC":
      case "CGA":
      case "CGG":
        return 'R';
      case "AGU":
      case "AGC":
        return 'S';
      case "AGA":
      case "AGG":
        return 'R';
      case "GGU":
      case "GGC":
      case "GGA":
      case "GGG":
        return 'G';
      default:
        return ' ';
    }
  }
}