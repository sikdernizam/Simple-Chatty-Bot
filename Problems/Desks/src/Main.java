import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a;
        int b;
        int c;
        int sum = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a >= 0 && a <= 1000 && b >= 0 && b <= 1000 && c >= 0 && c <= 1000) {
            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                sum = (a / 2 + b / 2 + c / 2);
                System.out.println(sum);
            } else if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
                double x = Math.ceil((double) a / 2);
                double y = Math.ceil((double) b / 2);
                double z = Math.ceil((double) c / 2);
                sum = (int) x + (int) y + (int) z;
                System.out.println(sum);
            }
        }
    }
}