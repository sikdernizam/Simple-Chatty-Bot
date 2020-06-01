// Posted from EduTools plugin

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();

        System.out.println(start.replace(" ", "").equals(end.replace(" ", "")));

    }
}