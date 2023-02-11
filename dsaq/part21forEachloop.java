package dsaq;
import java.util.ArrayList;
public class part21forEachloop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ani");
        names.add("Aniruddha");
        names.add("Shrikhande");
        names.add("Coder");

        for(String i:names){
            System.out.println(i);
        }
    }
}
