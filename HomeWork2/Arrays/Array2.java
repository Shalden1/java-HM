package HomeWork2.Arrays;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) { // - отдельный метод на ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt(); // устанавливаем размер массива
        int arr[] = new int[size]; // массив с размером, который вводим
        System.out.println("Введите элементы массива: ");
        int i = 0;
        do{
            arr[i] = in.nextInt();
            i++;
        }
        while (i<size);
        OutputReverse(arr);

    }
    public static void OutputReverse(int[] arr){ // - Отдельный метод на вывод

        System.out.print("Обратный массив через do...while: {");
        int i = arr.length-1;
        do {
            System.out.print(" " + arr[i]);
            i--;
        }
        while (i>=0);
        System.out.println(" }");

        System.out.print("Обратный массив через while: {");
        i = arr.length - 1;
        while (i>=0){
            System.out.print(" " + arr[i]);
            i--;
        }
        System.out.println(" }");

        System.out.print("Обратный массив через for: {");
        for (i = arr.length - 1; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }
        System.out.println(" }");

//        System.out.print("Массив через foreach: {");

//        ------------------It's fundamentally impossible because the foreach loop is based on the Iterable and Iterator interfaces, and those don't have a notion of reverse iteration.
//        Иначе говоря, через for each не получается вывести массив в обратном порядке. Скорее всего, внесение в него отдельного for может исправить ситуацию, но а смысл?
//        for (int i1 : arr) {
//                System.out.print(" " + i1);
//        }
//            System.out.println(" }");

    }
}
