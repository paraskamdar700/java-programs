public class subarrayprefix3 {  
 public static void prefixsum (int value[]){
        
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<=value.length;i++){
            int start=i;
            for(int j=i;j<value.length;j++){
                int end =j;
                currsum+=
                
               System.out.print(i+j);
           
            }
            System.out.println();
        }
           
    }
    public static void main(String[] args){
        int value[]={2,4,6,8,10};
        prefixsum(value);
    }

    
}

