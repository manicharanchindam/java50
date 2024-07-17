import java.util.Scanner;

public class max13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int a=sc.nextInt();
        int temp=a;
        int maxd=0;
        while(temp!=0){
            int rem=temp%10;
            if(rem>maxd){
                maxd=rem;
            }
            temp/=10;
        }
        System.out.println(maxd);

    }
    
}
