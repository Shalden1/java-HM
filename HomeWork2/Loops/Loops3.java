package HomeWork2.Loops;
import java.util.Scanner;
public class Loops3 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число: ");
         double a = in.nextDouble();
         System.out.println("Введите степень: ");
         int n = in.nextInt();
         double b = 1;

         if (n>=1){
            for (int c = 1; c <= n; c++){
                b = b*a;
            }
            System.out.println(b);
         }
         else{
             System.out.println("Степерь должна быть положительной и целой. Попробуйте еще раз");
         }

    }
}
