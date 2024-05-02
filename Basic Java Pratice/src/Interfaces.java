
//    It is used to achieve abstraction.
//    By interface, we can support the functionality of multiple inheritance.
//    It can be used to achieve loose coupling.
interface Bank{
    float rateOfInterest();
}
    class SBI implements Bank{
        public float rateOfInterest(){return 9.15f;}
    }
    class PNB implements Bank{
        public float rateOfInterest(){return 9.7f;}
    }
    class Interfaces{
        public static void main(String[] args){
            Bank b=new SBI();
            System.out.println("ROI: "+b.rateOfInterest());
            b = new PNB();
            System.out.println("ROI:  "+b.rateOfInterest());

        }}
