public class This_Keyword {
//    Here is given the 6 usage of java this keyword.
//
//1.this can be used to refer current class instance variable.
//2.this can be used to invoke current class method (implicitly)
//3.this() can be used to invoke current class constructor.
//4.this can be passed as an argument in the method call.
//5.this can be passed as argument in the constructor call.
//6.this can be used to return the current class instance from the method.
    int rollno;
    String name;
    float fee;

    This_Keyword(int rollno, String name, float fee){
        this.rollno = rollno;
        this.fee = fee;
        this.name = name;

    }
    void display(){
        System.out.println(rollno + name + fee);
    }

    public static void main(String[] args) {
        This_Keyword s1 = new This_Keyword(55,"sanap", 50000);
        This_Keyword s2 = new This_Keyword(66, "sashi", 62000);

        s1.display();
        s2.display();
    }
}
