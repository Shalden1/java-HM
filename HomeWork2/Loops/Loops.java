package HomeWork2.Loops;

public class Loops {
    public static void main(String[] args) {
        generate(3);
        generate(5);
        generate(6);
        generate(10);

    }
    public static void generate(int a) {
        int b = 1;

        for (int c = 1; c <= a; c++) {
            b *= c;
            if (c != a) {
                System.out.print(c + "*");
            } else {
                System.out.print(c);
            }
        }
        System.out.println("=" + b);

         /*- Сразу думал, что число надо вводить через консоль. Оставлб это здесь.
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число: ");
         int a = in.nextInt();
         int b = 1;

         for (int c = 1; c <= a; c++){
         b *= c;
         if(c != a){
         System.out.print(c + "*");
         }
         else{
         System.out.print(c);
         }
         }
         System.out.print("=" + b);*/
    }
}
