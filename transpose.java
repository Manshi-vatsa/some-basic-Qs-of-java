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



        System.out.println("the transpose of matrix is ");

         //implemetation od spoiral
         for (int index = 0; index < nc; index++) {
            for (int i = 0; i < nr; i++) {
               System.out.print(matrix[i][index] +" ");
            }
            System.out.println("\n");
            
         }
         
         }
     }
