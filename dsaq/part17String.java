package dsaq;

public class part17String {
    public static void main(String[] args) {
        String name = "Binary";
        String name1 = "     Bard";
        int length = name.length();
        char re = name.charAt(3);
        int er = name.indexOf("a");
        boolean s =  name.equals("binary");
        boolean a = name.equalsIgnoreCase("binary");
        String ee = name.toUpperCase();
        String aa = name.toLowerCase();
        String ss = name.replace("i","e");
        boolean xx = name.isBlank();
        String name2 = name1.trim();
        int aaa = name1.compareTo(name1);
        String zaq = name.concat(name2);
        System.out.println(zaq);



        System.out.println(name);
        System.out.println(name1);
        System.out.println(length);
        System.out.println(re);
        System.out.println(er);
        System.out.println(s);
        System.out.println(a);
        System.out.println(aa);
        System.out.println(ee);
        System.out.println(ss);
        System.out.println(xx);
        System.out.println(name2);
        System.out.println(aaa);


    }
}
