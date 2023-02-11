package dsaq;

public class part22methods {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        System.out.println(sum(a,b));////(a,b)------> Arguments
        System.out.println(same(a,b));
        print(a,b);
    }
    static int sum(int a , int b){/// (int a , int b) ---> Parameters
        return a+b;
    }
    static boolean same(int a, int b){
        return a == b;
    }
    static void print(int a , int b){
        System.out.println(a+""+b);
    }
}
