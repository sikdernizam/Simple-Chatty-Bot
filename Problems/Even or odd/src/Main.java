import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(n % 2 == 0 ? "even" : "odd");
        }

    }
}