import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((n * m - n == k) || (n * m - m == k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}