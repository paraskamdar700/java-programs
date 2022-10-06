public class sumofdigit {
    public static void main(String[] args){
         System.out.println(sumdigit(10029));
    }
    public static int sumdigit(int n){
       int sdigit=0;
        while(n>0){
           int last=n%10;
           sdigit=sdigit+last;
           n=n/10;
        }
        return sdigit;

    }
    
}
