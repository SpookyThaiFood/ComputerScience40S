/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.advancedclasses;

/**
 *
 * @author t.swaity
 */
public class Student extends Person {
    
    private int studentNumber;
    public static int totalStudents;
    
    public Student(int studentNumber) {
        super();
        this.studentNumber = studentNumber;
        this.isMale = true;
        totalStudents++;
    }
    
    public Student(int studentNumber, String name, int age, boolean isMale) {
        super(name, age, isMale);
        this.studentNumber = studentNumber;
        totalStudents++;
    }
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("Student number " + studentNumber);
    }
    
    public String toString() {
        return super.toString() + "\n student # " + studentNumber;
    }
    
    public int getStudentNumber() {
        return studentNumber;
    }
    
    @Override
    public boolean equals(Object object) {
        Student student = (Student)object;
        if (this.studentNumber != student.getStudentNumber()) return false;
        return super.equals(student);
    }
    
    @Override
    public Student clone() {
        return new Student(studentNumber, getName(), getAge(), isMale);
    }
}
