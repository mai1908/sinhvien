package hunre.name.webstudent.dao;

import java.util.List;

import hunre.name.webstudent.entity.Student;


public interface StudentDao {
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);

	public void deleteStudent(int theId);
	
	public void updateStudent(Student theStudent);
}
