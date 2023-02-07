package ASSIGNMENT2;

public class string19 {
    public static void main(String args[]){
        String s1="java string split love by javatpoint";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}
