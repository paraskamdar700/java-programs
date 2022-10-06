import java.util.*;

/*maximum sub array sum*/
public class brutsubarray {
    public static void maxsumsubarray(int value[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<=value.length;i++){
            int start=i;
            for(int j=i;j<value.length;j++){
                int end =j;
                currsum=0;

                for(int k=start;k<=end;k++){
                    currsum+=value[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
               }
           
            }
         
        }
        System.out.println("maximum sum is = "+ maxsum);    
    }
    public static void main(String[] args){
        int value[]={2,4,6,8,10};
        maxsumsubarray(value);
    }
    
}
