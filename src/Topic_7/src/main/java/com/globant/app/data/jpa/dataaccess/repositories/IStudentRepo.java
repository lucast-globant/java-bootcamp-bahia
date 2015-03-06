package com.globant.app.data.jpa.dataaccess.repositories;

import com.globant.app.data.jpa.domain.entities.Student;
import org.springframework.stereotype.Component;

@Component
public interface IStudentRepo extends IRepository<Student> {

}