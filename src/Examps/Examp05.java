package Examps;

public class Examp05 {
    public static void main(String[] args) {
        String a="Welcome to the interview sessions with Syntax";
        System.out.println(a.substring(39));
        String [] words=a.split(" ");
        System.out.println(words.length);
        for (String string : words) {
            System.out.println(string);
        }
    }
}
