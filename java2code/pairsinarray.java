import java.util.*;
public class pairsinarray {
    public static void main(String[] args){
        int number[]={2,3,4,5,6};
        pair(number);

    }
    public static void pair(int number[]){
        for(int i=0;i<number.length;i++){
            int current=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+current+","+number[j]+")");
            }
        }
        
        System.out.println();
    }
    
}
