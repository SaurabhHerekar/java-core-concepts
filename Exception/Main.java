public class Main {
    public static void main(String[] args) {
        
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("cannot devide by zero");
        }finally{
            System.err.println("Execution completed");
        }
    }

}
