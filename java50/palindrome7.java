
import java.util.Scanner;

public class palindrome7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        int temp=a;
        int rev=0;
        while(temp!=0){
             int rem=temp%10;
             rev=rev*10+rem;
             temp/=10;
        }
        if(rev==a){
            System.out.println(a+" is a palindrome");
        }
        else{
            System.out.println(a+" is not a palindrome");

        }
        sc.close();
    }


}