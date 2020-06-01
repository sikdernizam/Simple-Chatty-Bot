import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = Integer.parseInt(scanner.next());
        if (n > 0 || n < 1000000) {
            System.out.println((n / 10) % 10);
        }

    }
}