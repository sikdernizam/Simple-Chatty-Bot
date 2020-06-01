import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            sum += n;
            if (n == 0) {
                System.out.println(sum);
                break;
            }
            if (n == 0 || sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}