CREATE DATABASE high_school;

USE high_school;

CREATE TABLE Student(
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	registration_number INT UNSIGNED NOT NULL,
	date_of_birth DATE NOT NULL,
	
	INDEX(first_name,last_name),
	
	CONSTRAINT pk_student PRIMARY KEY (registration_number)
	) ENGINE=InnoDB;
	
CREATE TABLE Teacher(
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	file_number INT UNSIGNED NOT NULL,
	date_of_birth DATE NOT NULL,
	
	CONSTRAINT pk_teacher PRIMARY KEY (file_number)
	)ENGINE=InnoDB;
	
CREATE TABLE Course(
	name_course VARCHAR(20) NOT NULL,
	id_course INT UNSIGNED NOT NULL,
	file_number INT UNSIGNED NOT NULL,
	hours_by_week INT UNSIGNED NOT NULL,
		
	INDEX(name_course),
	
	CONSTRAINT pk_course PRIMARY KEY (id_course),
	
	CONSTRAINT fk_course_file_number FOREIGN KEY (file_number) REFERENCES Teacher (file_number)
	)ENGINE=InnoDB;
	
CREATE TABLE Schedule_Time(
	id_course INT UNSIGNED NOT NULL,
	name_of_day VARCHAR(9) NOT NULL,
	start_time TIME NOT NULL,
	end_time TIME NOT NULL,
	
	CONSTRAINT pk_schedule_time PRIMARY KEY (id_course,name_of_day),
	
	CONSTRAINT pk_schedule_time_id_course FOREIGN KEY (id_course) REFERENCES Course (id_course)
	)ENGINE=InnoDB;
	
CREATE TABLE Student_Course(
	registration_number INT UNSIGNED NOT NULL,
	id_course INT UNSIGNED NOT NULL,
	note1 DECIMAL(4,2) UNSIGNED NOT NULL,
	note2 DECIMAL(4,2) UNSIGNED NOT NULL,
	note3 DECIMAL(4,2) UNSIGNED NOT NULL,
	final_note DECIMAL(4,2) UNSIGNED NOT NULL,
	
	INDEX(final_note),
	
	CONSTRAINT pk_student_course PRIMARY KEY (registration_number,id_course),
	
	CONSTRAINT fk_student_course_registration_number FOREIGN KEY (registration_number) REFERENCES Student (registration_number),
	CONSTRAINT fk_student_course_id_course FOREIGN KEY (id_course) REFERENCES Course (id_course)
	)ENGINE=InnoDB;

#users	
GRANT ALL PRIVILEGES ON high_school.* TO adminBD@localhost IDENTIFIED BY 'admin' WITH GRANT OPTION;












	
	