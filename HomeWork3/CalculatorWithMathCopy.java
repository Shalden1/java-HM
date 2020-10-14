package HomeWork3;

public class CalculatorWithMathCopy {

    public double plus (double a, double b){
        return a + b;
    }

    public double minus (double a, double b){
        return a - b;
    }

    public double multiplication (double a, double b){
        return a * b;
    }

    public double division (double a, double b){
        return a / b;
    }

    public double module (double a){
        return Math.abs(a);
    }

    public double pow (double a, int b){
        if (a < 0){
            a = -a;
        }
        return Math.pow(a, b);
    }

    public double sqrt (double a){
        return Math.sqrt(a);
    }

}
