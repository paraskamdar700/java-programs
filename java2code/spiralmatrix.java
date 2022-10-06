import javax.xml.transform.Source;

public class spiralmatrix {
    public static void main(String[] args) {
        int matrix[][] =   {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9,10,11,12},
                            {13,14,15,16}};
        spiral(matrix);
    }

    public static void spiral(int matrix[][]) {
        int startrow=0,  startcol=0;
        int erow=matrix.length-1,  ecol=matrix.length-1;

        while(startrow<=erow  &&  startcol<=ecol){

            for(int i=startcol;i<=ecol;i++){
                System.out.print(matrix[startrow][i]+" ");
                
            }
             for(int i=startrow;i<=erow;i++){
                System.out.print(matrix[i][ecol]+" ");
                
             }
             for(int i=ecol-1;i>=startcol;i--){
                System.out.print(matrix[erow][i]+" ");
             }
             for(int i=erow-1;i<=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
             }
             startrow++;
             startcol++;
             erow--;
             ecol--;

        }
        

    }
}
