package HomeWork2.Arrays;
import java.util.Scanner;
public class Array1 {
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
        Output(arr);

    }
    public static void Output(int[] arr){ // - Отдельный метод на вывод

        System.out.print("Массив через do...while: {");
        int i = 0;
        do {
            System.out.print(" " + arr[i]);
            i++;
        }
        while (i<arr.length);
        System.out.println(" }");

        System.out.print("Массив через while: {");
        i = 0;
        while (i<arr.length){
            System.out.print(" " + arr[i]);
            i++;
        }
        System.out.println(" }");

        System.out.print("Массив через for: {");
        for (i = 0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println(" }");

        System.out.print("Массив через foreach: {");
        i=0;
        for (int i1 : arr) {

            System.out.print(" " + i1);
        }
        System.out.println(" }");


        System.out.print("Вывод каждого второго массива: {"); // аналогично будет работать и с while, do while
        for (i = 0; i<arr.length; i+=2){
            System.out.print(" " + arr[i]);
        }
        System.out.println(" }");

        // Далее, чтобы не захламлять один класс кучей циклов, для обратного вывода создам новый.
    }
}
