public class bintodecimal {
    public static void main(String[] args) {
         bintodec(100);
         dectobin(5);
     }
 
     public static void bintodec(int binnum) {
         int mynum= binnum;
         int decnum = 0;
         int pow = 0;
         while (binnum!=0) {
 
            int lastval = binnum % 10;
             decnum = decnum + (lastval * (int) Math.pow(2, pow));
             pow++;
             binnum = binnum / 10;
         }
         System.out.println("the decimal value is : " + decnum);
 
     }

     public static void dectobin(int n){
        int pow=0;
        int binval=0;
        while(n>0){
            int rem=n%2;
             binval = binval+(rem*((int)Math.pow(10,pow)));
            pow++;
            n=n/2;
        }

          System.out.println("binary value is " + binval);
     }
    
}
