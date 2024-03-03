public class Student implements Printable {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getInformation() {
        return "Student Name: " + name + ", ID: " + id;
    }
}
