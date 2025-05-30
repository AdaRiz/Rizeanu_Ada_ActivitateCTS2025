package ro.cts.main;

import ro.cts.clase.StudentEager;
import ro.cts.clase.StudentLazy;
import ro.cts.clase.StudentStaticBlock;
import ro.cts.clase.StudentThreadSafe;

public class Main {
    public static void main(String[] args) {
        StudentLazy studentLazy = StudentLazy.getInstantaStudent("Ion", 10, new int[]{9, 8, 7});
        System.out.println(studentLazy);
        StudentLazy studentLazy2 = StudentLazy.getInstantaStudent("Maria", 11, new int[]{6, 9, 10});
        System.out.println(studentLazy2);
        studentLazy2.setCod(11);
        System.out.println(studentLazy2 + "\n");

        StudentEager studentEager = StudentEager.getInstataStudent();
        System.out.println(studentEager + "\n");

        StudentThreadSafe studentThreadSafe = StudentThreadSafe.getInstantaStudent(16, "Ionela", 1098);
        System.out.println(studentThreadSafe + "\n");

        StudentStaticBlock studentStaticBlock = StudentStaticBlock.getInstantaStudent();
        System.out.println(studentStaticBlock);
        studentStaticBlock.setNume("Ionut");
        studentStaticBlock.setVarsta(30);
        studentStaticBlock.setSex(StudentStaticBlock.Sex.M);
        System.out.println(studentStaticBlock);
    }
}
