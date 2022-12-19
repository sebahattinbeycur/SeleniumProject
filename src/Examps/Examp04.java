package Examps;

public class Examp04 {
    public static void main(String[] args) {
        String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
        String replaced=given.replaceAll("[^A-Za-z]","");
        System.out.println(replaced);
        System.out.println(replaced.length());
    }
}
