package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithMathCopy());
        double x = calc.plus(calc.plus(4.1, calc.multiplication(15, 7)), calc.pow(calc.division(28, 5), 2));
        System.out.println(x);
        System.out.println("Count operations: " + calc.getCountoperation());
    }
}
