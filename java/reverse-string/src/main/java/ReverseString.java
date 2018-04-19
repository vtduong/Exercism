class ReverseString {

    String reverse(String s) {
        StringBuilder sBuilder = new StringBuilder(s);
        sBuilder.reverse();
        return sBuilder.toString();
    }
  
}