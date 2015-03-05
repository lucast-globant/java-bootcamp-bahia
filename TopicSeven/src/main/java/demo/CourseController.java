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
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseRepositoryImpl courseCustomRepositoryImp;

	public CourseController() {

	}

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> store(@RequestBody Course input) {
		courseRepository.save(input);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{meetingId}")
				.buildAndExpand(input.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Course> getAll() {
		return (List<Course>) this.courseRepository.findAll();
	}

	// Usage = http://localhost:8080/courses/get?name=Leonel&lname=Messi
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Course> getCoursesOfStudent(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "lname", required = false) String lname) {
		return this.courseCustomRepositoryImp.getCoursesOfStudent(name, lname);
	}
}