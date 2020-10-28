package HomeWork3;

public class CalculatorWithCounterInterface implements ICalculator{
    private long countoperation = 0;
    private final ICalculator calc;
    public CalculatorWithCounterInterface(ICalculator calc){
        this.calc = calc;
    }


    public double plus (double a, double b){
        countoperation++;
        return calc.plus(a,b);
    }

    public double minus (double a, double b){
        countoperation ++;
        return calc.minus(a,b);
    }

    public double multiplication (double a, double b){
        countoperation ++;
        return calc.multiplication(a,b);
    }

    public double division (double a, double b){
        countoperation ++;
        return calc.division(a,b);
    }

    public double module (double a){
        countoperation ++;
        return Math.abs(a);
    }

    public double pow (double a, int b){
        countoperation ++;
        return Math.pow(a,b);
    }

    public double sqrt (double a){
        countoperation ++;
        return Math.sqrt(a);
    }

    public long getCountoperation(){
        return countoperation;
    }
    public ICalculator getCalc(){
        return calc;
    }
}
