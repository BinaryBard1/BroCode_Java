package dsaq;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class part6GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showMessageDialog(null, "Fuck You! " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"17 ka hai ye bkl ");

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Your name");
//        String name1 = in.nextLine();
//        System.out.println(name1);


    }
}
