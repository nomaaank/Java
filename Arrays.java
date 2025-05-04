
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Direct Declare and Initialization
        //int array[]={1,2,3,4,-6};
        // for(int i=0;i<5;i++){
            //     System.out.println(array[i]);
            // }
        
            
        int ar[]=new int[5];//Declare with size 5

        for(int j=0;j<ar.length;j++){ //Taking Input //Size-> array.length();
            ar[j]=sc.nextInt();
        }

        for (int i = 0; i < 5; i++) { //Output
            System.out.println(ar[i]);
        }
        sc.close();

    }
}
