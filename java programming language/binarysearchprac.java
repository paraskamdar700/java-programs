public class binarysearchprac {
    public static void main(String[] args){
        int num[]={2,4,6,8,10,12,14};
        int target=5;
       int i= binarytarget( num, target);
         int a= num[i];
         System.out.print(a);         
    }
    public static int binarytarget(int num[],int target){
        int start=0,end =num.length-1;
        while(start<=end){
            int mid=num.length/2;
            
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]>target){
                  start=mid-1;
            }
            else{
                    end=mid+1;
            }
        }
        return -1;
    }
    
}
