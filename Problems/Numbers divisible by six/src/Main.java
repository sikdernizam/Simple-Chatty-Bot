import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            input[i] = scanner.nextInt();
            if (input[i] % 6 == 0) {
                sum += input[i];
            }
        }
        System.out.println(sum);
    }
}