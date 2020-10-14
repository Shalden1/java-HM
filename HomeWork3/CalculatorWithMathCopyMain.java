package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double x = calc.plus(calc.plus(4.1, calc.multiplication(15, 7)), calc.pow(calc.division(28, 5), 2));
        System.out.println(x);

        // 4.1 + 15 * 7 + (28 / 5) ^ 2
    }
}
