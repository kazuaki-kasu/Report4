import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String str = null;
//        System.out.println(str.length());
        try{
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointExeptionエラー");
            System.out.println(e.getMessage());
        }

    }
}
