import java.util.ArrayList;
import java.util.List;

// Abstract class for Course Types
abstract class CourseType {
    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}

// Subclasses
class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Exam Course: " + getName());
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Assignment Course: " + getName());
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void showCourse() {
        courseType.displayDetails();
    }

    // Wildcard method
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayDetails();
        }
    }
}

// ✅ Main Class to Test the Code
public class CourseManagement {
    public static void main(String[] args) {
        // Creating specific courses
        Course<ExamCourse> mathExam = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> historyAssignment = new Course<>(new AssignmentCourse("History"));

        // Display individual courses
        mathExam.showCourse();
        historyAssignment.showCourse();

        // Creating a list of courses (using wildcard)
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Physics"));
        courses.add(new AssignmentCourse("English"));

        // Display all courses
        Course.displayAllCourses(courses);
    }
}
