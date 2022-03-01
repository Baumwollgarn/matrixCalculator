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
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        return rows1 == rows2 && columns1 == columns2;
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

        if(!compareMatrix(matrix1,matrix2)) return matrix1;

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                matrix1[row][col] += matrix2[row][col];
        /*
        if (compareMatrix(matrix1,matrix2)) {
            for (int row = 0; row < rows; row++)
                for (int col = 0; col < columns; col++)
                    matrix1[row][col] += matrix2[row][col];
        }
         */
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

        }

        return matrix3;
    }
    /* Determinant 2x2-->  nomes funciona per matrius quadra 2x2
    *  A={a b
    *     c d}
    *  det = a*d - b*c
    * */

    public static int determinant(int[][] matrix){

        int determinant = 0 ;
        if()
        return determinant;
    }


    public static void main(String[] args) {
        String clase = "Jodidos";
        System.out.println(clase);

        int [][] A = {{1,2,3},{4,3,1}, {1,0,1}};
        int [][] A2 = {{0,2,5},{2,3,1}, {4,1,2}};
        int [][] B = {{3,1},{1,0}};
        int [][] C = {{3}};
        int [][] D = {{1},{2},{3}};

        System.out.println(Arrays.deepToString(sumar(A, A2)));

        printMatrix(A);
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