import java.util.HashMap;

class ResistorColorDuo {
    int value(String[] colors) {
        HashMap<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("black", 0);
        mapping.put("brown", 1);
        mapping.put("red", 2);
        mapping.put("orange", 3);
        mapping.put("yellow", 4);
        mapping.put("green", 5);
        mapping.put("blue", 6);
        mapping.put("violet", 7);
        mapping.put("grey", 8);
        mapping.put("white", 9);
        int digitOne = mapping.get(colors[0]);
        int digitTwo = mapping.get(colors[1]);
        String digOne = Integer.toString(digitOne);
        String digTwo = Integer.toString(digitTwo);
        String result = digOne + digTwo;
        return Integer.parseInt(result);

    }

}
