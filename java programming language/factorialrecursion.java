public class factorialrecursion {
    public static int fact(int n){
        if(n==0){
           
            return 1;
        }
        fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[] args){
             int n=4;
             System.out.println(fact(n));
    }
}
