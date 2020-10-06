package HomeWork2.Loops;

public class Loops4 {
    public static void main(String[] args) {

        long b = 1;
        int c = 3;
        for(long a = 1; a >= 0; a*=c){
            b = a;
        }
        System.out.println("Значение до переполнения = " + b);
        long d = b / 1000;
        long e = b - (d*1000);
        System.out.println("Число после переполнения = " + d*c + "" + e*c);

//          Как обычно, пускай остается. То, с помощью чего я пытался решить задачу, но что в итоге мне не пригодилось.
//        System.out.println(b);
//        System.out.println(d*3);
//        System.out.println(e*3);

//        ------------Полез в гугол)
//        long d = (long) Math.floor(c);
//        double e = c%1;
//        e = e*10;
//        long f = (long) e;
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//
//
//        --------Это тоже оставлю)) На каком-то этапе не получалось вывести остаток, т.к. он округлялся. Я последних 3 числа посчитал в уме и просто добавил к целому числу))
//        long c = (b / 1000)*3;
//        System.out.println("Число после переполнения " + c + "801");
//        System.out.println();



    }
}
