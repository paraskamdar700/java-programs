public class primeprog {
  public static void main(String[] args){
    System.out.println(prime(7));

 }
    public static boolean prime(int n){
       
        for(int i=2;i<=n-1;i++){
          if(n%i==0){
            return false;
            }
          
        }
        return true;
    }
    
}
