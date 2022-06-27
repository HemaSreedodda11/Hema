package sample;


public class poly1 {
    static int add(int a, int b)
    {
        int c=a+b;
        return c;
    }
    static double add(double a, double b,double c)
    {
        double d=a+b+c;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(poly1.add(10,20));
        System.out.println(poly1.add(23.99,23.12,30.67));
    }
}

