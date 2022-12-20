package OOPS_Questions;

//https://tcsxplorejavacodingquestions.blogspot.com/2021/12/dec-23-java-coding-question-pra-solution.html

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Student[] students = new Student[4];
        Scanner scn = new Scanner(System.in);
        int in = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < in; i++) {
            int a = scn.nextInt();
            scn.nextLine();
            String b = scn.nextLine();
            int c = scn.nextInt();
            scn.nextLine();
            int d = scn.nextInt();
            scn.nextLine();
            // put all this value for each i in student object
            students[i] = new Student(a, b, c, d);
        }
        int input1 = scn.nextInt();
        scn.nextLine();

        Student ans1 = findStudentWithMaximumAge(students);
        System.out.println("id - " + ans1.id);
        System.out.println("name - " + ans1.name);
        System.out.println("marks + " + ans1.marks);
        System.out.println("age + " + ans1.age);

        Student ans2 = searchStudentId(students, input1);
        if (ans2 == null) System.out.println("No student found");
        else {
            System.out.println("id - " + ans2.id);
            System.out.println("name - " + ans2.name);
            System.out.println("marks + " + ans2.marks);
            System.out.println("age + " + ans2.age);
        }
    }

    public static Student findStudentWithMaximumAge(Student[] students) {
        int maxAge = students[0].age;

        // now run loop from 1
        for (int i = 1; i < students.length; i++) {
            if (students[i].age > maxAge) maxAge = students[i].age;
        }

        for (int i = 0; i < students.length; i++) {
            // we have to return the student object
            if (students[i].age == maxAge) return students[i];
        }

        return null;
    }

    public static Student searchStudentId(Student[] students, int input) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].id == input) return students[i];
        }
        return null;
    }
}


class Student {
    int id;
    String name;
    int marks;
    int age;

    // Constructor

    public Student(int id, String name, int marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}