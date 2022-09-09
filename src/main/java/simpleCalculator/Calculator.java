package simpleCalculator;

public class Calculator {
    public Calculator(){
    }

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public long multiply(int x, int y){
        return x * y;
    }

    public double divide(int x, int y) {
        double result;
        if (y == 0){
            throw new IllegalArgumentException("Divisor can not be divided by 0!");
        }else {
            result = Double.valueOf(x)/Double.valueOf(y);
        }
        return result;
    }

    public double exponent(int x, int y){
        return  Math.pow(x, y);
    }
}
