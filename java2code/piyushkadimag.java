public class piyushkadimag {
    public static boolean sortornot(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortornot(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};
        System.out.println(sortornot(arr, 0));
       }
    
}
