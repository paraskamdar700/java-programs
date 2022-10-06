import java.util.Scanner;

public class functionque {
    public static void main(String[] args){
      
//        even method
       Scanner sc=new Scanner(System.in);
       int num = sc.nextInt();
          if(isEven(num)){
            System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }



            System.out.println(average(10, 20, 30));
    }
   
     public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
        
        
    }


      // avaerage program 
      public static int average(int a,int b, int c){
        int average;
        average=(a+b+c)/3;
        return average;
    }


}

 