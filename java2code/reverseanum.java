public class reverseanum {
    public static void main(String[] args){
        int num=1909;
        int a;
        for(int i=0; i<=4;i++){
            a=num%10;
            num=num/10;
            System.out.println(a);
        } 
    }
    
}
