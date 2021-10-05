package Collection_Framework;

public class Student implements Comparable<Student> {
    
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Name " + name + "\tRollNo " + rollno + "\n";
    }

    @Override
    public int compareTo(Student that) {
        return this.rollno - that.rollno;
    }

}
