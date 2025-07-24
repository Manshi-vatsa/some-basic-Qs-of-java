import java.util.*;
import java.util.ArrayList;

public class test{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("enter the length of array");
         Scanner Sc=new Scanner(System.in);
         int length=Sc.nextInt();
         Sc.nextLine();

        System.out.println("enter the numbers to be enterd in array");
        
        for (int i = 0; i <=length; i++) {
           
            list.add(Sc.nextInt());
           
        }
        System.out.println("the elements of array are");
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i) +" ");
        }
        System.out.println("\n");
         int max=list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)>max) {
                max=list.get(i);
                
            }
        }
        System.out.println( "the maximum element is "+max);

    }

}
