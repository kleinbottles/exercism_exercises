class Acronym {
    private String toConvert;

    Acronym(String phrase) {
        toConvert = phrase;
    }

    String get() {

        String result = toConvert.charAt(0) + "";
        for (int i = 1; i < toConvert.length(); i++){
            char current = toConvert.charAt(i);
            char next = (toConvert.length() - 1 > i + 1) ? toConvert.charAt(i + 1) : '0';
            boolean nextIsLetter = (next >= 'a' && next <= 'z' || next >= 'A' && next <= 'Z');
            boolean currentIsBeforeWord = (current == ' ' || current == '-' || current == '_');
            if (currentIsBeforeWord && nextIsLetter){
                result += Character.toUpperCase(toConvert.charAt(i + 1));
            }
        }
        return result;
    }

}
