import java.io.*;

public class Throws_Keyword {
    public static void method() throws FileNotFoundException {

        FileReader File = new FileReader("C:\\user\\jagdish\\jag.txt");
        BufferedReader Fileinput = new BufferedReader(File);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Rest code...........");
    }

}
