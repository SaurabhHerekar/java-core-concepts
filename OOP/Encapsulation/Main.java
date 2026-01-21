public class Main {

    public static void main(String[] args) {
        Student s = new Student();

        s.setid(1);
        s.setname("saurabh");
        s.setmarks(99);

        System.out.println("id:"+ s.getid());
        System.out.println("name: "+s.getname());
        System.out.println("marks: "+s.getmarks());
    }
}