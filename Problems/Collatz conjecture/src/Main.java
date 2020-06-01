import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);// scanner.nextInt();
        int n = scanner.nextInt();
        while (n != 1) {
            System.out.print(n + " ");
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        System.out.print(n + " ");
    }
}