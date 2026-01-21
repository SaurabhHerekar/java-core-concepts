public class Count_Vowels {

    public static void main(String[] args) {
        String s="AEIOU";
        int Count=0;
        for(int i=1; i <s.length(); i++){
            String a=s.toLowerCase();
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                Count++;
            }
        }
        System.out.println(Count);
    }

}
