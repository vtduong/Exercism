import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dna) {
  //       * `G` -> `C`
		// * `C` -> `G`
		// * `T` -> `A`
		// * `A` -> `U`
		//Create a hash map from DNA to RNA
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		map.put('G', 'C');
		map.put('C', 'G');
		map.put('T', 'A');
		map.put('A', 'U');
		//Read each character, convert it, and add to rna strand
		StringBuilder rna = new StringBuilder(dna.length());
		for (int i = 0; i < dna.length(); i++){
			rna.append(map.get(dna.charAt(i)));
		}

		return rna.toString();

    }

}
