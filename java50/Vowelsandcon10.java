import java.util.Scanner;

public class Vowelsandcon10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any words: ");
        String a=sc.nextLine();
        int count=0;
        int count1=0;
        int len=a.length();
        for(int i=0;i<len;i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                count++;
            }
            if(a.charAt(i)!='a'&& a.charAt(i)!='e'&& a.charAt(i)!='i'&& a.charAt(i)!='o'&& a.charAt(i)!='u'){
                count1++;
            }
        }
        System.out.println("The number of vowels in "+a+" are :"+count);
        System.out.println("The number of Consonants in "+a+" are :"+count1);
        sc.close();
    }
    
}
