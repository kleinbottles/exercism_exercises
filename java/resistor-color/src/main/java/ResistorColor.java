class ResistorColor {
    int colorCode(String color) {
        String[] colors = colors();
        int index = 0;
        for (String each: colors){
          if (each.equals(color)){
              break;
          }
          index++;
        }
        return index;
    }

    String[] colors() {
       String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
       return arr;
    }
}
