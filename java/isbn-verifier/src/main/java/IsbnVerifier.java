class IsbnVerifier {

    boolean isValid(String input) {

    	int sum = 0;
    	//strip hyphens
    	StringBuilder text = new StringBuilder(input.replaceAll("-", ""));
    	String s = text.toString();
    	//check length
    	if (s.length() != 10)
    		return false;
    	//calculate formula
    	for (int i = 0; i < s.length() -1; i++){
    		sum += Character.getNumericValue(s.charAt(i)) * (10 - i);
    	}
    	//convert X to 10
    	if(s.charAt(s.length() -1) == 'X')
    		sum += 10;
    	//character other than X and number
    	else {
    		int num = Character.getNumericValue(s.charAt(s.length() - 1));
    		if (num >= 0 && num <= 9)
    			sum += num;
    	}
    	return (sum % 11 == 0);


    }

}
