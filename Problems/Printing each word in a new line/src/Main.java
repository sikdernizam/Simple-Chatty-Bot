import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String words;
        while (scanner.hasNextLine()) {
            words = scanner.nextLine();
            System.out.println(words.replace(" ", "\n"));
        }


    }
}
