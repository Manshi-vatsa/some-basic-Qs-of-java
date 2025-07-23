import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

          
          System.out.println("enter the 1st number");
          Scanner sc=new Scanner(System.in);
          int num1=sc.nextInt();
          System.out.println("enter the second number");
          int num2=sc.nextInt();
         
         int greatest_number=0;
          for (int i = 1; i <=num1; i++) {
           if (num1%i==0 & num2%i==0) {
            greatest_number=i;
            
           }
            
          }
          System.out.println(greatest_number);

          
         
        
    }
}
