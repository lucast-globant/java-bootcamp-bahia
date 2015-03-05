package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public TeacherController(){
		
	}
	
	public TeacherController(TeacherRepository teacherRepository){
		this.teacherRepository = teacherRepository;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> store(@RequestBody Teacher input) {
		teacherRepository.save(input);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/")
				.buildAndExpand(input.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Teacher> getAll(){
		return (List<Teacher>) this.teacherRepository.findAll();
	}
}