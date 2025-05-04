import java.util.Scanner;

public class SwCa {
    
    public static void main(String []Hi){
        Scanner sc=new Scanner(System.in);

        int t=4;
        while(t-->0){
            int ID=sc.nextInt();
            switch (ID) {
                case 903:
                    System.out.println("Noman");
                    break;
                case 100:
                    System.out.println("NoOne");
                    break;
                case 802:
                    System.out.println("Saad");
                    break;
                case 200:
                    System.out.println("NoBody");
                    break;
                default:
                    System.out.println("Invalid ID");
                    break;
            }
        }
        
        sc.close();
    }


}
