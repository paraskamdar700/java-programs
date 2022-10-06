import java.util.Arrays;
import java.util.Collections;
public class sortinbult {
    public static void main(String[] args){
        Integer arr[]={5,7,3,27,7};
        Arrays.sort(arr, Collections.reverseOrder());
        print(arr);
    }
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
