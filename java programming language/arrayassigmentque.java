    public class arrayassigmentque {
        public static void main(String[] args){
            int nums[]={1,2,3,4};
             boolean a =assigment(nums);
             if(a==true){
                System.out.println("we have a twice value in array"+true);
             }
             else{
                System.out.println("we have a distent value in array  "+false);
             }
        }
        public static boolean assigment(int nums[]){
            for(int i=0;i<nums.length-1;i++){
                for(int j=1+i;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;  
                    }
                }
            }
             return false;
        }
 }
      