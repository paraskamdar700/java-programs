import java.util.*;
public class binarysearch {

    public static int search(int number[],int key){
        int start=0; int last=number.length-1;
         while(start<=last){
            int mid=start+last/2;
            if(number[mid]==key){
                return mid;
            }
            if(mid<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
         }
         return -1;

    }public static void main(String[] args){
        int number[]={2,4,6,8,10,12};
        int key=6;
        
        int i = search(number,key);
        int a=number[i];
        System.out.println(a);

        
    }
    
}
