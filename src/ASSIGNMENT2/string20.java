package ASSIGNMENT2;

public class string20 {
    public static void main(String args[])
    {
        String s1="java string split method by javatpoint";
        System.out.println(s1.startsWith("jas"));  // true
        System.out.println(s1.startsWith("java string"));   // true
        System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different
    }
}
