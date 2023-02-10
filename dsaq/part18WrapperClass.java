/*
A wrapper class in Java is a class that encapsulates a primitive data type and provides methods for accessing and manipulating the value of that primitive type.
There are eight wrapper classes in Java, corresponding to the eight primitive data types:
Boolean, Character, Byte, Short, Integer, Long, Float, and Double. Wrapper classes allow you to use primitive data types as objects, and provide methods for converting between primitive values and strings,
as well as for converting between different number formats.
 */
package dsaq;

public class part18WrapperClass {
    public static void main(String[] args) {
        Boolean a = true;
        Double d = 3.14;
        String s = "BRO";
        Integer i = 4;
        Character c = '@';

        //System.out.println(a.equals(true));
        System.out.println(d.intValue());
        System.out.println(c.charValue());


    }
}
