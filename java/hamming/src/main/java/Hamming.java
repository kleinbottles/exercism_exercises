public class Hamming {

    private String left;
    private String right;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        left = leftStrand;
        right = rightStrand;
        if (left.isEmpty() && right.length() > 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        }else if (right.isEmpty() && left.length() > 0){
            throw new IllegalArgumentException("right strand must not be empty.");
        }else if (left.length() != right.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int result = 0;
        for (int i = 0; i < left.length(); i++){
            int leftChar = left.charAt(i);
            int rightChar = right.charAt(i);
            if (leftChar != rightChar){
                result += 1;
            }
        }
        return result;
    }
}
