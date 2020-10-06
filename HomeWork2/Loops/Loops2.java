package HomeWork2.Loops;

public class Loops2 {
    public static void main(String[] args) {
        generate(2233);

    }
    public static void generate(int a) {

        int b = 1;
        for(b = 1; a != 0; a/=10){
            b *= (a%10);
            if (b<=a){
                System.out.print(a%10 + "*");
            }
            else{
                System.out.print(a%10);
            }

        }
        System.out.println("= " + b);
        // Тут я пока что не додумался, как именно умножать числа в правильном порядке, а не наоборот. Уверен, что ответ где-то совсем на поверхности, но в голову он пока не лезет


    }
}
