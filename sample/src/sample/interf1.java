package sample;


interface pad{
    void eat();
}
 class interf1 implements pad {
    public void eat() {
        System.out.println("Hello Rajhemasri...");
    }

    public static void main(String[] args) {
       interf1 p1 = new interf1();
            p1.eat();
    }
    }
