public class Inheritance {
    //Single Inheritance Example
    public void  eat(){
        System.out.println("eating");
    }

    public void bark() {
    }
}
class dog extends Inheritance{
   public void bark(){
        System.out.println("barkk");
    }
}
class last {
    public static void main(String[] args) {
        Inheritance d = new Inheritance();
        d.bark();
        d.eat();
        
    }
}
//Multilevel Inheritance Example
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}