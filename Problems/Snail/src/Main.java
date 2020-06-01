import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h, d, n;
        h = 0;
        d = 0;
        n = 0;

        h = scanner.nextInt();
        d = scanner.nextInt();
        n = scanner.nextInt();
        if (h > d && h > n) {
            if ((h - n) % (d - n) == 0) {
                d = (h - n) / (d - n);
                System.out.println(d);
            } else if ((h - n) % (d - n) != 0) {
                d = (h - n) / (d - n);
                System.out.println(d + 1);
            }
        }
    }
}