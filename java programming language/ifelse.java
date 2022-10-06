import java.util.Scanner;

public class ifelse {
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
    System.out.println("enter the operator");
      int op=sc.next().charAt(0);
      System.out.println("Enter two digit:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum,multi,div,mod,sub;
      if(op == '+') {
        sum=a+b;
        System.out.println("Your total sum is ="+sum);
      }
      else if(op == '-'){
        sub=a-b;
        System.out.println("Your total subtraction is ="+sub);
      }
      else if(op == '/') {
        div=a/b;
        System.out.println("Your total division is +"+div);
      }
      else if(op == '*'){
        multi=a*b;
        System.out.println("Your total multibly is"+multi);
      }
      else if(op == '%'){
        mod=a%b;
        System.out.println("Your total modulos is = "+mod);
      }
      else{
        System.out.println("your input oprator are invalid");
      }
}
    
}
