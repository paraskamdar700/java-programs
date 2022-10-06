public class primeprog1 {
    public static void prime(int n){
        int times;
        for(int i=2;i<=n;i++){
             times = 0;
            for( int j=1;j<=i;j++){
                if(i%j==0){
                    times++;
                }
                
            }
            if(times==2){
                System.out.println(i);
            }
             
        }

    }
    public static void main(String[] args) {
        int n= 100;
        prime(n);
        
    }
    
}
