import java.util.ArrayList;
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("\nStudents in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public String getName() {
        return name;
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        
        student1.enroll(math);
        student1.enroll(science);
        student2.enroll(math);
        
        school.addStudent(student1);
        school.addStudent(student2);
        
        school.displayStudents();
        
        student1.viewCourses();
        student2.viewCourses();
        
        math.displayStudents();
        science.displayStudents();
    }
}
