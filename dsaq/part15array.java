package dsaq;

public class part15array {
    public static void main(String[] args) {
        String[] names = {"aniruddha", "ani"};
        String[] branch = new String[3];
        branch[0] = "Entc";
        branch[1] = "CS";
        branch[2] = "Chemical";

        for (String s : branch) {
            System.out.println(s);
        }
        System.out.println(names[1]+names[0]);
    }
}
