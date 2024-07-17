
import java.util.Random;
import java.util.Scanner;

public class random14 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter  a ");
        int a=sc.nextInt();
         System.out.println("Enter  b ");
        int b=sc.nextInt();
        int min=0;
        int max=0;
        if(a>b){
            max=a;
            min=b;
        }
        else{
            max=b;
            min=a;
        }
        Random ran=new Random();
        int randomnuber=ran.nextInt((max-min)+1)+min;
System.out.println(randomnuber);
    }
    
}
