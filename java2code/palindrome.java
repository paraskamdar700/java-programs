import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value to find the num is palindrome or not");
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("the value is palindrome : "+palindrome);
        }
        else{
            System.out.println("the value is palindrome not : "+palindrome);

        }

    }
    public static boolean isPalindrome(int num){
            int rem=0;
            int reve=0;
            int palindrome=num;
        while(palindrome!=0){
            rem=palindrome%10;
            reve=reve*10+rem;
            palindrome=palindrome/10;
        }
        if(reve==num){
            return true;
        }else{
            return false;
        }

    }
    
}
