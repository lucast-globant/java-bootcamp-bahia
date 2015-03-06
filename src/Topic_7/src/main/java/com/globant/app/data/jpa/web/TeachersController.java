package com.globant.app.data.jpa.web;

import com.globant.app.data.jpa.dataaccess.repositories.ITeacherRepo;
import com.globant.app.data.jpa.domain.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeachersController {

	@Autowired
	private ITeacherRepo teacherRepo;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@Transactional
	@ResponseBody
	public ResponseEntity<Teacher> save(@RequestBody Teacher student) {
		Teacher newTeacher = teacherRepo.save(student);

		if (newTeacher == null)
			return new ResponseEntity<Teacher>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<Teacher>(newTeacher, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Teacher>> getAll() {
		List<Teacher> teacherList = teacherRepo.findAll();

		if (teacherList == null)
			return new ResponseEntity<List<Teacher>>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<List<Teacher>>(teacherList, HttpStatus.OK);
	}
}