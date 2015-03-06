package com.globant.app.data.jpa.web;

import com.globant.app.data.jpa.dataaccess.repositories.ICourseRepo;
import com.globant.app.data.jpa.dataaccess.repositories.IStudentRepo;
import com.globant.app.data.jpa.domain.entities.Course;
import com.globant.app.data.jpa.domain.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {
	@Autowired
	private ICourseRepo courseRepo;

	@Autowired
	private IStudentRepo studentRepo;

	@RequestMapping(value = "/{id}/students", method = RequestMethod.POST)
	@javax.transaction.Transactional
	@ResponseBody
	public ResponseEntity<Void> addStudent(@RequestBody Student student, @PathVariable Long id) {
		Student newStudent = studentRepo.findById(student.getId());

		if (newStudent == null)
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);

		Course newCourse = courseRepo.findById(id);

		if(newCourse == null)
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		newCourse.getStudents().add(newStudent);

		courseRepo.save(newCourse);

		if (newStudent == null)
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/students", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Student>> getCourses(@PathVariable Long id) {
		Course course = courseRepo.findById(id);

		if (course == null)
			return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<List<Student>>(course.getStudents(), HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@Transactional
	@ResponseBody
	public ResponseEntity<Course> save(@RequestBody Course Course) {
		Course newCourse = courseRepo.save(Course);

		if (newCourse == null)
			return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<Course>(newCourse, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Course>> getAll() {
		List<Course> CourseList = courseRepo.findAll();

		if (CourseList == null)
			return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<List<Course>>(CourseList, HttpStatus.OK);
	}

}
