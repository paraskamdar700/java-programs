import java.util.Scanner;

public class sortinsertion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        
        insertion(arr);
        print(arr);
        
    }
    public static void print(int arr[]){
       for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
       }
       System.out.println();
    }
    public static void insertion(int arr[]){  //suppose {5,4,2,1,3} 
        
        for(int i=1;i<=arr.length-1;i++){
            int temp=arr[i];
           int j=i;
            while((j>0)&&(arr[j-1]>temp)){
                  arr[j]=arr[j-1];// 4=5
                  j=j-1;//5=4
            }
            arr[j]=temp;
        }
           
    }
               
}
          
            
         
    
