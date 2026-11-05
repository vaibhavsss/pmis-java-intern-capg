package Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class InheritanceTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Create normal employee
            Employee e1 = new Employee("Vlad Eternal", 45000, "IT");
            Employee e2 = new Employee("James Buchanan", 5200, "HR");

            // Create Managers (who are also Employees)
            Manager mgr1 = new Manager("Darth Sidious", 95000, "IT", 8, 15000);
            Manager mgr2 = new Manager("Darth Raven", 88000, "Finance", 5, 12000);

            // persist or create
            em.persist(e1);
            em.persist(e2);
            em.persist(mgr1);
            em.persist(mgr2);

            tx.commit();
            System.out.println("========= Date Saved Successfully ========");

            // Query 1
            System.out.println("----- All employees ----");
            List<Employee> allEmployees = em.createQuery(
                    "SELECT e FROM Employee e", Employee.class).getResultList();
            for (Employee e: allEmployees) {
                System.out.println(e);
            }

            // Query 2: Get only Managers
            System.out.println("\n----- All Managers ----");
            List<Manager> managers = em.createQuery(
                    "SELECT m FROM Manager m", Manager.class).getResultList();
            for (Manager m: managers) {
                System.out.println(m);
            }

            // Query 3: Get only regular employees
            System.out.println("\n ----- Only Regular Employees ----");
            List<Employee> regularEmployees = em.createQuery(
                    "SELECT e FROM Employee e WHERE TYPE(e) = Employee", Employee.class
            ).getResultList();
            for (Employee e: regularEmployees) {
                System.out.println(e);
            }
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            } e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
