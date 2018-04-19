class Acronym {
	String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] words = phrase.split(" |-");
        StringBuilder acronym = new StringBuilder(words.length);
        for (String s : words){
        	acronym.append(s.charAt(0)); 
        }

        return acronym.toString().toUpperCase();
    }

}
