package dsaq;

import java.util.ArrayList;

public class part19Arraylist {
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<String>();
        drinks.add("Thumbsup");
        drinks.add("cola");
        drinks.add("oldMonk");
        drinks.add("Pepsi");

        drinks.set(1,"Sting");
        //drinks.clear();
        drinks.remove(2);

        System.out.println(drinks.size());
        System.out.println(drinks);

    }
}
