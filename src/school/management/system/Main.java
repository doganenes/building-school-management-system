package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher melinda = new Teacher(1, "Melinda", 500);
        Teacher charles = new Teacher(2, "Charles", 350);
        Teacher voize = new Teacher(3, "Voize", 400);
        Teacher dogan = new Teacher(4, "Dogan", 500);

        List<Teacher> teacherList = new ArrayList<Teacher>();

        teacherList.add(melinda);
        teacherList.add(charles);
        teacherList.add(voize);
        teacherList.add(dogan);

        Student charl = new Student(1, "Charl", 74);
        Student foden = new Student(2, "Foden", 86);
        Student alice = new Student(3, "Alice", 95);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(charl);
        studentList.add(foden);
        studentList.add(alice);

        School ghs = new School(teacherList, studentList);


        charl.payFees(5000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        foden.payFees(7000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        alice.payFees(8000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        System.out.println("-----------Making School Pay Salary-----------");

        melinda.receiveSalary(melinda.getSalary());
        System.out.println("GHS has spent for salary to: " + melinda.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        voize.receiveSalary(voize.getSalary());
        System.out.println("GHS has spent for salary to: " + voize.getName() + " and now has $" + ghs.getTotalMoneyEarned());


        System.out.println();

        System.out.println(charl);

        charles.receiveSalary(charles.getSalary());
        System.out.println(charles);

        System.out.println(voize);

        System.out.println(alice);

        System.out.println(melinda);

        dogan.receiveSalary(dogan.getSalary());
        System.out.println(dogan);
    }


}
