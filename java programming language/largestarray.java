public class largestarray {
    public static void main(String[] args){
          int num[]={3,657,3,2446};
          largest(num);
        

    }
    public static void largest(int num[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            large=num[i];
        }
        System.out.println(large);
    }
    
}
