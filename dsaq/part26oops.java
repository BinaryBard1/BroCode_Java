package dsaq;

public class part26oops {
    public static void main(String[] args) {
        cars mycar1 = new cars();
        cars mycar2 = new cars();

        part23overloadedMethods.sum(1,2);

        System.out.println(mycar1.brand);
        System.out.println(mycar1.model);
        System.out.println(mycar1.color);
        System.out.println(mycar1.price);

        mycar1.run();
        mycar1.stop();
    }

}

