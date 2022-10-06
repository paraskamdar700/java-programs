public class linearsearch {
    public static void main(String[] args){
        int num[]={5,478,3,273,2};
        int key=273;
           int a=linear(num, key);
           if(a==-1){
            System.out.print("key not  found");
           }else{
            System.out.print("key  found");
           }

    }
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
            

    }   
}
