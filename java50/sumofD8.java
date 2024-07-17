import java.util.Scanner;
public class sumofD8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any digits of number");
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        System.out.println("The sum of digits "+a+" is :"+sum);

    }
    
}
