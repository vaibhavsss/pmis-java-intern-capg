package dao;

import entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentDaoImpl implements StudentDao {
    private EntityManager em = JPAUtil.getEntityManager();

    @Override
    public void saveStudent(Student student) {
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(student);
        tx.commit();

        System.out.println("Student save success.");
    }
    @Override
    public Student getStudentByID(int studentID) {
        return em.find(Student.class, studentID);
    }
    @Override
    public void updateStudent(Student student) {
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(student);
        tx.commit();
        System.out.println("Student update success.");
    }
    @Override
    public void deleteStudent(int studentID) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Student student = em.find(Student.class, studentID);
        if  (student != null) {
            em.remove(student);
        }
        tx.commit();
        System.out.println("Student delete success.");
    }
}