public class palindromestring {
    public static void main(String[] args){
        String str="madam";
        System.out.print(palindrome(str)); 

    }
    public static boolean palindrome(String str){
       
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;


    }
    
}
