public class testingprefix {
    public static void main(String[] args ){
       int num[]={1,2,3,4,5};
       prefix(num);
    }

    public static void prefix(int num[]){
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        
        System.out.println(prefix[]);
    }
    
}
