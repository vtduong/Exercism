import java.util.ArrayList;

public class PangramChecker {

    public boolean isPangram(String input) {
    	//ALTERNATIVE: char is treated as integer in java
        
        //construct a list of numbers representing letter a-z in ascii value
        // ArrayList<Integer> ascii = new ArrayList<>(26);
        // int a = 97;
        // for (int i = 0; i < 26; i++){
        // 	ascii.add(a++);
        // }
        if (input.length() < 26)
        	return false;

        input = input.toLowerCase();

        for (char c = 'a'; c <='z'; c++){
        	if(input.indexOf(c) < 0)
        		return false;
        }
        return true;
        
        //for each character in input, convert to ascii and check if it is in the list
        //escape if either the list is empty or all characters have been checked
    //     for (int i = 0; i < input.length(); i++){
    //     	int asc = input.charAt(i);
    //     	if (ascii.contains(asc)){
    //     		ascii.remove(ascii.indexOf(asc));
    //     	}

    //     	if(ascii.size() == 0)
    //     		return true;
    //     }
    //     return false;

     }

}
