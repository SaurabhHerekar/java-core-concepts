public class Test {

    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            int c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Can not divide by zero");

        }finally{
            System.out.println("program ends here");
        }
    }
}
