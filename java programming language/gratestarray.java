public class gratestarray {
    public static int gratest(int number[]){
        int larval=Integer.MIN_VALUE;
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(larval<number[i]){
                larval=number[i];
            }
            if(minval>number[i]){
               minval=number[i];
               System.out.println("smallest value is"+minval);
            }
            
        }
        return larval;

    }
    public static void main(String[] args){
        int number[]={1,10,2,12};
        System.out.println("grater value is"+gratest(number));
    }
    
}
