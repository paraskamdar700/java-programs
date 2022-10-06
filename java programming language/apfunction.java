public class apfunction {
    public static void main(String[] args){
       hollo(4,5);
    }
    public static void hollo(int n, int m){
      for(int i=1;i<n;i++){
         for(int j=1;j<m;j++){
            if(i==1||j==n||j==1||i==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
         }
          System.out.println();
        }
    }
    
}
