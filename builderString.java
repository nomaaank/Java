
import java.util.*;

public class builderString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

         StringBuilder sb=new StringBuilder("LoveIsAFairyTail");//Declare and intialize
         System.out.println(sb);

        // // //To take input ->Take a string As input then insert it to SB.
        // // String s=sc.nextLine();
        // // StringBuilder sb1=new StringBuilder(s);
        // // System.out.println(sb1);

        // //Operations Of Sb.
        // //To Add A string to existing String
        // StringBuilder Str=new StringBuilder("Love");
        // Str.append(" Is A Fairy Tail");
        // System.out.println(Str);

        // //Insert At Any Position
        // Str.insert(7, " Nothing But");
        // System.out.println(Str);

        // //Delete A Portions
        // Str.delete(8, 15);
        // System.out.println(Str);

        // // //Reverse
        // // Str.reverse();
        // // System.out.println(Str);


        // //Set Charecter At Any Index
        // Str.setCharAt(0, 'N');
        // System.out.println(Str);

        // // //Convert To Normal String
        // // String stringg=Str.toString();
        // // System.out.println(stringg);

        sc.close();
    }
}
