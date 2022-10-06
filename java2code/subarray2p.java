public class subarray2p {
    public static void main(String[] args){
        int number[]={1,2,3,4,5};
        subarray(number);

    }
    public static void subarray(int number[]){
        int start=0;int end=0;
        for(int i=0;i<number.length;i++){
                 start=number[i];
            for(int j=i+1;j<number.length;j++){
                     end=number[j];
                     for(int k=start;k<end;k++){
                        System.out.print(number[k]);
                     }
               
            }
        }
        
        System.out.println();
    }
    }
    
}
