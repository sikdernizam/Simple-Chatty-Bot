import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}