import java.util.*;
public class primenum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
        boolean isPrime=true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime? "prime number":"Not prime");
        
    }
}