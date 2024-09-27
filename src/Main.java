import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int month = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your birth month? [1-12]");
        month = in.nextInt();

        if (month>=1 && month<=12){
            System.out.println("You birth month is "+month);
        }
        else {
            System.out.println("You entered an invalid input: "+month);
        }
    }
}