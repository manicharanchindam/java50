import java.util.Scanner;

public class  Fibonacci15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n1=0;
        int n2=1;
         System.out.print(n1+" "+n2);
        for(int i=0;i<a;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            

        }
    }
}