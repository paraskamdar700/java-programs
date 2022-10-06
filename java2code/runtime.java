// for(int k=0;k<arr.length;k++){
//     System.out.println(arr[k]);

// }
import java.util.Scanner;

public class runtime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
            }
            for (int j = 0 ; j <= arr.length-1; j++){
            a = arr[j];
        }
        System.out.println(a);

    }    
    
}
