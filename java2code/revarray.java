import java.util.*;

public class revarray {
     public static void reverse(int num[]){
           int start=0; 
           int end=num.length-1;
           while(start<end)
           
           {
             int temp = num[end];
             num[end]=num[start];
             num[start]=temp;
             start++;
             end--;
           }
    }
    public static void main(String[] args){
         int number[]={1,2,3,4,5,6};
         reverse(number);
         for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]);
          }
    }
}
