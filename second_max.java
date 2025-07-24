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
		System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int nums[]=new int[length];
        System.out.println("enter the elements of array");
        for (int i = 0; i < length; i++) {
            nums[i]=sc.nextInt();

        }
        int max=-1, second_max=-1;
        for (int i = 1; i < length; i++) {
            if (nums[i]>max) {
                max=nums[i];                
            }
        }
        System.out.println("the max element is "+ max);

        
        for (int i = 0; i < length; i++) {
            if (nums[i]>second_max && nums[i]!=max) {
                second_max=nums[i];
            }
        }
         System.out.println("the second largest element is "+ second_max);
         
         }
     }
