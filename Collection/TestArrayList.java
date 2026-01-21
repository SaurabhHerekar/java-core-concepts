import java.util.*;
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("c");
        list.add("python");
        list.add("java");

         System.out.println(list);

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // for(String lang : list){
        //     System.out.println(lang);
        // }

        // list.remove("python");
        // list.remove(0);
        // System.out.println(list);

        // System.out.println(list.get(1));
        // list.set(1, "R");
        // System.out.println(list);
        // System.out.println(list.size());

        HashSet<String> set=new HashSet<>(list);
        System.out.println(set);


    }
}
