package HomeWork2.Arrays;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {9,1,5,99,9,9};
        int[] arr4 = {};
        int[] randomArr = new int[10];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random()*100);
        }
        // Более сложная реализация ввода массива (включая ввод размера массива) в Array1,2. Здесь задам размер массива 5 по умолчанию
        System.out.println("Введите элементы массива: ");
        Scanner in = new Scanner(System.in);
        int[] yourArr = new int[5];
        for (int i = 0; i < yourArr.length; i++){
            yourArr[i] = in.nextInt();
        }


        System.out.println("Пузырьковая сортировка:");
        System.out.println(Arrays.toString(arr1));
        Array4.BubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Array4.BubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        Array4.BubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        Array4.BubbleSort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(arr1));
        Array4.ShakerSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Array4.ShakerSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        Array4.ShakerSort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        Array4.ShakerSort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println("Введенный Вами массив: ");
        System.out.println(Arrays.toString(yourArr));
        Array4.ShakerSort(yourArr); // применим шейкерную сортировку для введенного в консоль массива. Аналогично можно сделать и для рандомного.
        System.out.println(Arrays.toString(yourArr)); // вывод на экран
        System.out.println("Рандомный массив: ");
        System.out.println(Arrays.toString(randomArr));
        System.out.println();

    }
}