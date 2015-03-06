package com.globant.app.data.jpa.web;

import com.globant.app.data.jpa.dataaccess.repositories.ICourseRepo;
import com.globant.app.data.jpa.dataaccess.repositories.IStudentRepo;
import com.globant.app.data.jpa.domain.entities.Course;
import com.globant.app.data.jpa.domain.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private IStudentRepo studentRepo;

	@Autowired
	private ICourseRepo courseRepo;


	@RequestMapping(value = "/{id}/courses", method = RequestMethod.POST)
	@Transactional
	@ResponseBody
	public ResponseEntity<Void> addCourse(@RequestBody Course course, @PathVariable Long id) {
		Course newCourse = courseRepo.findById(course.getId());

		if(newCourse == null)
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);

		Student newStudent = studentRepo.findById(id);

		if (newStudent == null)
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		newStudent.getCourses().add(course);

		studentRepo.save(newStudent);

		if (newStudent == null)
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/courses", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Course>> getCourses(@PathVariable Long id){
		Student student = studentRepo.findById(id);

		if (student == null)
			return new ResponseEntity<List<Course>>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<List<Course>>(student.getCourses(), HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@Transactional
	@ResponseBody
	public ResponseEntity<Student> save(@RequestBody Student student) {
		Student newStudent = studentRepo.save(student);

		if (newStudent == null)
			return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<Student>(newStudent, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Student>> getAll() {
		List<Student> studentList = studentRepo.findAll();

		if (studentList == null)
			return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
	}


}
