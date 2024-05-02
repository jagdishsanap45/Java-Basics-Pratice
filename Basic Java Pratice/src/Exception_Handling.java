import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_Handling {
    public static void main(String[] args) {
        //Let's see an example to handle checked exception.
//        PrintWriter pw;
//        try {
//            pw = new PrintWriter("jtp.txt"); //may throw exception
//            pw.println("saved");
//        }
//// providing the checked exception handler
//        catch (FileNotFoundException e) {
//
//            System.out.println(e);
//        }
//        System.out.println("File Saved Sucessfully");
        // In this example, try block contains two exceptions.
        //But at a time only one exception occurs and its corresponding
        // catch block is executed ---> Multiple Catch block
//        try {
//            int a[] = new int[5];
//            a[5] = 30/5;
//            System.out.println(a[10]);
//        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Index out of bound");
//
//        }
//        catch (Exception e){
//            System.out.println("Parent Exception Occur");
//        }
//        System.out.println("Rest of code");
//    }

//        Let's see the following example where the Java code throws an exception and
//    the catch block handles the exception. Later the
//    finally block is executed after the try-catch block.
//                Further, the rest of the code is also executed normally
                try {

                    System.out.println("Inside try block");

                    //below code throws divide by zero exception
                    int data=25/0;
                    System.out.println(data);
                }

                //handles the Arithmetic Exception / Divide by zero exception
                catch(ArithmeticException e){
                    System.out.println("Exception handled");
                    System.out.println(e);
                }

                //executes regardless of exception occured or not
                finally {
                    System.out.println("finally block is always executed");
                }

                System.out.println("rest of the code...");
            }

}
