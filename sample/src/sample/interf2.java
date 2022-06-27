package sample;


interface Animal{
    void eat();
}
class cat implements Animal{
  public  void eat()
    {
        System.out.println("Cat is cute animal");
    }
}
class dog implements Animal{
  public  void eat()
    {
        System.out.println("I have a Dog, Rocky");
    }
}
public class interf2 {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        cat c=new cat();
        c.eat();
    }
}