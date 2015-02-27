CREATE DATABASE `highschool`;
USE `highschool`;
-- -----------------------------------------------------
-- Table `high-school`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`Student` (
  `st_id` INT NOT NULL AUTO_INCREMENT,
  `st_firstName` VARCHAR(25) NULL,
  `st_lastName` VARCHAR(45) NULL,
  `st_regNumber` INT NOT NULL,
  `st_dateOfBirth` DATE NULL,
  PRIMARY KEY (`st_id`),
  UNIQUE INDEX `st_regNumber_UNIQUE` (`st_regNumber`));

-- -----------------------------------------------------
-- Table `high-school`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`Teacher` (
  `tc_id` INT NOT NULL AUTO_INCREMENT,
  `tc_firstName` VARCHAR(25) NULL,
  `tc_lastName` VARCHAR(45) NULL,
  `tc_dateOfBirth` DATE NULL,
  PRIMARY KEY (`tc_id`));

-- -----------------------------------------------------
-- Table `high-school`.`WeekDays`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`WeekDays` (
  `wd_id` INT NOT NULL AUTO_INCREMENT,
  `wd_description` VARCHAR(9) NULL,
  PRIMARY KEY (`wd_id`));


-- -----------------------------------------------------
-- Table `high-school`.`HourlyDay`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`HourlyDay` (
  `hd_id` INT NOT NULL AUTO_INCREMENT,
  `hd_description` TIME NULL,
  PRIMARY KEY (`hd_id`));


-- -----------------------------------------------------
-- Table `high-school`.`Times`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`ScheduleTimes` (
  `tm_id` INT NOT NULL AUTO_INCREMENT,
  `tm_dayWeek` INT NULL,
  `tm_hourStart` INT NULL,
  `tm_hourFinish` INT NULL,
  PRIMARY KEY (`tm_id`),
  CONSTRAINT `FK_SCHEDULETIMES_tm_dayWeek`
    FOREIGN KEY (`tm_dayWeek`)
    REFERENCES `highschool`.`WeekDays` (`wd_id`),
  CONSTRAINT `FK_SCHEDULETIMES_tm_hourStart`
    FOREIGN KEY (`tm_hourStart`)
    REFERENCES `highschool`.`HourlyDay` (`hd_id`),
  CONSTRAINT `FK_SCHEDULETIMES_tm_hourFinish`
    FOREIGN KEY (`tm_hourFinish`)
    REFERENCES `highschool`.`HourlyDay` (`hd_id`));


-- -----------------------------------------------------
-- Table `high-school`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`Course` (
  `cs_id` INT NOT NULL AUTO_INCREMENT,
  `cs_name` VARCHAR(45) NULL,
  `cs_asignedTeacher` INT NULL,
  `cs_hoursByTeacher` INT NULL,
  `cs_scheduleTime` INT NULL,
  PRIMARY KEY (`cs_id`),
  CONSTRAINT `FK_COURSE_cs_scheduleTime`
    FOREIGN KEY (`cs_scheduleTime`)
    REFERENCES `highschool`.`ScheduleTimes` (`tm_id`),
  CONSTRAINT `FK_COURSE_cs_asignedTeacher`
    FOREIGN KEY (`cs_asignedTeacher`)
    REFERENCES `highschool`.`Teacher` (`tc_id`));

-- -----------------------------------------------------
-- Table `high-school`.`Student - Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highschool`.`StudentCourse` (
  `sc_id` INT NOT NULL AUTO_INCREMENT,
  `sc_course` INT NULL,
  `sc_student` INT NULL,
  `sc_partial1` FLOAT NULL,
  `sc_partial2` FLOAT NULL,
  `sc_partial3` FLOAT NULL,
  `sc_finalNote` INT NULL,
  `sc_year` YEAR NULL,
  PRIMARY KEY (`sc_id`),
  CONSTRAINT `FK_STUDENTCOURSE_sc_course`
    FOREIGN KEY (`sc_course`)
    REFERENCES `highschool`.`Course` (`cs_id`),
  CONSTRAINT `FK_STUDENTCOURSE_sc_student`
    FOREIGN KEY (`sc_student`)
    REFERENCES `highschool`.`Student` (`st_id`));