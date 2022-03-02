import java.util.Arrays;

public class Main {
    /* Hem de comprovar que mos pasen una matriu fins 3x3 */

    public static boolean checkMatrix(int[][] matriu) {
        // matriu.length --> files
        //matriu[0].length --> columnes
        return matriu.length <= 3 && matriu[0].length <= 3;
        /*
        for (int j = 0; j < matriu.length; j++){
            for (int i = 0; i < matriu[0].length; i++) {
                if (i > 2) {
                    isLessThan4 = false;
                    break;
                }
            }
            if (j > 2) isLessThan4 = false;
        }
        */
    }
    /* multiplicar = a*A= {1*a 2*a 3*a 4*a ... n*a}  */

    public static int[][] multConstant(int constant, int[][] matrix){

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                matrix[row][col] *= constant;

        return matrix;
    }

    /* Sumar dues matrius = A + B = 1A+1B,2A+2B... nB+nB
    *  PER SUMAR! HAN DE SER DE LA MATEIXA tamany */

    public static boolean compareMatrix(int[][] matrix1, int[][] matrix2) {

        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }


    public static void printMatrix (int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++)
                System.out.print(matrix[row][col] + " ");
            System.out.println();
        }
    }


    public static int[][] sumar(int[][] matrix1, int[][] matrix2){


        int rows = matrix1.length;
        int columns = matrix1[0].length;

        if (compareMatrix(matrix1,matrix2)) {
            for (int row = 0; row < rows; row++)
                for (int col = 0; col < columns; col++)
                    matrix1[row][col] += matrix2[row][col];
        }

        return matrix1;
    }


    public static int[][] restar(int[][] matrix1, int[][] matrix2){

        if(!compareMatrix(matrix1,matrix2)) return matrix1;

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                matrix1[row][col] -= matrix2[row][col];

        return matrix1;
    }
    /*multiplicar matrius A*B

     A={1 3  B={1
        2 4}    2}
     //PRimer ses files de se B == a ses columnes A 2x(2 2)x1 --> 2x1;
     A*B = C --> files A i ses columens B --> 2F i 1C
     Fila 1C = 1B*1A + 2B+3A ....
     Fila 2C = 1B*2A + 2B*4A ...
     *
     Ho deixam per qui s'atravesqui
     /
     */



    public static int[][] multMatrix(int[][] matrix1, int[][] matrix2){
        int[][] matrix3 = new int[matrix1[0].length][matrix2.length];

        if (matrix1.length == matrix2[0].length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    matrix3[j][i] = matrix1[j][i] * matrix2[j][i];

                }
            }
        }
        return matrix3;
    }
    /* Determinant 2x2-->  nomes funciona per matrius quadra 2x2
    *  A={a b
    *     c d}
    *  det = a*d - b*c
    * */

    public static int determinant2x2(int[][] matrix){

        int determinant = 0 ;
        if(matrix.length == 2 && matrix[0].length == 2){
            determinant = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        }
        return determinant;
    }
    /* adjunta de una posisicio A={a,b,
                                   c,d} adj(0,0)  3x3*/

    public static int adj(int F,int C, int [][]matrix){
        int adjunta = 0;
        if(matrix.length == 3 && matrix[0].length == 3){
            int [] llistamatriu = new int[4];//[a,b,c,d] 2x2
            int iLlista = 0;
            int rows = matrix.length;
            int columns = matrix[0].length;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < columns; col++) {
                    if(row!=F && col!=C){
                        llistamatriu[iLlista]=matrix[row][col];
                        iLlista++;
                    }
                }
            }
            adjunta=llistamatriu[0]*llistamatriu[3] - llistamatriu[1]*llistamatriu[2];
            /*
            int [][] matrix2x2= new int[2][2];
            /*
            maxtrix2x2[0][0] = llistamatriu[0]
            .
            .
            .
            matrix2x2[1][1] = llistamatriu[4]
            iLlista = 0;
            for (int row = 0; row < 2; row++)
                for (int col = 0; col < 2; col++) {
                    matrix2x2[row][col] = llistamatriu[iLlista];
                    iLlista++;
                }
            */

        }
        return adjunta ;
    }

    /* determinant 3x3
    *
    *
    * */
    /* public static int determinant3x3(){

    } */

    public static void main(String[] args) {
        /* String clase = "Jodidos";
        System.out.println(clase); */

        int [][] A = {{1,2,3},{4,3,1}, {1,0,1}};
        int [][] A2 = {{0,2,5},{2,3,1}, {4,1,2}};
        int [][] B = {{3,1},{1,0}};
        int [][] C = {{3}};
        int [][] D = {{1},{2},{3}};

        printMatrix(sumar(A,A2));
        //Farem matrius de fins a 3x3--> Exemples: 2x2 3x2 3x1...2x1;
        /*
        - nomenclatura; matriu A B C .
        A2x2={1 1
              1 2}

        A3x1={1
              2
              3}
        - A={ 1 2
              3 4}
         - constant = a,b,c... 3 , 4 ,0



         */



    }
}