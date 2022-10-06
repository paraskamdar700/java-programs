public class BandSstock {


    public static int value(int[] price){
     int buyprice=price[0];
     int maxprofit=0;
     int maxval=Integer.MIN_VALUE;
     //loop
     for(int i=1;i<price.length;i++){
         //checking for lowest value
         if(buyprice>price[i]){
            buyprice=price[i];
         }
         //checking for max profit after buying it
         else if(price.length>maxprofit){
                 maxval=price[i];
                 maxprofit=maxval-buyprice;
         }
         


     }
    return maxprofit;
     
    }
    public static void main(String[] args){
        int price[]={7,2,3,4,6};
       System.out.println(value(price));
        
    }
    
}
