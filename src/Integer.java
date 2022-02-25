
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumbers(number);

    }

    public static void printNumbers(int x) {

        if (x>1 && x<100){
            System.out.println("congratulations");
        }

    }







    }



