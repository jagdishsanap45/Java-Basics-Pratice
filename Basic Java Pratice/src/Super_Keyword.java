public class Super_Keyword {


//    //    super can be used to refer immediate parent class instance variable.
////    super can be used to invoke immediate parent class method.
////    super() can be used to invoke immediate parent class constructor.class
//
//    String color="white";
//}
//class Dog extends Super_Keyword{
//    String color="black";
//    void printColor(){
//        System.out.println(color);//prints color of Dog class
//        System.out.println(super.color);//prints color of Animal class
//    }
//}
//class TestSuper1{
//    public static void main(String args[]){
//        Dog d=new Dog();
//        d.printColor();
//    }

    int id;
    String name;
    Super_Keyword(int id,String name){
        this.id=id;
        this.name=name;
    }
}
    class Emp extends Super_Keyword{
        float salary;
        Emp(int id,String name,float salary){
            super(id,name);//reusing parent constructor
            this.salary=salary;
        }
        void display(){System.out.println(id+" "+name+" "+salary);}
    }
    class TestSuper5{
        public static void main(String[] args){
            Emp e1=new Emp(1,"ankit",45000f);
            e1.display();
        }}



