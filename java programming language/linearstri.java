import java.util.*;

public class linearstri {
    public static void main(String[] args){
            String sb=new String("");
             String[]str={"chat","phulki","xxx"};
             String[] target={"xxx"};
             search(str,target);

    }
    public static void search(String str[],String[] target){
        for(int i=0;i<str.length;i++){
            if(str==target){
                System.out.print(target);
            }
            else{
                System.out.print("gand marao");
            }

        }
    }
    
}
