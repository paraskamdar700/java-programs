public class binarysearch1 {
    public static void main(String[] args){
        int num[]={2,4,5,8,10,12};
        int target=2;
       System.out.print(binarytarget(num,target));
    }

    public static int  binarytarget(int num[],int target){
        int start=0,end =num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]<target){
                  start=mid+1;
            }
            else{
                    end=mid-1;
            }
        }
        return -1;
    }
    
}

    

