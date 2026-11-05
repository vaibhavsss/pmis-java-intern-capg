package dao;

import entities.Student;

public interface StudentDao {
    void saveStudent(Student student);
    Student getStudentByID(int studentID);
    void updateStudent(Student student);
    void deleteStudent(int studentID);
}
