import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Basketball team recruitment! ");
        Scanner a = new Scanner(System.in);
        System.out.println("What your height? ");
        int c = a.nextInt();
        System.out.println("What your weight? ");
        int d = a.nextInt();
        boolean e = c >= 190 & d <= 90;
        if (e) {
            System.out.println("Sure, you can come to the training at the address we drop you in the email. ");
        }else {
            System.out.println("Sorry, but you don't suit us. ");
        }


    }
}
