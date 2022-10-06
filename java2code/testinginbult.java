import java.util.Arrays;
public class testinginbult {
    public static void main(String[] args){
        int arr[]={1,4,5,3,5};
        Arrays.sort(arr);
        print(arr);
        

    }
    public static void print(int arr[]){
        for(int k=0;k<arr.length;k++){
         System.out.print(arr[k]+" ");
        }
        System.out.println();
     }
    
}
