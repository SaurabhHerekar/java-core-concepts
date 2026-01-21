public class ReverseString {

    public static void main(String[] args) {
        String s="jaj";
        String r="";

        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        System.out.println(r);

        if (s.equals(r)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}