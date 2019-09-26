 /**
public class ProteinFinder_OLD {
  public static void main(String[] args) {
  
  while ((rna.indexOf("AUG", startCodonIndex + 3)) != -1) {
    String nextCodon = rna.substring(startCodonIndex, startCodonIndex + 3);
    int currentCodonIndex = startCodonIndex;
    while (!isStopCodon(nextCodon) && currentCodonIndex <= rna.length() - 3) {
      protein.append(proteinTranslate(nextCodon));
      nextCodon = rna.substring(currentCodonIndex , currentCodonIndex + 3) ;
      currentCodonIndex = currentCodonIndex + 3;
    }
    // if protein is longer than 20 chars and the codon is an end codon print it
    if ((protein.toString().length() >= 20) && isStopCodon(nextCodon) ) {
      System.out.println(protein);
      // cleanup remove protein value for next loopover
      protein.setLength(0);
    }
    else if ((protein.toString().length() <= 20) && isStopCodon(nextCodon) ) {
      // cleanup remove protein value for next loopover
      protein.setLength(0);
    }
    

    int nextStartCodonIndex = rna.indexOf("AUG", startCodonIndex + 3);
    startCodonIndex = nextStartCodonIndex;
  }
  }
}
*/