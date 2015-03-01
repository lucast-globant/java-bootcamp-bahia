-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema high_school_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema high_school_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `high_school_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `high_school_db` ;

-- -----------------------------------------------------
-- Table `high_school_db`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high_school_db`.`teachers` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `date_of_birth` VARCHAR(45) NOT NULL DEFAULT '01/01/1900',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high_school_db`.`courses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high_school_db`.`courses` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `hours` INT NOT NULL DEFAULT 0,
  `assigned_teacher` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `assigned_teacher_idx` (`assigned_teacher` ASC),
  CONSTRAINT `assigned_teacher`
    FOREIGN KEY (`assigned_teacher`)
    REFERENCES `high_school_db`.`teachers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high_school_db`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high_school_db`.`students` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `student_lu` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `student_lu_UNIQUE` (`student_lu` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high_school_db`.`students_courses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high_school_db`.`students_courses` (
  `course_id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `exam1` INT NULL DEFAULT NULL,
  `exam2` INT NULL DEFAULT NULL,
  `exam3` INT NULL DEFAULT NULL,
  `final` INT NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`, `student_id`),
  INDEX `student_id_idx` (`student_id` ASC),
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `high_school_db`.`courses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `student_id`
    FOREIGN KEY (`student_id`)
    REFERENCES `high_school_db`.`students` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `high_school_db`.`courses_sched`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `high_school_db`.`courses_sched` (
  `id_course` INT NOT NULL,
  `day` VARCHAR(45) NOT NULL,
  `hours` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_course`),
  CONSTRAINT `id_course`
    FOREIGN KEY (`id_course`)
    REFERENCES `high_school_db`.`courses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `high_school_db`.`teachers`
-- -----------------------------------------------------
START TRANSACTION;
USE `high_school_db`;
INSERT IGNORE INTO `high_school_db`.`teachers` (`id`, `first_name`, `last_name`, `date_of_birth`) VALUES (1, 'Agustin', 'Antunes', '4/4/1994');
INSERT IGNORE INTO `high_school_db`.`teachers` (`id`, `first_name`, `last_name`, `date_of_birth`) VALUES (2, 'Alan', 'Ramires', '5/5/1992');
INSERT IGNORE INTO `high_school_db`.`teachers` (`id`, `first_name`, `last_name`, `date_of_birth`) VALUES (3, 'Joaquin', 'Vital', '6/6/1996');

COMMIT;


-- -----------------------------------------------------
-- Data for table `high_school_db`.`courses`
-- -----------------------------------------------------
START TRANSACTION;
USE `high_school_db`;
INSERT IGNORE INTO `high_school_db`.`courses` (`id`, `name`, `hours`, `assigned_teacher`) VALUES (1, 'RPA', 4, 1);
INSERT IGNORE INTO `high_school_db`.`courses` (`id`, `name`, `hours`, `assigned_teacher`) VALUES (2, 'IPOO', 40, 2);
INSERT IGNORE INTO `high_school_db`.`courses` (`id`, `name`, `hours`, `assigned_teacher`) VALUES (3, 'TDP', 22, 3);
INSERT IGNORE INTO `high_school_db`.`courses` (`id`, `name`, `hours`, `assigned_teacher`) VALUES (4, 'RC', 1, 2);
INSERT IGNORE INTO `high_school_db`.`courses` (`id`, `name`, `hours`, `assigned_teacher`) VALUES (5, 'LELZ', 77, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `high_school_db`.`students`
-- -----------------------------------------------------
START TRANSACTION;
USE `high_school_db`;
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (1, 'a', 'a', 1);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (2, 'b', 'b', 2);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (3, 'c', 'c', 3);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (4, 'd', 'd', 4);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (5, 'e', 'e', 5);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (6, 'f', 'f', 6);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (7, 'g', 'g', 7);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (8, 'h', 'h', 8);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (9, 'i', 'i', 9);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (10, 'j', 'j', 10);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (11, 'k', 'k', 11);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (12, 'l', 'l', 12);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (13, 'm', 'm', 13);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (14, 'n', 'n', 14);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (15, 'ñ', 'ñ', 15);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (16, 'o', 'o', 16);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (17, 'p', 'p', 17);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (18, 'q', 'q', 18);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (19, 'r', 'r', 19);
INSERT IGNORE INTO `high_school_db`.`students` (`id`, `first_name`, `last_name`, `student_lu`) VALUES (20, 's', 's', 20);

COMMIT;


-- -----------------------------------------------------
-- Data for table `high_school_db`.`students_courses`
-- -----------------------------------------------------
START TRANSACTION;
USE `high_school_db`;
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 1, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 2, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 3, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 4, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 5, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 6, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 7, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 8, 10, 10, 10, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 9, 9, 9, 9, 9);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 10, 8, 8, 8, 8);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 11, 7, 7, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 12, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 13, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 14, 5, 5, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 15, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 16, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 17, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 18, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 19, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (1, 20, NULL, NULL, NULL, NULL);


INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 1, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 2, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 3, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 4, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 5, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 6, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 7, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 8, 10, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 9, 9, 9, 9, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 10, 8, 8, 8, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 11, 7, 7, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 12, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 13, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 14, 5, 5, 7, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 15, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 16, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 17, 4, 4, 4, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 18, 1, 1, 1, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 19, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (2, 20, NULL, NULL, NULL, NULL);


INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 1, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 2, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 3, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 4, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 5, 3, 6, 7, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 6, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 7, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 8, 10, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 9, 9, 9, 9, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 10, 8, 8, 8, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 11, 7, 7, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 12, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 13, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 14, 5, 5, 7, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 15, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 16, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 17, 4, 4, 4, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 18, 1, 1, 1, 4);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 19, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (3, 20, NULL, NULL, NULL, NULL);


INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 1, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 2, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 3, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 4, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 5, 3, 6, 7, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 6, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 7, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 8, 10, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 9, 9, 9, 9, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 10, 8, 8, 8, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 11, 7, 7, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 12, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 13, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 14, 5, 5, 7, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 15, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 16, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 17, 4, 4, 4, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 18, 1, 1, 1, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 19, NULL, NULL, NULL, NULL);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (4, 20, NULL, NULL, NULL, NULL);


INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 1, 1, 1, 10, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 2, 3, 4, 5, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 3, 3, 3, 3, 3);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 4, 3, 3, 3, 4);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 5, 3, 6, 7, 3);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 6, 3, 3, 3, 5);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 7, 3, 3, 3, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 8, 10, 3, 3, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 9, 9, 9, 9, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 10, 8, 8, 8, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 11, 7, 7, 3, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 12, 4, 5, 6, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 13, 3, 3, 3, 1);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 14, 5, 5, 7, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 15, 3, 3, 3, 2);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 16, 3, 3, 3, 3);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 17, 4, 4, 4, 3);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 18, 1, 1, 1, 10);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 19, 3, 3, 3, 7);
INSERT IGNORE INTO `high_school_db`.`students_courses` (`course_id`, `student_id`, `exam1`, `exam2`, `exam3`, `final`) VALUES (5, 20, 3, 3, 3, 10);



COMMIT;


-- -----------------------------------------------------
-- Data for table `high_school_db`.`courses_sched`
-- -----------------------------------------------------
START TRANSACTION;
USE `high_school_db`;
INSERT IGNORE INTO `high_school_db`.`courses_sched` (`id_course`, `day`, `hours`) VALUES (1, '2', 3);
INSERT IGNORE INTO `high_school_db`.`courses_sched` (`id_course`, `day`, `hours`) VALUES (2, '2', 2);
INSERT IGNORE INTO `high_school_db`.`courses_sched` (`id_course`, `day`, `hours`) VALUES (3, '2', 4);

COMMIT;



-- -----------------------------------------------------
-- PROCEDURES
-- -----------------------------------------------------
begin

delimiter !
CREATE procedure listNotes(IN reg_num INT)
begin
  SELECT * FROM (SELECT course_id AS id, final FROM students_courses WHERE student_id = reg_num AND final IS NOT NULL) AS course_note NATURAL JOIN courses ORDER BY final DESC, name DESC;
  
end; !

CREATE procedure listStudentsTeachers(IN course_input INT)
begin
	
	SELECT * FROM (SELECT first_name,last_name,courses.name FROM (courses, teachers) WHERE courses.id=course_input AND courses.assigned_teacher=teachers.id) AS T1 JOIN 
						(SELECT last_name, first_name FROM (students_courses, students) WHERE (students_courses.course_id=course_input AND students_courses.student_id=students.id ) ) AS T2 ORDER BY T2.last_name;
	

end; !


