import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Give the Details : ");

        System.out.print("Enter Your Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age=sc.nextInt();

        System.out.print("Enter Your Cg: ");
        double cg=sc.nextDouble();

        System.out.println(name+" "+age+" "+cg);
        // System.out.println(age);
        // System.out.println(cg);

        sc.close();
    }
}
