import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a;//recommended=7
        int b;//not more than=9
        int h; //actual=2

        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        if(h>=a && !(h>b)){
            System.out.println("Normal");
        }else if(h>=a && h>b){
            System.out.println("Excess");
        }
        else if(h<a && h<=b){
            System.out.println("Deficiency");
        }
    }
}