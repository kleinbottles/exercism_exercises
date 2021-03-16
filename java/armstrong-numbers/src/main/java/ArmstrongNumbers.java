class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int digits = 0;
        int newNum = numberToCheck;
        double sumToCheck = 0;
        double testNumber = numberToCheck;
        if (numberToCheck < 9) return true;
        while (newNum != 0){
          newNum = newNum / 10;
          digits += 1;
        }
        newNum = numberToCheck;
        while(newNum != 0){
            sumToCheck = sumToCheck + (Math.pow((newNum%10), digits));
            newNum = newNum / 10;
        }
        if (testNumber == sumToCheck) return true;
        return false;

    }



}
