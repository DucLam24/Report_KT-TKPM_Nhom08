package dao.impls;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

import dao.CourseService;
import entity.Course;
import entity.Instructor;

public class CourseServiceImpl implements CourseService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuanLyLopHocTinChi_Server");

    @Override
    public void addCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }
    
    
    @Override
    public void updateCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(course);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteCourse(Long courseId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Course course = em.find(Course.class, courseId);
        if (course != null) {
            em.remove(course);
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Course getCourseById(int courseId) {
        EntityManager em = emf.createEntityManager();
        Course course = em.find(Course.class, courseId);
        em.close();
        return course;
    }

    @Override
    public List<Course> getAllCourses() {
        EntityManager em = emf.createEntityManager();
        List<Course> courses = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
        em.close();
        return courses;
    }
    
    
    @Override
    public void assignInstructorToCourse(int courseId, int instructorId) {
        EntityManager em = emf.createEntityManager();
        try {
        	em.getTransaction().begin();
            Course course = em.find(Course.class, courseId);
            Instructor instructor = em.find(Instructor.class, instructorId);
            if (course != null && instructor != null) {
                course.setInstructor(instructor);
                instructor.getCourses().add(course);
                em.merge(course);
                em.getTransaction().commit();
            } else {
                em.getTransaction().rollback();
            }
            em.close();
		} catch (Exception e) {
            if (em.getTransaction() != null && em.getTransaction().isActive()) {
            	em.getTransaction().rollback();
            }
            e.printStackTrace();
		}
    }
}

