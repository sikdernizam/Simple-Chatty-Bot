import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int n = a.length;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] == 0) {
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != 0) {
                if (a[i] <= a[i + 1]) {
                    count1++;
                }
                if (a[i] > a[i + 1]) {
                    count2++;
                }
            }
        }
        if (count1 > 1 && count2 > 1) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}
