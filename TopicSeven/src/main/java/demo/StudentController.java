package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private  StudentRepositoryImpl studentCustomRepositoryImp;
	
	public StudentController(){
		
	}
	
	public StudentController(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> store(@RequestBody Student input) {
		studentRepository.save(input);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{meetingId}")
				.buildAndExpand(input.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getAll(){
		return (List<Student>) this.studentRepository.findAll();
	}
	
	//Usage: http://localhost:8080/students/get?course_name=Math
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Student> getStudentsOfCourse(@RequestParam(value = "course_name", required = false) String name) {
		return this.studentCustomRepositoryImp.getStudentsOfCourse(name);
	}
}
