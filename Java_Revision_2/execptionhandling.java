
import java.util.Scanner;
import java.io.*;

class Demo {
    public static void main(String[] args)throws IOException  {

        Scanner sc = new Scanner(System.in);
        try {
            String num = sc.next();
           int age = Integer.parseInt(num);
            System.out.println(num);
            chechAge(age);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
       finally{}
    }

    static void  chechAge(int age){
        if(age<18){
            throw new ArithmeticException("invalid age ");
        }
    }
}