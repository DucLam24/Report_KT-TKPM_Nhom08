package test;

import java.util.List;

import dao.CourseService;
import dao.DepartmentService;
import dao.InstructorService;
import dao.StudentService;
import dao.impls.CourseServiceImpl;
import dao.impls.DepartmentServiceImpl;
import dao.impls.InstructorServiceImpl;
import dao.impls.StudentServiceImpl;
import entity.Course;
import entity.Department;
import entity.Enrollment;
import entity.Instructor;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuanLyLopHocTinChi_Server");
		EntityManager em = emf.createEntityManager();
		CourseService courseDao = new CourseServiceImpl();
		StudentService stu =  new StudentServiceImpl();
		
		DepartmentService dep = new DepartmentServiceImpl();
		InstructorService ins = new InstructorServiceImpl();
//
			EntityTransaction tx = em.getTransaction();
			Student st = stu.getStudentById(1);
			Department deps = dep.getDepartmentById(1);
			Instructor instructor = ins.getInstructorById(1);
			Course course =  courseDao.getCourseById(5);
			

//			stu.registerCourse(st, course);
			
			
		
		
		List<Enrollment> enr =  course.getEnrollments();
//		
		for (Enrollment enrollment : enr) {
//			
			System.out.println(enrollment.getStudent().getName());
		}
		
		

	}

}
