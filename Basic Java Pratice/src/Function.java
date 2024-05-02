public class Function {
    public static void main(String[] args) {
        fun();
        System.out.println("Before Call");
        fun();
        System.out.println("After call");


    }
    static void fun(){
        System.out.println("Final");
    }
}
