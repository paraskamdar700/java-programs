
public class bin {
    public static void main(String[] args){
          int num[]={1,2,3,4,5,6};
          int target=2;
         int a= binary(num,target);
         if(a==-1){
            System.out.print("elem not f");
         }
         else{
            System.out.println("found"+ a);
         }
    }
    public static int binary(int num[],int target){
       int start=0,end=num.length;
       int mid=(start+end)/2;
       while(start<=end){
           if(num[mid]==target){
               return mid;
            }
            else if(num[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
         }
         return -1;
    }
    
}
