package dsaq;
//overloaded methods ---> methods that share same name but have different parameters

public class part23overloadedMethods {
    public static void main(String[] args) {
        System.out.println(sum(1.9, 1.1, 2.0));
    }
    static int sum(int a, int b){
        System.out.println("This is first overloadedMethod");
        return a+b;
    }
    static int sum(int a, int b, int c){
        System.out.println("This is second overloadedMethod");
        return a+b+c;
    }static int sum(int a, int b, int c, int d){
        System.out.println("This is third overloaded method");
        return a+b+c+d;
    }static double sum(double a, double b){
        System.out.println("This is fourth overloaded method");
        return a+b;
    }static double sum(double a, double b, double c){
        System.out.println("This is fifth overloaded method");
        return a+b+c;
}
}
