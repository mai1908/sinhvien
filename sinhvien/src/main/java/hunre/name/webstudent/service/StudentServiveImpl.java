package hunre.name.webstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hunre.name.webstudent.dao.StudentDao;
import hunre.name.webstudent.entity.Student;


@Service
public class StudentServiveImpl implements StudentService {
		
	
	// need to inject customerDAO
		@Autowired
		private StudentDao studentDAO;
		
		
		
		@Override
		@Transactional
		public List<Student> getStudents() {
			return studentDAO.getStudents();
		}

		@Override
		@Transactional
		public void saveStudent(Student theStudent) {

			studentDAO.saveStudent(theStudent);
		}

		@Override
		@Transactional
		public Student getStudent(int theId) {
			
			return studentDAO.getStudent(theId);
		}

		@Override
		@Transactional
		public void deleteStudent(int theId) {
			
			studentDAO.deleteStudent(theId);
		}

		@Override
		@Transactional
		public void updateStudent(Student theStudent) {
			studentDAO.updateStudent(theStudent);
			
		}
}
