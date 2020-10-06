package HomeWork2.Loops;

public class Loops5 {
    public static void main(String[] args) {
        System.out.println("                 ТАБЛИЦА");
        System.out.println("                УМНОЖЕНИЯ");
        for (int i = 1; i<=10; i++){
            for (int j = 2; j<=5; j++){
                int n = j * i;
                System.out.print(j + "*" + i + "=" + n + "\t\t");
            }
            System.out.println("");
        }
        System.out.println("___________________________________________");
        for (int i = 1; i<=10; i++) {
            for (int j = 6; j < 10; j++) {
                int n = j * i;
                System.out.print(j + "*" + i + "=" + n + "\t\t");
            }
            System.out.println("");
        }
        System.out.println("___________________________________________");
        System.out.println("ЭТО");
        System.out.println("НУЖНО                      динозаврик");
        System.out.println("ЗНАТЬ");
    }
}