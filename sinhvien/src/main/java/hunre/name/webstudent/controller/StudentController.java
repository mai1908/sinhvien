package hunre.name.webstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hunre.name.webstudent.entity.Student;
import hunre.name.webstudent.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		//List<Customer> theCustomers=customerDAO.getCustomers();
		List<Student> theStudents = studentService.getStudents();
		theModel.addAttribute("students", theStudents);
		return "list-students";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
//create Model Attribute to bind form data
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		studentService.saveStudent(theStudent);
		return "redirect:/student/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		Student theStudent = studentService.getStudent(theId);
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("studentId") int theId, Model theModel) {
		studentService.deleteStudent(theId);
		return "redirect:/customer/list";
	}
}
