package sample;

public class except {
    public static void main(String[] args) {
        try {
            int divide = 300 / 0;
            System.out.println("hello");
        } catch (ArithmeticException e) {
            System.out.println("Error is occured");
        } finally {
            System.out.println("Finally getting");
        }
    }
}