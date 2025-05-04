import java.util.*;

public class stringInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //sc.nextLine();
        String Name=sc.next();//Take Input of a single Word
        String fullName=sc.nextLine(); //To take input of a Full Line

        // System.out.println(fullName);
        // System.out.println(Name);

        //String Concatenation
        String NewName=Name+" "+fullName;
        System.out.println(NewName);

        //String Length
        int len=NewName.length();
        System.out.println(len);

        //CharAt
        //Fetch Each Chareters from A String
        String Demo="Object Oriented Programming";
        for(int i=0;i<Demo.length();i++){
            System.out.println(Demo.charAt(i));
        }
    }
}
