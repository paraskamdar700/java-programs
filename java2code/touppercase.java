public class touppercase {
    public static void main(String[] args){
        String str="hello world";
        String upper=str.toUpperCase();
            System.out.println(upper);
    }
    public static void loda(String val){
        String str = "the lazy fox jumped over the brown fence"; 
       StringTokenizer tokenizer = new StringTokenizer(str); 
       while (tokenizer.hasMoreTokens()) {
       System.out.println(tokenizer.nextToken()); 
    } 

    }
    
}
