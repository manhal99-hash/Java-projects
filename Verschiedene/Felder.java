import java.util.Scanner;

public class Felder {
    public static void main(String[]args){
        int[][]a = {{1,2,3},{3,4,5}};
        int[][]b = {{1,2,3},{3,4,5}};
        matrixMulti(a,b);

    }
    public static void matrixMulti(int[][]a,int[][]b){
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if(colsA != colsB){
            System.out.println("Die Matrizen können nicht multi werden");
            return;
        }
        int[][] ergebnis = new int[rowsA][colsB];

        for(int i = 0; i < rowsA;++i){
            for(int j = 0; j < colsB; ++j){
                for(int k = 0; k < colsA;++k){
                    ergebnis[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Das Ergebnis der Matrix ist: ");
        for(int i = 0; i < rowsA; ++i){
            for(int j = 0; j < colsB;++j){
                System.out.println(ergebnis[i][j]+" ");
            }
        }
        System.out.println();
    }

}
