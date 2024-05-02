abstract class demo{
    abstract  void  display();
}
public class Abstraction extends demo{
//    Abstraction is a feature of OOPs. The feature allows us to hide the implementation detail
//    from the user and shows only the functionality of the programming to the user. Because the user
//    is not interested to know the implementation. It is also safe from the security point of view.

    @Override
    void display() {
        System.out.println("Abstract method call");
    }

    public static void main(String[] args) {
        Abstraction s = new Abstraction();
        s.display();
    }
}
