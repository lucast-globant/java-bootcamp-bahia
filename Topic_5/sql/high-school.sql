-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema high-school
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `high-school` ;

-- -----------------------------------------------------
-- Schema high-school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `high-school` DEFAULT CHARACTER SET utf8 ;
USE `high-school` ;

-- -----------------------------------------------------
-- Table `high-school`.`teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`teacher` ;

CREATE TABLE IF NOT EXISTS `high-school`.`teacher` (
  `id_teacher` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  PRIMARY KEY (`id_teacher`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`day`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`day` ;

CREATE TABLE IF NOT EXISTS `high-school`.`day` (
  `id_day` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_day`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`hour`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`hour` ;

CREATE TABLE IF NOT EXISTS `high-school`.`hour` (
  `id_hour` INT(11) NOT NULL AUTO_INCREMENT,
  `init_hour` TIME NOT NULL,
  `finish_hour` TIME NOT NULL,
  PRIMARY KEY (`id_hour`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`schedule`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`schedule` ;

CREATE TABLE IF NOT EXISTS `high-school`.`schedule` (
  `id_schedule` INT(11) NOT NULL AUTO_INCREMENT,
  `id_day` INT(11) NOT NULL,
  `id_hour` INT(11) NOT NULL,
  PRIMARY KEY (`id_schedule`),
  INDEX `id_hour_idx` (`id_hour` ASC),
  INDEX `id_day_idx` (`id_day` ASC),
  CONSTRAINT `id_day`
    FOREIGN KEY (`id_day`)
    REFERENCES `high-school`.`day` (`id_day`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_hour`
    FOREIGN KEY (`id_hour`)
    REFERENCES `high-school`.`hour` (`id_hour`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`course`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`course` ;

CREATE TABLE IF NOT EXISTS `high-school`.`course` (
  `id_course` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `assigned_teacher` INT(11) NOT NULL,
  `hours_by_week` VARCHAR(45) NOT NULL,
  `schedule_time` INT(11) NOT NULL,
  PRIMARY KEY (`id_course`),
  INDEX `assigned_teacher_idx` (`assigned_teacher` ASC),
  INDEX `schedule_time_idx` (`schedule_time` ASC),
  CONSTRAINT `assigned_teacher`
    FOREIGN KEY (`assigned_teacher`)
    REFERENCES `high-school`.`teacher` (`id_teacher`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `schedule_time`
    FOREIGN KEY (`schedule_time`)
    REFERENCES `high-school`.`schedule` (`id_schedule`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`student` ;

CREATE TABLE IF NOT EXISTS `high-school`.`student` (
  `registration_number` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  PRIMARY KEY (`registration_number`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `high-school`.`notes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `high-school`.`notes` ;

CREATE TABLE IF NOT EXISTS `high-school`.`notes` (
  `id_course` INT(11) NOT NULL,
  `registration_number` INT(11) NOT NULL,
  `note_one` INT(11) NULL DEFAULT NULL,
  `note_two` INT(11) NULL DEFAULT NULL,
  `note_three` INT(11) NULL DEFAULT NULL,
  `final_note` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`registration_number`, `id_course`),
  INDEX `id_course_idx` (`id_course` ASC),
  INDEX `registration_number_idx` (`registration_number` ASC),
  CONSTRAINT `id_course`
    FOREIGN KEY (`id_course`)
    REFERENCES `high-school`.`course` (`id_course`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `registration_number`
    FOREIGN KEY (`registration_number`)
    REFERENCES `high-school`.`student` (`registration_number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
