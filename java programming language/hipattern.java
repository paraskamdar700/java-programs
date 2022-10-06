public class hipattern {
      public static void hipat(int n,int m) {
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print("* ");
                }
                System.out.println();
              }
    }
    public static void main(String[] args) {
        int n=4,m=3;
        hipat(n,m);
    }
    
}
