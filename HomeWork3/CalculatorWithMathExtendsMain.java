package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double y = calc.plus(calc.plus(4.1, calc.multiplication(15, 7)), calc.pow(calc.division(28, 5), 2));
        System.out.println(y);



        // 4.1 + 15 * 7 + (28 / 5) ^ 2
    }

}
