public class pairsarray{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        pair(arr);
    }
    public static void pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
        }
        System.out.print("total pairs "+tp);
        System.out.println();
    }
    
}
