package HomeWork3;

public class CalculatorWithCounter {
    private long countoperation = 0;
    private  final CalculatorWithOperator calc1;
    private  final CalculatorWithMathCopy calc2;
    private  final CalculatorWithMathExtends calc3;


    public CalculatorWithCounter (CalculatorWithOperator calc){
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }
    public CalculatorWithCounter (CalculatorWithMathCopy calc){
        this.calc2 = calc;
        this.calc1 = null;
        this.calc3 = null;
    }
    public CalculatorWithCounter (CalculatorWithMathExtends calc){
        this.calc3 = calc;
        this.calc1 = null;
        this.calc2 = null;
    }

    public double plus (double a, double b){
        countoperation++;
        if (calc1 != null){
            return calc1.plus(a, b);
        }
        if (calc2 != null){
            return calc2.plus(a, b);
        }
        if (calc3 != null){
            return calc3.plus(a, b);
        }
        else{
            return countoperation;
        }
    }

    public double minus (double a, double b){
        countoperation ++;
        if (calc1 != null){
            return calc1.minus(a, b);
        }
        if (calc2 != null){
            return calc2.minus(a, b);
        }
        if (calc3 != null){
            return calc3.minus(a, b);
        }
        else{
            return countoperation;
        }
    }

    public double multiplication (double a, double b){
        countoperation ++;
        if (calc1 != null){
            return calc1.multiplication(a, b);
        }
        if (calc2 != null){
            return calc2.multiplication(a, b);
        }
        if (calc3 != null){
            return calc3.multiplication(a, b);
        }
        else{
            return countoperation;
        }

    }

    public double division (double a, double b){
        countoperation ++;
        if (calc1 != null){
            return calc1.division(a, b);
        }
        if (calc2 != null){
            return calc2.division(a, b);
        }
        if (calc3 != null){
            return calc3.division(a, b);
        }
        else{
            return countoperation;
        }

    }

    public double module (double a){
        countoperation ++;
        if (calc1 != null){
            return calc1.module(a);
        }
        if (calc2 != null){
            return calc2.module(a);
        }
        if (calc3 != null){
            return calc3.module(a);
        }
        else{
            return countoperation;
        }

    }

    public double pow (double a, int b){
        countoperation ++;
        if (calc1 != null){
            return calc1.pow(a, b);
        }
        if (calc2 != null){
            return calc2.pow(a, b);
        }
        if (calc3 != null){
            return calc3.pow(a, b);
        }
        else{
            return countoperation;
        }

    }

    public double sqrt (double a){
        countoperation ++;
        if (calc1 != null){
            return calc1.sqrt(a);
        }
        if (calc2 != null){
            return calc2.sqrt(a);
        }
        if (calc3 != null){
            return calc3.sqrt(a);
        }
        else{
            return countoperation;
        }

    }

    public long getCountoperation(){
        return countoperation;

    }


}
