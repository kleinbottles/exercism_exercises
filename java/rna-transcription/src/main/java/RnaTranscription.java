import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        HashMap<String, String> mapping = mapping();
        String[] splitInput = dnaStrand.split("(?!^)");

        if (dnaStrand.equals(result)) return result;
        for (String letter : splitInput ){
            result += mapping.get(letter);
        }
        return result;
    }

    HashMap<String, String> mapping() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("G", "C");
        map.put("C", "G");
        map.put("T", "A");
        map.put("A", "U");
        return map;
    }

}
