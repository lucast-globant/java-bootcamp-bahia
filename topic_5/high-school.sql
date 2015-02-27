/*Create a database named 'high-school' and modelate:

    Student: first name, last name, registration number, date of birth)
    Teacher: first name, last name, date of birth)
    Course: name, assigned teacher, hours by week, schedule time (they can be dictated several times during the week)

Notes:

    An student can assist several courses during the same year.
    A teacher can be assigned to several courses.
    For each course, each student has 3 partial notes and a final note.*/

CREATE database high_school;
USE high_school;

CREATE USER high_school_user IDENTIFIED BY 'hspw'; 

grant usage on *.* to high_school_user@localhost identified by 'hspw'; 
grant all privileges on high_school.* to high_school_user@localhost;

CREATE TABLE student (
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	reg_number INT UNSIGNED NOT NULL,
	birth DATE NOT NULL,

	PRIMARY KEY (reg_number)
) ENGINE=InnoDB;

CREATE TABLE teacher (
	id_teacher INT UNSIGNED NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	birth DATE NOT NULL,

	PRIMARY KEY (id_teacher)	
) ENGINE=InnoDB;

CREATE TABLE course (
	id_course INT UNSIGNED NOT NULL AUTO_INCREMENT,
	name VARCHAR(15) NOT NULL,
	id_teacher INT UNSIGNED NOT NULL,
	hours_week INT UNSIGNED NOT NULL,
	schedule_time INT UNSIGNED NOT NULL,

	PRIMARY KEY (id_course),

	CONSTRAINT fk_course_teacher
	FOREIGN KEY (id_teacher) REFERENCES teacher (id_teacher)
) ENGINE=InnoDB;

#tables for relationships
CREATE TABLE rinde (
	reg_number INT UNSIGNED NOT NULL,
	id_course INT UNSIGNED NOT NULL,
	partial_note_1 TINYINT UNSIGNED NOT NULL,
	partial_note_2 TINYINT UNSIGNED NOT NULL,
	partial_note_3 TINYINT UNSIGNED NOT NULL,
	final_note TINYINT UNSIGNED NOT NULL,

	INDEX (final_note),

	CONSTRAINT pk_rinde
	PRIMARY KEY (reg_number,id_course),

	CONSTRAINT fk_rinde_student
	FOREIGN KEY (reg_number) REFERENCES student (reg_number),

	CONSTRAINT fk_rinde_course
	FOREIGN KEY (id_course) REFERENCES course (id_course)
) ENGINE=InnoDB;

#Insert information for 3 teachers, 5 courses and 20 students per course
      
#student (first_name, last_name, reg_number, birth)
INSERT INTO student VALUES ("Name1", "LastName1", 1, "1989-11-27"), ("Name2", "LastName2", 2, "1992-10-09"), ("Name3", "LastName3", 3, "1990-08-13"), ("Name4", "LastName4", 4, "1989-02-15"), ("Name5", "LastName5", 5, "1989-09-07"), ("Name6", "LastName6", 6, "1991-09-27"), ("Name7", "LastName7", 7, "1993-08-27"), ("Name8", "LastName8", 8, "1994-01-17"), ("Name9", "LastName9", 9, "1992-07-21"), ("Name10", "LastName10", 10, "1995-06-20"), ("Name11", "LastName11", 11, "1992-05-14"), ("Name12", "LastName12", 12, "1992-03-29"), ("Name13", "LastName13", 13, "1993-02-27"), ("Name14", "LastName14", 14, "1991-08-01"), ("Name15", "LastName15", 15, "1991-12-03"), ("Name16", "LastName16", 16, "1988-12-25"), ("Name17", "LastName17", 17, "1987-10-20"), ("Name18", "LastName18", 18, "1994-09-19"), ("Name19", "LastName19", 19, "1995-02-12"), ("Name20", "LastName20", 20, "1994-09-11"), ("Name21", "LastName21", 21, "1995-05-15"), ("Name22", "LastName22", 22, "1993-04-18"), ("Name23", "LastName23", 23, "1996-04-10"), ("Name24", "LastName24", 24, "1994-11-01"), ("Name25", "LastName25", 25, "1991-09-03"), ("Name26", "LastName26", 26, "1990-02-05"), ("Name27", "LastName27", 27, "1990-07-07"), ("Name28", "LastName28", 28, "1988-01-09"), ("Name29", "LastName29", 29, "1989-03-11"), ("Name30", "LastName30", 30, "1990-05-13"), ("Name31", "LastName31", 31, "1991-07-15"), ("Name32", "LastName32", 32, "1992-09-17"), ("Name33", "LastName33", 33, "1990-11-02"), ("Name34", "LastName34", 34, "1990-02-21"), ("Name35", "LastName35", 35, "1989-01-22");
      
# teacher (id_teacher ,first_name,	last_name, birth)
INSERT INTO teacher VALUES (default, "NameTeacher1", "LastNameTeacher1", "1957-10-11"), (default, "NameTeacher2", "LastNameTeacher2", "1969-04-27"), (default, "NameTeacher3", "LastNameTeacher3", "1975-07-06");
  
# course (id_course, name, id_teacher, hours_week, schedule_time)
INSERT INTO course VALUES (default, "Algebra", 1, 8, 4);
INSERT INTO course VALUES (default, "Philosophy", 3, 6, 3);
INSERT INTO course VALUES (default, "Literature", 2, 8, 4);
INSERT INTO course VALUES (default, "Chemestry", 1, 4, 2);
INSERT INTO course VALUES (default, "Physics", 1, 8, 4);

# rinde (id_student, id_course, partial_note_1, partial_note_2, partial_note_3, final_note)
INSERT INTO rinde VALUES (1, 1, 1, 4, 7, 4), (2, 1, 4, 4, 4, 8), (3, 1, 1, 1, 10, 10), (4, 1, 7, 5, 4, 6), (5, 1, 6, 5, 4, 2), (6, 1, 1, 4, 7, 4), (7, 1, 10, 4, 6, 7), (8, 1, 9, 8, 7, 6), (9, 1, 6, 7, 8, 9), (10, 1, 5, 5, 5, 6), (11, 1, 4, 4, 6, 7), (12, 1, 3, 2, 9, 1), (13, 1, 2, 3, 10, 6), (14, 1, 3, 3, 6, 7), (15, 1, 7, 4, 2, 8), (16, 1, 8, 8, 2, 9), (17, 1, 7, 5, 4, 10), (18, 1, 7, 3, 5, 6), (19, 1, 9, 2, 2, 7), (20, 1, 4, 9, 10, 9);
INSERT INTO rinde VALUES (1, 4, 8, 7, 4, 5), (2, 4, 7, 7, 6, 5), (3, 4, 5, 6, 5, 7), (4, 4, 8, 8, 8, 4), (5, 4, 4, 4, 6, 3), (6, 4, 10, 9, 8, 9), (7, 4, 10, 4, 2, 9), (8, 4, 9, 4, 5, 8), (9, 4, 7, 4, 3, 6), (10, 4, 6, 5, 2, 4), (11, 4, 7, 4, 5, 4), (12, 4, 7, 7, 7, 7), (13, 4, 8, 4, 7, 6), (14, 4, 5, 4, 3, 2), (15, 4, 2, 4, 3, 5), (16, 4, 8, 9, 10, 7), (17, 4, 9, 7, 8, 10), (18, 4, 10, 10, 10, 10), (19, 4, 9, 4, 7, 8), (20, 4, 7, 5, 2, 8);
INSERT INTO rinde VALUES (1, 5, 2, 5, 5, 5), (2, 5, 3, 4, 7, 3), (3, 5, 6, 4, 5, 6), (4, 5, 10, 5, 2, 9), (5, 5, 5, 5, 2, 2), (6, 5, 9, 9, 2, 4), (7, 5, 2, 4, 9, 9), (8, 5, 7, 9, 7, 5), (9, 5, 5, 7, 7, 9), (10, 5, 1, 8, 3, 6), (11, 5, 3, 1, 8, 4), (12, 5, 10, 4, 2, 4), (13, 5, 9, 6, 3, 8), (14, 5, 3, 6, 9, 8), (15, 5, 10, 10, 8, 9), (16, 5, 9, 9, 8, 10), (17, 5, 7, 7, 10, 8), (18, 5, 8, 8, 2, 6), (19, 5, 9, 4, 7, 6), (20, 5, 10, 2, 2, 4);
INSERT INTO rinde VALUES (16, 2, 8, 8, 2, 6), (17, 2, 4, 4, 5, 2), (18, 2, 10, 7, 5, 1), (19, 2, 4, 4, 8, 1), (20, 2, 4, 8, 6, 7), (21, 2, 5, 6, 7, 7), (22, 2, 6, 10, 8, 9), (23, 2, 9, 9, 10, 8), (24, 2, 7, 7, 5, 4), (25, 2, 10, 4, 2, 3), (26, 2, 5, 4, 5, 3), (27, 2, 2, 5, 5, 4), (28, 2, 3, 5, 5, 5), (29, 2, 7, 7, 7, 7), (30, 2, 8, 8, 8, 8), (31, 2, 9, 9, 2, 6), (32, 2, 3, 3, 10, 9), (33, 2, 8, 8, 10, 9), (34, 2, 10, 10, 5, 7), (35, 2, 5, 2, 7, 6);
INSERT INTO rinde VALUES (26, 3, 7, 6, 2, 5), (27, 3, 3, 4, 9, 5), (28, 3, 2, 4, 6, 8), (29, 3, 5, 4, 6, 4), (30, 3, 4, 9, 2, 2), (31, 3, 4, 2, 6, 4), (32, 3, 6, 8, 7, 5), (33, 3, 4, 6, 7, 9), (34, 3, 9, 8, 2, 4), (35, 3, 10, 7, 2, 8), (1, 3, 3, 6, 6, 6), (2, 3, 10, 4, 10, 4), (3, 3, 9, 8, 9, 4), (4, 3, 7, 5, 7, 5), (5, 3, 4, 6, 6, 4), (6, 3, 10, 4, 10, 4), (7, 3, 10, 10, 10, 10), (8, 3, 9, 9, 9, 9), (9, 3, 8, 8, 8, 8), (10, 3, 10, 10, 10, 10);