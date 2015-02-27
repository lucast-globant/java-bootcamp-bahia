USE high-school;

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id_course` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `id_assigned_teacher` int(11) NOT NULL,
  `hours_by_week` int(11) NOT NULL,
  `id_shedule_time_fk` int(11) NOT NULL,
  PRIMARY KEY (`id_course`),
  KEY `id_shedule_time_fk_idx` (`id_shedule_time_fk`),
  CONSTRAINT `id_shedule_time_fk` FOREIGN KEY (`id_shedule_time_fk`) REFERENCES `shedule_time` (`id_shedule_time`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

INSERT INTO `course` VALUES (9,'Math',1,4,1),(10,'English',2,4,3),(11,'Python',3,4,2),(12,'Data Bases',3,4,1),(13,'Phisics',1,4,1);

DROP TABLE IF EXISTS `notes`;
CREATE TABLE `notes` (
  `id_notes` int(11) NOT NULL AUTO_INCREMENT,
  `id_student_course_fk` int(11) NOT NULL,
  `partial_note_1` int(11) DEFAULT NULL,
  `partial_note_2` int(11) DEFAULT NULL,
  `partial_note_3` int(11) DEFAULT NULL,
  `final_note` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_notes`),
  KEY `id_sudent_course_fk_idx` (`id_student_course_fk`),
  CONSTRAINT `id_sudent_course_fk` FOREIGN KEY (`id_student_course_fk`) REFERENCES `student_course` (`id_student_course`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

INSERT INTO `notes` VALUES (17,38,10,10,10,10),(18,39,10,10,10,10),(19,42,10,10,10,10);

DROP TABLE IF EXISTS `shedule_time`;
CREATE TABLE `shedule_time` (
  `id_shedule_time` int(11) NOT NULL AUTO_INCREMENT,
  `start_time` int(11) NOT NULL,
  `end_time` int(11) NOT NULL,
  `day_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id_shedule_time`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `shedule_time` VALUES (1,14,18,'Monday'),(2,14,18,'Thuesday'),(3,14,18,'Friday');

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id_student` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `registration_number` int(11) unsigned NOT NULL,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`id_student`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

INSERT INTO `student` VALUES (25,'Juan','Perez',1,'3895-11-06'),(26,'Federico','Diaz',2,'3895-11-06'),(27,'Roman','Riquelme',3,'3895-11-06'),(28,'Daniel','Osvaldo',4,'3895-11-06'),(29,'Walter','Lodeiro',5,'3895-11-06'),(30,'Me','Estoy',6,'3895-11-06'),(31,'Cansando','De',7,'3895-11-06'),(32,'Poner','Nombres',8,'3895-11-06'),(33,'Pero','Casi',9,'3895-11-06'),(34,'Llego','A',10,'3895-11-06'),(35,'La','Mitad',11,'3895-11-06'),(36,'Listo','LLegue',12,'3895-11-06'),(37,'Y','La',13,'3895-11-06'),(38,'Pase','Asd',14,'3895-11-06'),(39,'Ricardo','Iorio',15,'3895-11-06'),(40,'Manuel','Napoli',16,'3895-11-06'),(41,'Joaquin','Garcia',17,'3895-11-06'),(42,'Leonel','Messi',18,'3895-11-06'),(43,'Agustin','Orion',19,'3895-11-06'),(44,'Termi','Ne',20,'3895-11-06');

DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course` (
  `id_student_course` int(11) NOT NULL AUTO_INCREMENT,
  `id_student_fk` int(11) NOT NULL,
  `id_course_fk` int(11) NOT NULL,
  PRIMARY KEY (`id_student_course`),
  KEY `id_student_idx` (`id_student_fk`),
  KEY `id_course_idx` (`id_course_fk`),
  CONSTRAINT `id_course_fk` FOREIGN KEY (`id_course_fk`) REFERENCES `course` (`id_course`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_student_fk` FOREIGN KEY (`id_student_fk`) REFERENCES `student` (`id_student`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

INSERT INTO `student_course` VALUES (33,25,9),(34,25,10),(35,25,11),(36,25,12),(37,25,13),(38,42,9),(39,42,10),(40,42,11),(41,42,12),(42,42,13);

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id_teacher` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`id_teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `teacher` VALUES (1,'a','a','3891-01-05'),(2,'b','b','3891-01-05'),(3,'c','c','3891-01-05');

DROP TABLE IF EXISTS `teacher_course`;
CREATE TABLE `teacher_course` (
  `id_teacher_course` int(11) NOT NULL AUTO_INCREMENT,
  `id_teacher_fk2` int(11) NOT NULL,
  `id_course_fk2` int(11) NOT NULL,
  PRIMARY KEY (`id_teacher_course`),
  KEY `id_course_idx` (`id_course_fk2`),
  KEY `id_teacher_idx` (`id_teacher_fk2`),
  CONSTRAINT `id_course_fk2` FOREIGN KEY (`id_course_fk2`) REFERENCES `course` (`id_course`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_teacher_fk2` FOREIGN KEY (`id_teacher_fk2`) REFERENCES `teacher` (`id_teacher`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

INSERT INTO `teacher_course` VALUES (6,1,9),(7,1,11),(8,2,13),(9,2,12),(10,3,10);
