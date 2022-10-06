public class sortbubble {
    public static void main(String[] args){
        int num[]={5,4,3,2,1};
                bubble(num);   
                printnum(num);

    }
    public static void bubble(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }

            }
        }
    }
    public static void printnum(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println();    
    }
    
}
