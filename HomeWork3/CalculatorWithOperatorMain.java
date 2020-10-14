package HomeWork3;

import com.sun.jdi.PathSearchingVirtualMachine;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double x = calc.plus(calc.plus(4.1, calc.multiplication(15, 7)), calc.pow(calc.division(28,5), 2));
        System.out.println(x);
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

    }
}
