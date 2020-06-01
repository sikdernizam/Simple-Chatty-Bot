import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long fact = 1;
        long i = 1;

        //        for (i = 1; i <= n; ++i) {
        //            fact = fact * i;
        //        }
        //        System.out.print(i + " ");

                while (fact <= n) {
                    i++;
                    fact *= i;
                }
        System.out.println(i);

        //        do {
        //            i++;
        //            fact *= i;
        //        } while (fact <= n);
        //        System.out.println(i);


    }
}
