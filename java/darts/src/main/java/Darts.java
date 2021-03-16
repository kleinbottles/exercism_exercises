import javax.lang.model.util.ElementScanner6;

class Darts {
    double hypot;
    double hitArea;

    Darts(double x, double y) {
        hypot = (x*x) + (y*y);
        hitArea = area(Math.sqrt(hypot));
    }

    private static double area(double radius){
        return Math.PI * (radius * radius);
    }

    int score() {
        int result = 0;
        if (this.hitArea > area(10)){
            result = 0;
        }else if(this.hitArea > area(5)){
            result = 1;
        }else if (this.hitArea > area(1)){
            result = 5;
        }else {
            result = 10;
        }
        return result;
    }

}
