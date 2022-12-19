package Examps;

public class Examp02 {
    public static void main(String[] args) {
        String x="Hello";
        String y="Welcome";
        x=x+y; //HelloWelcome
        y=x.substring(0,(x).length()-y.length()); //y=Hello
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
    }
}
