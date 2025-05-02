
import java .util.Scanner;

public class Functions {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] Hi){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printName(name);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Sum(a, b));
        sc.close();
    }
}
