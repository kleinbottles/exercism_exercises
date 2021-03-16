import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) throws IllegalArgumentException {
        if (square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }else{
            BigInteger base = new BigInteger("2");
            BigInteger result = base.pow(square - 1);
            return result;
        }
    }

    BigInteger grainsOnBoard() {
        int value = 0;
        BigInteger result = BigInteger.valueOf(value);
        for (int i = 1; i < 65; i++){
            result = result.add(grainsOnSquare(i));
        }
        return result;
    }

}
