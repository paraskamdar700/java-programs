import java.util.*;
public class minvalarray {
    public static void main(String[] args){
        int number[]={5,8,9,4};
        int total = number.length;
       System.out.println("minimum value is  "+minval(number,total));

    }

    public static int minval(int number[],int total){
         
         int temp=0;
         for(int i=0;i<total;i++){
            for(int j=1+i;j<total;j++){
               if(number[i]>number[j]){
                      temp = number[i];
                      number[i]=number[j];
                      number[j]=temp;
                }

                
            }
           
        }
      return number[0];    
    }


    
    

}