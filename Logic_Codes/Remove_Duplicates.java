import java.util.HashSet;

public class Remove_Duplicates {

    public static void main(String[] args) {
        
       int [] arr={1,2,2,3,3,3,4,4};

       HashSet<Integer> set= new HashSet<>();
       for(int i : arr)
        set.add(i);

       System.out.println(set);

    }

}
