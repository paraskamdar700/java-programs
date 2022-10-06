
public class recursion {
    
    
    public static int factorial(int num){
        if(num==0){
            return 1;
            
        }
        factorial(num-1);
        int fn=num*factorial(num-1);
        return fn;

    }


    public static int sum(int n){
        if(n==1){
            return 1;
        }
        sum(n-1);
        int fn=n+sum(n-1);
        return fn;

    }

    public static int fibb(int n){
        if(n==1||n==0){
            return n;
        }
        int fibb = fibb(n-1)+fibb(n-2);
        return fibb;
    }

   


    public static void main(String[] args){
            int num=5;
          System.out.println("factorial is :  " +factorial(num));
          int n=5;  
          System.out.println("sum of n natural is  : "+sum(n));
          int fibn=5;
          System.out.println("fibb is  :  " +fibb(fibn));
       

    }    
}
