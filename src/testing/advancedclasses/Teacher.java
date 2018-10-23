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
public class Teacher extends Person {
    
    public Student[] students;
    private int count;
    private final int MAX_STUDENTS;

    public Teacher() {
        MAX_STUDENTS = 100;
    }
    
    public Teacher(String name) {
        super();
        super.setName(name);
        super.setAge(30);
        MAX_STUDENTS = 100;
        count = 0;
        students = new Student[MAX_STUDENTS];
    } 
    
    public void addStudent(Student student) {
        students[count] = student;
        count++;
        if (count > MAX_STUDENTS) count = 0;
    } 
    
    @Override
    public String toString() {
        String text = super.toString();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                text += "\n\tStudents " + i + ": " + students[i].toString();
            }
        }
        return text;
    }
    
    public boolean equals(Teacher teacher) {
        if (!super.equals(teacher)) return false;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null && teacher.students[i] != null) {
                return false;
            } else if (this.students[i] != null && teacher.students == null) {
                return false;
            } else if (this.students[i] != null) {
                if (!this.students[i].equals(teacher.students[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public Teacher clone() {
        Teacher teacher = new Teacher(this.getName());
        teacher.setAge(this.getAge());
        teacher.isMale = this.isMale;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                Student student = this.students[i].clone();
                teacher.addStudent(student);
            }
        }
        return teacher;
    }

}
