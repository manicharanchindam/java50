import java.util.Scanner;
public class add3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A ");
        int a= sc.nextInt();
        System.out.println("Enter B ");
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+c);
        sc.close();
    }
    
}
