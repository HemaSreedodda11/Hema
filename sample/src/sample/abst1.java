package sample;

abstract class language {
    abstract void eng();
       void display()
       {
           System.out.println("I have to learn something");
       }

    public void tel() {
        System.out.println("I know some languages");
    }
}
       class hin extends language {
           void eng() {
               System.out.println("Hello I am here");

           }

       }
       class tamil extends language {
           void eng() {
               System.out.println("I dont know tamil");
           }


           public static void main(String[] args) {
               hin a = new hin();
               a.eng();
               a.tel();
               a.display();

               tamil t=new tamil();
               t.eng();
               t.display();


           }
       }


/*public class abst1 extends language{
    void eng()
    {
        System.out.println("I am Abstract");
    }
 public class abst2 extends language {
     void eng(){
         System.out.println("Hello I am another Abstract");
     }
 }
    public static void main(String[] args) {
        language obj = new abst1();
        language obj1= new abst1();
        obj.eng();
        obj1.eng();
     /*   language obj1;
        obj1=new abst1();
        obj1.eng();
        obj1=new abst2();
        obj1.eng();*/
