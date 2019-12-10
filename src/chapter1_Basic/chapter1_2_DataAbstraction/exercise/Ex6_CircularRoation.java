package chapter1_Basic.chapter1_2_DataAbstraction.exercise;

public class Ex6_CircularRoation {
    private static boolean isCircularRoation(String t, String s) {
        return (s.length() == t.length()) && (s.concat(s).contains(t));
    }

    public static void main(String[] args) {

        System.out.println(isCircularRoation("actgact", "tgactac"));
    }

}
