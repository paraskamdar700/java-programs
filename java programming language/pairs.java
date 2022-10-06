public class pairs {
    public static void main (String args[]){
        int arr[] = { 1,2,3,4,5,6};
          int currsum=0;
          int largest =Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length; i ++ ){
            for (int j = i+1; j<arr.length ;j++){
                currsum=0; 
                for(int k=i;k<j;k++){
                    currsum+=arr[k];
                }
                System.out.print(currsum);
                if(largest<currsum){
                    largest=currsum;
            
                }
            }
        }
        System.out.println(largest+",akfdjk");
    }

}