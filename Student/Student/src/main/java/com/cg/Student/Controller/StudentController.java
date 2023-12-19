package com.cg.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Student.Entity.Student;
import com.cg.Student.Repository.StudentReposutory;


@RestController
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	StudentReposutory studentReposutory;
	
	@PostMapping
	public Student saveStd(@RequestBody Student student) {
		return studentReposutory.save(student);
		
	}
	
	@GetMapping
	public List<Student> getAllStd(){
		return studentReposutory.findAll();
	}
	@PutMapping
	public Student updateStd(@RequestBody Student student) {  
		return studentReposutory.save(student);
	}
	
	@DeleteMapping
	public String deletetStd(@RequestParam Integer stuId) {
		
		studentReposutory.deleteById(stuId);
		return "Deleted succefully";
	}
	
	@GetMapping("/get")
	public Student getAllStu(@RequestParam Integer stuId) {
		return studentReposutory.findById(stuId).get();
	}
}
