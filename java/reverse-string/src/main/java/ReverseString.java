class ReverseString {

    String reverse(String inputString) {
        String [] splitString = inputString.split("");
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i-- ){
        reversedString += splitString[i];
        }
        return reversedString;


    }

}
