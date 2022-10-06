public class occurencearr {
    public static int firstoccurence(int arr[],int key,int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
               return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,4,9,5};
        int key=9;
        System.out.println(firstoccurence(arr,key,0));
    }
    
}
