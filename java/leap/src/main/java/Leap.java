class Leap {

    boolean isLeapYear(int year) {
        boolean divBy400 = (year % 400 == 0);
        boolean divBy100 = (year % 100 == 0);
        if (year % 4 == 0 && ((!divBy100 && !divBy400) || (divBy100 && divBy400))) {
          return true;
        }
        return false;
    }

}
