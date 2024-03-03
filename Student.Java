public class student implements Printable{
    private String name;
    private String id;

    public Student(String name, String id){
        this.name= name;
        this.id= id;
    }

    public String getInformation(){
        System.out.println("Student name:"+name+"ID:"+id)
    }
}