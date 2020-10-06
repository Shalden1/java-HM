package HomeWork2.Arrays;
public class Array4 {
    public static void BubbleSort(int[] arr) {

        boolean change = true; // для проверки, были изменения в цикле или нет
        int x; // для замены двух элементов массива между собой нужна 3 переменная
        while(change){
            change = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    change = true;

                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
        }
    }
    public static void ShakerSort(int[] arr){

        boolean change = true; // для проверки, были изменения в цикле или нет
        int x; // для замены двух элементов массива между собой нужна 3 переменная
        while(change){
            change = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    change = true;

                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
            for (int i = arr.length -1; i > 0; i--){
                if (arr[i] < arr[i-1]){
                    change = true;

                    x = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = x;
                }
            }
        }



    }

}