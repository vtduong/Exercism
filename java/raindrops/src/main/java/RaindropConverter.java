class RaindropConverter {

    String convert(int number) {
    	StringBuilder s = new StringBuilder();

    	if (number % 3 == 0 )   
    		s.append("Pling");
    	if (number % 5 == 0)
    		s.append("Plang");
    	if (number % 7 == 0)
    		s.append("Plong");
    	if (s.length() == 0)
    		return Integer.toString(number);
    	else return s.toString();

    }

	
}
