import java.util.*;
public class reversearray2 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
                rev(arr);
    }
    public static void rev(int arr[]){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    
}
