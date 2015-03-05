package com.aguirre.topic7.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	StudentDao studentDao;
	@Autowired
	TeacherDao teacherDao;
	@Autowired
	CourseDao courseDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Student st1 = new Student("Juan", "Riquelme", "1986-12-05");
		studentDao.save(st1);

		for (Student student : studentDao.findAll()) {
			System.out.println(student.toString());
		}

		Teacher t1 = new Teacher("Pedro", "Maradona", "1953-10-30");
		teacherDao.save(t1);

		for (Teacher teacher : teacherDao.findAll()) {
			System.out.println(teacher.toString());
		}

		Course c1 = new Course("Pascal", t1.getFileNumber(), 4);
		courseDao.save(c1);

		for (Course course : courseDao.findAll()) {
			System.out.println(course.toString());
		}
	}
}
