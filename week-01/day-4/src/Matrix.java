import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] myMatrix =

        {
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1}
        };
        for(int i = 0; i < myMatrix.length; i++){
            for(int j = 0; j < myMatrix[i].length; j++){
                System.out.print(myMatrix[i][j] +" ");
            }
            System.out.println();
        }


    }
}
