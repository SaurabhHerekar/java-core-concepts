public class Armstrong {

    public static void main(String[] args) {
        int num=153;
        int count=0;
        int temp=num;

        while(num>0){
            int digit=num%10;
            count+=digit*digit*digit;
            num/=10;
        }
        System.out.println(temp==count? "armstrong":"not armstrong");
    }
}