package HomeWork2.Loops;

public class Loops5 {
    public static void main(String[] args) {
        System.out.println("                 ТАБЛИЦА");
        System.out.println("                УМНОЖЕНИЯ");
        int startNumber = 2;
        int maxcountColumnsInRow = 4;
        int countColumns = 7;

        int countRow  = (int) Math.ceil(countColumns / (double) maxcountColumnsInRow);
        for (int i = 0; i < countRow; i++) {
            int currentTo = startNumber + maxcountColumnsInRow +(maxcountColumnsInRow*i) - 1;

            int tmp = countColumns - (maxcountColumnsInRow*i);
            if (tmp < maxcountColumnsInRow){
                currentTo = startNumber + (maxcountColumnsInRow*i) + tmp -1;
            }
            prinRow(startNumber + (maxcountColumnsInRow*i), currentTo);
            System.out.println();

        }

    }


    public static void prinRow(int a, int b){
        for (int i = 1; i<=10; i++) {
            for (int j = a; j <= b; j++) {
                int n = j * i;
                System.out.print(j + "*" + i + "=" + n + "\t\t");
            }
            System.out.println("");
        }
    }
}