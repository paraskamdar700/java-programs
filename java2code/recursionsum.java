public class recursionsum {
    public static int sum(int x, int n){
       if(n==0){
          return 1;
       }
       int x1=sum(x, n-1);
       int x2=x*x1;
       return x2;
        
    }
    
    
        public static void main(String[] args) {
             System.out.println(sum(2,5));
    }
}
