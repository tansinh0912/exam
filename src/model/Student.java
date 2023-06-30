package model;

import java.util.Scanner;

public class Student extends Person {

    private String Batch;

    double Mark1;

    double Makr2;
    double mediumScore = ((Mark1+Makr2) / 2);
    public Student() {
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public double getMark1() {
        return Mark1;
    }

    public void setMark1(double mark1) {
        Mark1 = mark1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Batch='" + Batch + '\'' +
                ", Mark1=" + Mark1 +
                ", Makr2=" + Makr2 +
                '}';
    }

    public double getMakr2() {
        return Makr2;
    }

    public void setMakr2(double makr2) {
        Makr2 = makr2;
    }

    public void input(Scanner scanner) {
        System.out.println("ID:");
        super.setId(scanner.nextInt());

        System.out.println("Name: ");
        super.setName(scanner.nextLine());

        System.out.println("Number Phone: ");
        super.setNumberPhone(scanner.nextLine());

        System.out.println("Address: ");
        super.setAddress(scanner.nextLine());

        System.out.println("Batch: ");
        String Batch = scanner.nextLine();

        System.out.println("Mark1: ");
        double mark1 = scanner.nextDouble();

        System.out.println("Mark1: ");
        double mark2 = scanner.nextDouble();

        System.out.println("Medium Score: "+mediumScore);

    }

    public Student(int id, String name, String numberPhone, String address, double salaryE) {
        super(id, name, numberPhone, address, salaryE);
    }


    public void show() {
        System.out.println("---Student---");
        System.out.println("ID  ----->" + getId());
        System.out.println("NAME    ----->" + getName());
        System.out.println("NumberPhone    ----->" + getNumberPhone());
        System.out.println("ADDRESS   ----->" + getAddress());
        System.out.println("Medium Score   ----->" +mediumScore);
    }
}