package hunre.name.webstudent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import hunre.name.webstudent.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDao {
	
	// need to inject the session factory
		 @PersistenceContext  
		 private EntityManager currentSession;
				
		@Override
		public List<Student> getStudents() {
			
			// execute query and get result list
			List<Student> students = currentSession.createQuery("from Student order by hoten").getResultList();	
			return students;
		}

		@Override
		public void saveStudent(Student theStudent) {
			
			// save
			currentSession.merge(theStudent);
			
		}

		@Override
		public Student getStudent(int theId) {
			
			// now retrieve/read from database using the primary key
			Student theStudent = currentSession.find(Student.class, theId);
			
			return theStudent;
		}

		@Override
		public void deleteStudent(int theId) {
			Student theStudent = currentSession.find(Student.class, theId);
			currentSession.remove(theStudent);
			
		}

		@Override
		public void updateStudent(Student theStudent) {
			// TODO Auto-generated method stub
			currentSession.merge(theStudent);
			
		}
}
