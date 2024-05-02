public class Encapsulation {
//    private String Color;
//
//
//    public String getColor() {
//        return Color;
//    }
//
//    public String setColor(String c) {
//        this.Color = c;
//
//    }
//
//
//
//    public static void main(String[] args) {
//        Encapsulation v1 = new Encapsulation();
//        System.out.println(v1.getColor());
//
//    }
    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }

    public static void main(String[] args) {
        Encapsulation acc = new Encapsulation();
        acc.setAcc_no(346856254);
        acc.setName("Jagdish");
        acc.setEmail("jagdish@dmail");
        acc.setAmount(3532);
        System.out.print(acc.acc_no + " " + acc.name +" " + acc.email + " " + acc.amount );
    }


}
