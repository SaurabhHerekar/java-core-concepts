import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;

        while (num>0) {
            rev=rev*10+num%10;
            num/=10;
            
        }
        if(rev==temp){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
