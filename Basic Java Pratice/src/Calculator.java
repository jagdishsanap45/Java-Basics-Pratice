import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("SELECT THE OPERATION:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication \n");
        int operation = sc.nextInt();

        if (operation != 1 && operation!= 2 && operation != 3)
        {
            System.out.println(" Invalid input");
        }
        else {
            System.out.println("Enter First Number");
            int a = sc.nextInt();

            System.out.println("Enter Second Number");
            int b = sc.nextInt();

            if (operation == 1){
                System.out.println(a + b);


            } else if (operation == 2 ) {
                System.out.println(a - b);

            }
            else if (operation == 3 ){

                System.out.println(a * b);
            }
        }
    }
}
