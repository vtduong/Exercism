class RotationalCipher {
	private int shift = 0;

    RotationalCipher(int shiftKey) {
    	//because 0 is the same as 26...
    	shift = shiftKey;
    }

    String rotate(String data) {
    	//list of new characters
    	StringBuilder result = new StringBuilder(data.length());
    	//covert each letter to ascii value and shift it
    	for (int i = 0; i < data.length(); i++){
    		int shifted = 0; 
    		if (Character.isLetter(data.charAt(i))){
    			if(Character.isLowerCase(data.charAt(i))){
    				//because 0 shift is the same as 26 shifts and letter rotates
	    			shifted = ((int)data.charAt(i) + shift) % 123;
	    			if(shifted < 97)
	    				shifted += 97;
    			}
    			else{
    				//because 0 shift is the same as 26 shifts and letter rotates
	    			shifted = ((int)data.charAt(i) + shift) % 91;
	    			if(shifted < 65)
	    				shifted += 65;
    			}
    			//add to list
	    		result.append(Character.toChars(shifted));
	    	} else
	    	//add to list
	    	result.append(data.charAt(i));
    	}
    	return result.toString();
    }

}
