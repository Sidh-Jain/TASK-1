import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    float marks;
    float attendance;

    String getName() {
        return name;
    }
    void setName() {
        Scanner sn = new Scanner(System.in);
        name = sn.nextLine();
    }

    int getRollNumber() {
        return rollNumber;
    }
    void setRollNumber() {
        Scanner sr = new Scanner(System.in);
        rollNumber = sr.nextInt();
    }

    float getMarks() {
        return marks;
    }
    void setMarks() {
        Scanner sm = new Scanner(System.in);
        marks = sm.nextFloat();
    }

    float getAttendance() {
        return attendance;
    }
    void setAttendance() {
        Scanner sa = new Scanner(System.in);
        attendance = sa.nextFloat();
    }

    float criteria() {
        if(marks < 0.0f) marks = 0.0f;
        if(attendance > 75.0f) marks = marks + 10.0f;
        if(marks > 100.0f) marks = 100.0f;
        return marks;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        System.out.println("STUDENT-1");
        System.out.print("Enter Name: ");
        S1.setName();
        System.out.print("Enter Roll Number: ");
        S1.setRollNumber();
        System.out.print("Enter Marks(out of 100): ");
        S1.setMarks();
        System.out.print("Enter Attendnace(in %): ");
        S1.setAttendance();

        System.out.println("STUDENT-2");
        System.out.print("Enter Name: ");
        S2.setName();
        System.out.print("Enter Roll Number: ");
        S2.setRollNumber();
        System.out.print("Enter Marks(out of 100): ");
        S2.setMarks();
        System.out.print("Enter Attendnace(in %): ");
        S2.setAttendance();

        System.out.println("Final Marks obtained by " + S1.name + " is " + S1.criteria());
        System.out.println("Final Marks obtained by " + S2.name + " is " + S2.criteria());
    }
}
