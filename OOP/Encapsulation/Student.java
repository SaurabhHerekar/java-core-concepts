class Student{
    private int id;
    private String name;
    private int marks;

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public int getmarks(){
        return marks;
    }

    public void setmarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("invalid marks");

        }
    }


}


