package HomeWork4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer[] data = new Integer[]{1,2,3,null,null,null};
        DataContainer<Integer> task1 = new DataContainer<>(data);
        System.out.println(Arrays.toString(task1.getItems()));
        System.out.println(task1.add(777));
        System.out.println(task1.add(null));
        System.out.println(Arrays.toString(task1.getItems()));

        System.out.println("___________________________");

        DataContainer<Integer> task2 = new DataContainer<>(new Integer[]{1,null,3,null,null,null});
        System.out.println(Arrays.toString(task2.getItems()));
        System.out.println(task2.add(777));
        System.out.println(Arrays.toString(task2.getItems()));

        System.out.println("___________________________");

        DataContainer<Integer> task3 = new DataContainer<>(new Integer[]{1,2,3});
        System.out.println(Arrays.toString(task3.getItems()));
        System.out.println(task3.add(777));
        System.out.println(Arrays.toString(task3.getItems()));

        System.out.println("___________________________");

        DataContainer<Integer> task4 = new DataContainer<>(new Integer[]{});
        System.out.println(Arrays.toString(task4.getItems()));
        System.out.println(task4.add(9999));
        System.out.println(task4.get(0));

        System.out.println("___________________________");

        DataContainer<Integer> task5 = new DataContainer<>(new Integer[]{1,2,3,777});
        System.out.println(Arrays.toString(task5.getItems()));
        System.out.println(task5.delete(3));
        System.out.println(Arrays.toString(task5.getItems()));
        System.out.println(task5.delete(9));

        System.out.println("___________________________");

        DataContainer<Integer> task6 = new DataContainer<>(new Integer[]{1,2,3,777});
        System.out.println(Arrays.toString(task6.getItems()));
        System.out.println(task6.delete(2));
        System.out.println(Arrays.toString(task6.getItems()));

        System.out.println("___________________________");

        DataContainer<Integer> task7 = new DataContainer<>(new Integer[]{1,2,3,777});
        System.out.println(Arrays.toString(task7.getItems()));
        Integer item1 = 777;
        Integer item2 = 111;
        System.out.println(task7.delete(item1));
        System.out.println(Arrays.toString(task7.getItems()));
        System.out.println(task7.delete(item2));
        System.out.println(Arrays.toString(task7.getItems()));

        System.out.println("___________________________");

        DataContainer<Integer> task8 = new DataContainer<>(new Integer[]{1,2,3,777,3});
        System.out.println(Arrays.toString(task8.getItems()));
        Integer item3 = 3;
        System.out.println(task8.delete(item3));
        System.out.println(Arrays.toString(task8.getItems()));

    }
}
