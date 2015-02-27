DROP DATABASE IF EXISTS high_school_db;

CREATE DATABASE high_school_db;

USE high_school_db;

CREATE TABLE IF NOT EXISTS teachers (
  id            INT         NOT NULL UNIQUE,
  first_name    VARCHAR(30) NOT NULL,
  last_name     VARCHAR(30) NOT NULL,
  date_of_birth DATE        NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS students (
  id            INT         NOT NULL UNIQUE,
  first_name    VARCHAR(30) NOT NULL,
  last_name     VARCHAR(30) NOT NULL,
  school_id     VARCHAR(10) NOT NULL UNIQUE,
  date_of_birth DATE        NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE =InnoDB;

CREATE TABLE IF NOT EXISTS courses (
  id            INT         NOT NULL UNIQUE,
  name          VARCHAR(30) NOT NULL,
  hours_by_week INT         NOT NULL,
  teacher_id    INT         NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (teacher_id) REFERENCES teachers (id)
)
  ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS courses_students (
  course_id      INT NOT NULL,
  student_id     INT NOT NULL,
  first_partial  INT,
  second_partial INT,
  third_partial  INT,
  final_exam     INT,
  PRIMARY KEY (course_id, student_id),
  FOREIGN KEY (course_id) REFERENCES courses (id),
  FOREIGN KEY (student_id) REFERENCES students (id)
)
  ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS courses_schedules (
  course_id INT  NOT NULL,
  day       INT  NOT NULL,
  start     TIME NOT NULL,
  end       TIME NOT NULL,
  FOREIGN KEY (course_id) REFERENCES courses (id)
)
  ENGINE = InnoDB;