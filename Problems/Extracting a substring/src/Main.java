import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(str.substring(start, end + 1));

    }
}