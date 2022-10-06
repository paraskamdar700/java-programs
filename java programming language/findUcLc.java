import java.util.Scanner;
public class findUcLc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value to check the alpha is upper or lower case");
        char alpha = sc.next().charAt(0);
        if(Character.isUpperCase(alpha)){
           System.out.println("character is in a UpperCase : "+alpha);
        }
        else{
            System.out.println("character is in a LowerCase : "+alpha);
        }

    }    
}
