import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        List<Integer> nums=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        System.out.println(nums);
       System.out.println("the second largest element is"+ nums.get(length-2));
      
         
         }
     }
