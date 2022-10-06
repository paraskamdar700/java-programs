public class sortselection {
    public static void main(String[] args){
       int num[]={10,33,56,90,10};
           selection(num);
         printarray(num);
    }
    public static void printarray(int num[]){
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
    }
    
    public static void selection(int num[]){
        for(int i=0;i<num.length-1;i++){
            int minpos=i;
           for(int j=i+1;j<num.length;j++){
              if(num[minpos]>num[j]){
                minpos=j;
              }
           }
           int temp=num[minpos];
           num[minpos]=num[i];
           num[i]=temp;
        }
        
    }
    
}
