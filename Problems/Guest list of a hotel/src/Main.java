//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();

        String str = str1 + " " + str2 + " " + str3 + " " + str4;
        str = str.replace("  ", " ");
        String[] split = str.split("\\s");
        for (int i = split.length; i > 0; i--) {
            System.out.println(split[i - 1]);
        }


    }
}