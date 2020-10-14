package HomeWork3;

public class CalculatorWithOperator {

    public double plus (double a, double b){ // Сложение (кто бы мог подумать)
        return a + b;
    }

    public double minus (double a, double b){ // Вычитание
        return a - b;
    }

    public double multiplication (double a, double b){ // Умножение
        return a * b;
    }

    public double division (double a, double b){ // Деление
        return a / b;
    }

    public double module (double a){ // Модуль
        if (a < 0){
            a = -a;
        }
        return a;
    }

    public double pow(double a, int b) { // Возведение дробного положительного числа в целую положительную степень
        if (a < 0) {
            a = -a;
        }
        if (b < 0){
            division(1, a);
        }
        for (int i = 1; i < module(b); i++) {
            a *= a;
        }
        return a;
    }

    public double sqrt(double a){ // Квадратный корень числа
        return Math.sqrt(a);
        // В задании не уточнено, нужен ли нам только квадратный корень или нет. В целом, корень можно описать, как обратное возведение в степень: Math.pow (a, 1/b)
    }


}
