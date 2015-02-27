
CREATE database highschool;

USE highschool;

CREATE TABLE person(
dni  INT unsigned NOT NULL,
firstname CHAR(45) NOT NULL,
lastname CHAR(45) NOT NULL,
birthday DATE,

CONSTRAINT pk_person
PRIMARY KEY(dni)
)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO person VALUES
(1,"Juan","Perez","2008/09/14"),
(2,"Juan","Domingo","2008/09/14"),
(3,"Pedro","Perez","2008/09/14");

INSERT LOW_PRIORITY INTO person VALUES
(4,"Pedro","Perez","2008/09/14"),
(5,"Javier","Torres","2008/09/14"),
(6,"Javier","Perez","2008/09/14"),
(7,"Pedro","Torres","2008/09/14"),
(8,"Pedro","Perez","2008/09/14"),
(9,"Pedro","Perez","2008/09/14"),
(10,"Pedro","Perez","2008/09/14"),
(11,"Pedro","Perez","2008/09/14"),
(12,"Pedro","Perez","2008/09/14"),
(13,"Pedro","Perez","2008/09/14"),
(14,"Pedro","Perez","2008/09/14"),
(15,"Pedro","Perez","2008/09/14"),
(16,"Pedro","Perez","2008/09/14"),
(17,"Pedro","Perez","2008/09/14"),
(18,"Pedro","Perez","2008/09/14"),
(19,"Pedro","Perez","2008/09/14"),
(20,"Pedro","Perez","2008/09/14"),
(21,"Pedro","Perez","2008/09/14"),
(22,"Pedro","Perez","2008/09/14"),
(23,"Pedro","Perez","2008/09/14"),
(24,"Pedro","Perez","2008/09/14");


CREATE TABLE teacher(
id INT unsigned NOT NULL AUTO_INCREMENT,
dni  INT unsigned NOT NULL,

CONSTRAINT pk_teacher
PRIMARY KEY(id),

CONSTRAINT pk_person_teacher
FOREIGN KEY(dni) REFERENCES person(dni)

)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO teacher VALUES
(1,1),
(2,2),
(3,3);



CREATE TABLE student(
registerNumber INTEGER unsigned NOT NULL AUTO_INCREMENT,
dni  INT unsigned NOT NULL,

CONSTRAINT pk_student
PRIMARY KEY(registerNumber),

CONSTRAINT pk_person_student
FOREIGN KEY(dni) REFERENCES person(dni)

)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO student VALUES
(1,4), 
(2,5), 
(3,6),
(4,7),
(5,8),
(6,9),
(7,10),
(8,11),
(9,12),
(10,13),
(11,14),
(12,15),
(13,16),
(14,17),
(15,18),
(16,19),
(17,20),
(18,21),
(19,22),
(20,23),
(21,24);



CREATE TABLE course(
	id INT unsigned NOT NULL AUTO_INCREMENT,
	name CHAR(45) NOT NULL,
	hoursperWeek INT unsigned,

	CONSTRAINT pk_course
	PRIMARY KEY(id)

)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO course 
VALUES(1,"Introduction to OOP",8), 
(2,"Phisic I",8), 
(3,"Elements of Data Bases",8), 
(4,"Computer's Teory",8), 
(5,"Data Structures",8);






CREATE TABLE teacher_dictate_course(
	teacher_id INT unsigned NOT NULL AUTO_INCREMENT,
	course_id INT unsigned NOT NULL,
	hour TIME NOT NULL,
	day DATE NOT NULL,

CONSTRAINT pk_teacher_dictate
FOREIGN KEY(teacher_id) REFERENCES teacher(id),

CONSTRAINT pk_course_id
FOREIGN KEY(course_id) REFERENCES course(id)
)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO teacher_dictate_course VALUES(1,1,"16:20:55","2008/09/14"), (2,2,"16:20:55","2008/09/14"), (3,3,"16:20:55","2008/09/14");


CREATE TABLE student_takes_course(
	registerNumber INTEGER unsigned NOT NULL AUTO_INCREMENT,
	course_id INT unsigned NOT NULL,
	partial_1_note INT unsigned,
	partial_2_note INT unsigned,
	partial_3_note INT unsigned,
	final_note INT unsigned,

	CONSTRAINT pk_student_course_id
	FOREIGN KEY(course_id) REFERENCES course(id),

	CONSTRAINT pk_student_id
	FOREIGN KEY(registerNumber) REFERENCES student(registerNumber)
)ENGINE=InnoDB;

INSERT LOW_PRIORITY INTO student_takes_course VALUES(1,1,7,8,6,9), (2,1,5,7,7,7), (3,1,6,6,6,4), (1,2,7,8,9,10), (2,2,7,8,6,8), (3,3,7,8,6,7);
