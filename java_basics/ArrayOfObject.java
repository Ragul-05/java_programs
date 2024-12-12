package java_basics;




 class Area {
    // Properties of the student object
    int rollno;
    String name;
    int marks;

    // Method to calculate and return the grade
    public char grade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        // Creating individual student objects:
        Area s1 = new Area();
        s1.rollno = 49;
        s1.name = "Ruban";
        s1.marks = 100;

        Area s2 = new Area();
        s2.rollno = 50;
        s2.name = "Edwin";
        s2.marks = 95;

        Area s3 = new Area();
        s3.rollno = 51;
        s3.name = "Sanjai";
        s3.marks = 90;

        // Storing references in an array of students
        Area students[] = new Area[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Accessing and printing student details with grades
        for (Area stud : students) {
            System.out.println(
                "Name: " + stud.name + 
                ", Marks: " + stud.marks + 
                ", Grade: " + stud.grade()
            );
        }
    }
}

