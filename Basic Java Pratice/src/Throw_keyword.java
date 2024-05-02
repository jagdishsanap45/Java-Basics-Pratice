public class Throw_keyword {
    public static void validateage(int age){
        if (age < 18){
            throw new ArithmeticException("Not Eligible");


            }
        else
        {
            System.out.println("Eligible");
        }

    }

    public static void main(String[] args) {
        validateage(15);
        System.out.println("Rest Code..........");
    }
}
