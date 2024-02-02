import java.util.Scanner;

public class Sixty {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println(isSixtyFive(num1, num2));
            System.out.println("===============================================");


        }

        public static boolean isSixtyFive(int num1, int num2) {
            return num1 == 65 || num2 == 65 || num1 + num2 == 65;
        }



}
