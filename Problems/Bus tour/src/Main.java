import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight;
        int numBridges;
        busHeight = scanner.nextInt();
        numBridges = scanner.nextInt();
        int[] bridgeHeights = new int[numBridges];
        boolean isCrashed = false;
        for (int i = 0; i < numBridges; i++) {
            bridgeHeights[i] = scanner.nextInt();
            if (bridgeHeights[i] <= busHeight) {
                i++;
                isCrashed = true;
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        if (!isCrashed) {
            System.out.println("Will not crash");
        }
    }

}
