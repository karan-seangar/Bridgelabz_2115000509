class Student {
    
    private StudentNode head; 
    private StudentNode tail; 
    private int size; 

    
    class StudentNode {
        String name;
        int rollNumber;
        int age;
        char grade;
        StudentNode next;

        public StudentNode(String name, int rollNumber, int age, char grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    
    public void addStudentAtFirst(String name, int rollNumber, int age, char grade) {
        StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
        if (head == null) {
            head = newStudent;
            tail = newStudent;
        } 
        else {
            newStudent.next = head;
            head = newStudent;
        }
        size++;
        System.out.println("Student added at the beginning successfully.");
    }

    
    public void addStudentAtEnd(String name, int rollNumber, int age, char grade) {
        StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
        if (head == null) {
            head = newStudent;
            tail = newStudent;
        } else {
            tail.next = newStudent;
            tail = newStudent;
        }
        size++;
        System.out.println("Student added at the end successfully.");
    }

    
    public void addStudentAtPosition(String name, int rollNumber, int age, char grade, int position) {
        if (position == 0) {
            addStudentAtFirst(name, rollNumber, age, grade);
        } 
        else if (position == size) {
            addStudentAtEnd(name, rollNumber, age, grade);
        } 
        else {
            StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
            StudentNode prevStudent = getStudentAtPosition(position - 1);
            newStudent.next = prevStudent.next;
            prevStudent.next = newStudent;
            size++;
            System.out.println("Student added at position " + position + " successfully.");
        }
    }

    
    private StudentNode getStudentAtPosition(int position) {
        StudentNode current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }
        return current;
    }

    
    public void deleteAtFirst() {
        if (head == null) return;
        head = head.next;
        size--;
        System.out.println("First student record deleted successfully.");
    }

    
    public void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            tail = null;
        } 
        else {
            StudentNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
        System.out.println("Last student record deleted successfully.");
    }

    
    public void deleteStudentRecord(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            deleteAtFirst();
            return;
        }

        StudentNode current = head;
        while (current.next != null) {
            if (current.next.rollNumber == rollNumber) {
                current.next = current.next.next;
                size--;
                System.out.println("Student with roll number " + rollNumber + " deleted successfully.");
                return;
            }
            current = current.next;
        }
    }

    
    public void displayStudentDetail(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Name: " + current.name);
                System.out.println("Roll Number: " + current.rollNumber);
                System.out.println("Age: " + current.age);
                System.out.println("Grade: " + current.grade);
                System.out.println("---------------------------");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    
    public void updateStudentGrade(int rollNumber, char grade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = grade;
                System.out.println("Grade updated successfully for student with roll number " + rollNumber + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    
    public void displayAllStudentDetails() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            System.out.println("Student Name: " + current.name);
            System.out.println("Roll Number: " + current.rollNumber);
            System.out.println("Age: " + current.age);
            System.out.println("Grade: " + current.grade);
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }
}


public class StudentRecordManagement {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.addStudentAtFirst("Amit Kumar", 101, 21, 'A');
        student1.addStudentAtEnd("Karan Seangar", 108, 22, 'B');
        student1.addStudentAtPosition("Pavan Kumar", 105, 24, 'A', 1);

        student1.displayStudentDetail(108);
        System.out.println();

        
        student1.displayAllStudentDetails();
        student1.deleteAtEnd();

        
        student1.displayAllStudentDetails();

        
        student1.updateStudentGrade(108, 'A');

        
        student1.displayAllStudentDetails();
    }
}
