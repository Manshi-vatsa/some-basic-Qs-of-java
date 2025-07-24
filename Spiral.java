/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the number of rows and columns");
        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();
        int nc=sc.nextInt();
      int[][] matrix= new int[nr][nc];
      System.out.println("enter the elements of matrix");
      for (int i = 0; i < nr; i++) {
        for (int j = 0; j < nc; j++) {
            matrix[i][j]=sc.nextInt();
      }
         }

         for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
         }



         //implemetation od spoiral
         int row_start=0;
         int row_end=nr-1;
         int col_start=0;
         int col_end=nc-1;
         while (row_start<=row_end && col_start<=col_end) {
            for(int j=col_start;j<=col_end;j++){
           System.out.print(matrix[row_start][j]+" ");
            }
            row_start++;
            for(int i=row_start;i<=row_end;i++){
                System.out.print(matrix[i][col_end]+" ");
            
         }
         col_end--;
         for(int j=col_end;j>=col_start;j--){
            System.out.print(matrix[row_end][j]+" ");
         }
         row_end--;

         for(int j=row_end;j>=row_start;j--){
            System.out.print(matrix[j][col_start]+" ");
         }
         col_start++;
         System.out.println();
    }
         }
     }
