package com.aguirre.topic7.models;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentCourseDao extends JpaRepository<StudentCourse, Long> {

	//@Query("SELECT registration_number FROM Student_Course WHERE id_course = :id_course")
	public List<Student> findStudentsByIdCourse(@Param("id_course") Long id_course);

	//@Query("SELECT id_course FROM Student_Course WHERE registration_number = :registration_number")
	public List<Course> findCoursesByRegistrationNumber(@Param("registration_number") Long registration_number);

}
