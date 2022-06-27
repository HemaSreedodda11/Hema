package sample;


import java.io.*;
public class filew1 {
    public static void main(String[] args) {
        try {

            FileOutputStream f1 = new FileOutputStream("D:\\java.txt");
            String s = "Welcome";
            byte b[] = s.getBytes();
            f1.write(b);
            f1.write(78);
            f1.close();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}