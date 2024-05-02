import java.util.concurrent.Callable;

public class Constructor {
    int id;
    String name;

    Constructor(int i, String n){
        id = i;
        name = n;


    }
    void display(){
        System.out.println(id + " " +name);

    }

    public static void main(String[] args) {
        Constructor s1 = new Constructor(22, "sagar");
        Constructor s2 = new Constructor(55, "magar");

     s1.display();
     s2.display();

    }

}
