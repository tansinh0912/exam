package model;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Teacher extends Person {

    private static final int SALARY_DAY = 80000;

    public Teacher() {
    }

    double salary;

    int numberWorkDay;




    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", numberWorkDay=" + numberWorkDay +
                '}';
    }


    public void input(Scanner scanner) {
        System.out.println("ID:");
        super.setId(scanner.nextInt());

        System.out.println("Name: ");
        super.setName(scanner.nextLine());

        System.out.println("Number Phone: ");
        super.setNumberPhone(scanner.next());

        System.out.println("Address: ");
        super.setAddress(scanner.nextLine());

        System.out.println("Salary the working: ");
        setNumberWorkDay(scanner.nextInt());
        setSalaryE(getNumberWorkDay() * SALARY_DAY);

    }

    public void show() {
        System.out.println("---Student---");
        System.out.println("ID  ----->" + getId());
        System.out.println("NAME    ----->" + getName());
        System.out.println("NumberPhone    ----->" + getNumberPhone());
        System.out.println("ADDRESS   ----->" + getAddress());
        System.out.println("Salary the working   ----->" +getSalaryE());
    }

    public static void sortAvg(){
        System.out.println(" Diem Trung Binh: ");
        Collections.sort(Li);
    }

}
