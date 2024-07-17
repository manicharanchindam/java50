import java.util.Scanner;

public class fact12 {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        if (a==0){
            fact=0;
        }
        System.out.println(fact);
        sc.close();
    }
    
}
