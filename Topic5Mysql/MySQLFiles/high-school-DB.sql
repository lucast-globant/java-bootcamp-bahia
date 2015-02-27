CREATE DATABASE  IF NOT EXISTS `high_school` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `high_school`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: high_school
-- ------------------------------------------------------
-- Server version	5.6.23-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(45) NOT NULL,
  `hours_by_week` int(10) unsigned NOT NULL,
  `schedule_time` int(11) NOT NULL,
  `teacher_assigned` int(11) NOT NULL,
  PRIMARY KEY (`course_id`),
  KEY `teacher_id_idx` (`teacher_assigned`),
  KEY `schedule_id_idx` (`schedule_time`),
  CONSTRAINT `schedule_id` FOREIGN KEY (`schedule_time`) REFERENCES `schedule` (`schedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teacher_id` FOREIGN KEY (`teacher_assigned`) REFERENCES `teacher` (`teacher_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Estructuras de Datos',12,1,3),(2,'Bases de Datos',8,2,2),(3,'Computacion Grafica',10,3,1),(4,'Organizacion de Computadoras',11,4,2),(5,'Seguridad en Sistemas',4,5,1);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notes`
--

DROP TABLE IF EXISTS `notes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notes` (
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `partial_note1` decimal(10,0) unsigned NOT NULL,
  `partial_note2` decimal(10,0) unsigned NOT NULL,
  `partial_note3` decimal(10,0) unsigned NOT NULL,
  `final_note` decimal(10,0) unsigned NOT NULL,
  PRIMARY KEY (`course_id`,`student_id`),
  KEY `registration_number_idx` (`student_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`registration_number`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notes`
--

LOCK TABLES `notes` WRITE;
/*!40000 ALTER TABLE `notes` DISABLE KEYS */;
INSERT INTO `notes` VALUES (1,1,6,5,4,5),(2,1,6,5,4,5),(3,1,6,5,4,5),(4,1,6,5,4,5),(5,1,6,5,4,5),(6,1,6,5,4,5),(7,1,6,5,4,5),(8,1,6,5,4,5),(9,1,6,5,4,5),(10,1,6,5,4,5),(11,1,6,5,4,5),(12,1,6,5,4,5),(13,1,6,5,4,5),(14,1,6,5,4,5),(15,1,6,5,4,5),(16,1,6,5,4,5),(17,1,6,5,4,5),(18,1,6,5,4,5),(19,1,6,5,4,5),(20,1,6,5,4,5),(1,2,6,5,4,4),(2,2,4,5,2,5),(3,2,9,9,9,10),(4,2,2,2,2,2),(5,2,4,9,2,6),(6,2,4,5,8,6),(7,2,1,8,9,7),(8,2,4,5,4,4),(9,2,4,5,7,6),(10,2,3,3,1,2),(11,2,2,4,6,5),(12,2,5,8,1,4),(13,2,6,7,8,9),(14,2,5,6,3,5),(15,2,5,6,7,10),(16,2,5,2,3,4),(17,2,8,7,8,9),(20,2,4,6,9,8),(24,2,5,5,6,7),(26,2,2,3,1,2),(30,2,1,1,0,1),(1,3,9,9,9,9),(2,3,8,8,8,8),(3,3,7,7,7,7),(4,3,6,5,4,5),(5,3,2,2,2,2),(6,3,4,4,4,4),(7,3,6,5,4,5),(8,3,6,5,4,5),(9,3,6,5,4,5),(10,3,6,5,4,5),(11,3,6,5,4,5),(12,3,6,5,4,5),(13,3,6,5,4,5),(14,3,6,5,4,5),(15,3,6,5,4,5),(16,3,6,5,4,5),(17,3,6,5,4,5),(18,3,6,5,4,5),(19,3,6,5,4,5),(20,3,6,5,4,5),(10,4,6,5,4,5),(11,4,6,5,4,5),(12,4,6,5,4,5),(13,4,6,5,4,5),(14,4,6,5,4,5),(15,4,6,5,4,5),(16,4,6,5,4,5),(17,4,6,5,4,5),(18,4,6,5,4,5),(19,4,6,5,4,5),(20,4,6,5,4,5),(21,4,6,5,4,5),(22,4,6,5,4,5),(23,4,6,5,4,5),(24,4,6,5,4,5),(25,4,6,5,4,5),(26,4,6,5,4,5),(27,4,6,5,4,5),(28,4,6,5,4,5),(29,4,6,5,4,5),(11,5,6,5,4,5),(12,5,6,5,4,5),(13,5,6,5,4,5),(14,5,6,5,4,5),(15,5,6,5,4,5),(16,5,6,5,4,5),(17,5,6,5,4,5),(18,5,6,5,4,5),(19,5,6,5,4,5),(20,5,6,5,4,5),(21,5,6,5,4,5),(22,5,6,5,4,5),(23,5,6,5,4,5),(24,5,6,5,4,5),(25,5,6,5,4,5),(26,5,6,5,4,5),(27,5,6,5,4,5),(28,5,6,5,4,5),(29,5,6,5,4,5),(30,5,6,5,4,5);
/*!40000 ALTER TABLE `notes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedule` (
  `schedule_id` int(11) NOT NULL AUTO_INCREMENT,
  `day` varchar(10) NOT NULL,
  `hour_start` varchar(15) NOT NULL,
  `hour_end` varchar(15) NOT NULL,
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES (1,'Monday','12.00','13.00'),(2,'Tuesday','14.00','16.00'),(3,'Wensday','12.00','13.00'),(4,'Thurday','18.00','20.00'),(5,'Tuesday','10.00','12.00');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `registration_number` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`registration_number`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('Matias','Haure',1,'1991-03-05'),('Luciano','Aguirre',2,'1993-05-06'),('Pedro','Lopez',3,'1995-09-07'),('Manuel','Gimenez',4,'1999-06-08'),('Manuel','Rodriguez',5,'1999-06-08'),('Francisco','Cuenca',6,'1991-01-06'),('Emiliano','Testa',7,'1991-05-06'),('Pedro','Lupe',8,'1991-08-06'),('Ismael','Serrano',9,'1991-05-09'),('Federico','Fernandez',10,'1994-06-15'),('Lionel','Messi',11,'1988-08-14'),('Mariano','Rodecker',12,'1990-06-07'),('Matias','Varela',13,'1991-05-17'),('Luca','Otarola',14,'1992-12-14'),('Mariano','Maisonave',15,'1993-11-17'),('Franco','Toniolo',16,'1994-07-10'),('Tomas','Rossi',17,'1995-07-11'),('Juan','Stagno',18,'1991-05-01'),('Luciano','Lujan',19,'1995-11-03'),('Rogelio','Funes Mori',20,'1992-06-07'),('Amilcar','Infante',21,'1984-02-04'),('Diego','Martinez',22,'1999-05-01'),('Pepito','Locon',23,'1995-05-06'),('Walter','White',24,'1985-06-04'),('Diego','Maradona',25,'1982-05-04'),('Ismael','Serrano',26,'1994-05-09'),('Matias','Gimenez',27,'1995-04-07'),('Albano','Grosso',28,'1998-04-15'),('Lucas','Gonzales',29,'1991-10-11'),('Fernando','Cavenaghi',30,'1985-10-14');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_of_birth` date NOT NULL,
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('Alejandro','Stankevicius','1985-11-02',1),('Diego','Martinez','1984-02-01',2),('Karina','Cenci','1983-06-01',3);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-27 12:02:27
