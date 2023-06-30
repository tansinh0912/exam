package utils;

import model.Person;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Manager {

    static List<Person> ListExam = new ArrayList<>();
    Student student = new Student();
    Teacher teacher = new Teacher();


    public static void inputInf() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Inf");
        System.out.println("1. Input Student");
        System.out.println("2. Input Teacher");

        int choose = scanner.nextInt();

        if (choose == 1) {
            Student student = new Student();
            student.input(scanner);
            ListExam.add(student);
        } else {
            Teacher teacher = new Teacher();
            teacher.input(scanner);
            ListExam.add(teacher);
        }
    }
    public static void printMenu(){

        System.out.println("---Print Menu---");
        System.out.println("---Input Student Or Teacher---");
        System.out.println("---Exit---");

    }

    public static void showInf(){
        for (Person person : ListExam) {
            if (person instanceof Teacher teacher) {
                teacher.show();
            } else if (person instanceof Student student) {
                student.show();
            } else {
                System.out.println("Error");
            }
        }
    }
}
