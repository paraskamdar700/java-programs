import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        int choice;
        int sumeven=0, sumodd=0;
        do{
            System.out.println("enter the number to find the sum of even or odd");
            num=sc.nextInt();
            if(num%2==0){
                sumeven+=num;
            }
            else{
                sumodd+=num;
            }
            System.out.println("enter the choice 1 if you want to continue otherwise 0 to break");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("the sum of even"+sumeven);
        System.out.println("the sum of odd"+sumodd);
        
        
    }    
}
