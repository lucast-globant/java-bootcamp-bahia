-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-03-2015 a las 20:26:42
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `highschool`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `idcourse` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `hoursbyweek` int(11) NOT NULL,
  `assignedteacher` int(11) NOT NULL,
  PRIMARY KEY (`idcourse`),
  UNIQUE KEY `idcourse` (`idcourse`),
  KEY `idcourse_2` (`idcourse`),
  KEY `assignedteacher` (`assignedteacher`),
  KEY `assignedteacher_2` (`assignedteacher`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `course`
--

INSERT INTO `course` (`idcourse`, `name`, `hoursbyweek`, `assignedteacher`) VALUES
(1, 'Science', 8, 1),
(2, 'History', 10, 3),
(3, 'Technology', 5, 2),
(4, 'German', 5, 3),
(5, 'Mathematic', 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notespercourse`
--

CREATE TABLE IF NOT EXISTS `notespercourse` (
  `idstudent` int(11) NOT NULL,
  `idcourse` int(11) NOT NULL,
  `year` year(4) NOT NULL,
  `note1` decimal(10,0) NOT NULL,
  `note2` decimal(10,0) NOT NULL,
  `note3` decimal(10,0) NOT NULL,
  `finalnote` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idcourse`,`idstudent`),
  KEY `idstudent` (`idstudent`),
  KEY `idcourse` (`idcourse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `notespercourse`
--

INSERT INTO `notespercourse` (`idstudent`, `idcourse`, `year`, `note1`, `note2`, `note3`, `finalnote`) VALUES
(1, 1, 2014, 7, 8, 10, 8),
(3, 1, 2014, 6, 7, 5, 6),
(5, 1, 2014, 7, 9, 6, 6),
(8, 1, 2014, 10, 9, 8, 9),
(9, 1, 2014, 9, 8, 7, 8),
(13, 1, 2014, 7, 5, 7, 8),
(16, 1, 2014, 6, 10, 9, 9),
(17, 1, 2014, 6, 5, 9, 9),
(22, 1, 2014, 3, 7, 9, 9),
(27, 1, 2014, 6, 9, 9, 9),
(28, 1, 2014, 6, 9, 7, 8),
(30, 1, 2014, 7, 9, 6, 6),
(34, 1, 2014, 6, 9, 7, 8),
(36, 1, 2014, 8, 7, 7, 8),
(37, 1, 2014, 9, 9, 6, 6),
(39, 1, 2014, 9, 5, 7, 8),
(44, 1, 2014, 9, 8, 9, 9),
(47, 1, 2014, 8, 6, 9, 9),
(49, 1, 2014, 6, 9, 6, 6),
(51, 1, 2014, 9, 10, 6, 6),
(52, 1, 2014, 6, 7, 9, 9),
(1, 2, 2014, 2, 5, 7, 8),
(3, 2, 2014, 1, 8, 9, 9),
(7, 2, 2014, 8, 6, 7, 8),
(9, 2, 2014, 8, 6, 9, 9),
(11, 2, 2014, 6, 9, 9, 9),
(13, 2, 2014, 9, 6, 6, 6),
(17, 2, 2014, 5, 9, 9, 9),
(18, 2, 2014, 10, 6, 8, 9),
(19, 2, 2014, 9, 7, 8, 9),
(23, 2, 2014, 5, 8, 9, 9),
(25, 2, 2014, 10, 8, 9, 9),
(26, 2, 2014, 2, 6, 8, 9),
(27, 2, 2014, 8, 5, 6, 6),
(31, 2, 2014, 9, 9, 6, 6),
(35, 2, 2014, 5, 9, 9, 9),
(36, 2, 2014, 9, 8, 6, 6),
(38, 2, 2014, 8, 7, 7, 8),
(39, 2, 2014, 8, 8, 8, 9),
(42, 2, 2014, 3, 6, 7, 8),
(43, 2, 2014, 4, 8, 10, 9),
(45, 2, 2014, 4, 6, 6, 6),
(48, 2, 2014, 9, 9, 6, 6),
(2, 3, 2014, 8, 7, 6, 6),
(4, 3, 2014, 7, 6, 5, 6),
(6, 3, 2014, 6, 9, 10, 9),
(8, 3, 2014, 6, 6, 7, 8),
(10, 3, 2014, 3, 5, 7, 8),
(11, 3, 2014, 5, 6, 8, 9),
(12, 3, 2014, 4, 9, 6, 6),
(14, 3, 2014, 5, 6, 8, 9),
(15, 3, 2014, 9, 9, 6, 6),
(19, 3, 2014, 6, 9, 9, 9),
(20, 3, 2014, 5, 6, 9, 9),
(21, 3, 2014, 8, 7, 8, 9),
(22, 3, 2014, 6, 6, 6, 6),
(23, 3, 2014, 6, 9, 10, 9),
(30, 3, 2014, 7, 4, 9, 9),
(37, 3, 2014, 8, 6, 8, 9),
(38, 3, 2014, 10, 6, 8, 9),
(42, 3, 2014, 10, 9, 9, 9),
(46, 3, 2014, 9, 10, 7, 8),
(48, 3, 2014, 7, 6, 8, 9),
(4, 4, 2014, 5, 6, 7, 8),
(5, 4, 2014, 5, 7, 5, 6),
(7, 4, 2014, 9, 5, 9, 9),
(10, 4, 2014, 10, 8, 9, 9),
(15, 4, 2014, 8, 8, 9, 9),
(18, 4, 2014, 9, 8, 7, 8),
(24, 4, 2014, 7, 7, 8, 9),
(25, 4, 2014, 4, 6, 5, 6),
(26, 4, 2014, 6, 5, 10, 9),
(29, 4, 2014, 9, 8, 6, 6),
(31, 4, 2014, 8, 8, 8, 9),
(32, 4, 2014, 9, 6, 7, 8),
(34, 4, 2014, 5, 5, 8, 9),
(35, 4, 2014, 7, 6, 9, 9),
(40, 4, 2014, 5, 8, 8, 9),
(41, 4, 2014, 7, 8, 8, 9),
(44, 4, 2014, 6, 9, 6, 6),
(46, 4, 2014, 6, 7, 9, 9),
(49, 4, 2014, 6, 7, 7, 8),
(50, 4, 2014, 9, 6, 8, 9),
(52, 4, 2014, 5, 6, 7, 8),
(2, 5, 2014, 9, 6, 8, 9),
(6, 5, 2014, 4, 8, 9, 9),
(12, 5, 2014, 8, 7, 5, 6),
(14, 5, 2014, 6, 7, 5, 6),
(16, 5, 2014, 3, 8, 10, 9),
(20, 5, 2014, 6, 8, 9, 9),
(21, 5, 2014, 4, 6, 7, 8),
(24, 5, 2014, 9, 6, 9, 9),
(28, 5, 2014, 4, 6, 8, 9),
(29, 5, 2014, 5, 7, 7, 8),
(32, 5, 2014, 8, 5, 6, 6),
(33, 5, 2014, 6, 8, 9, 9),
(40, 5, 2014, 9, 6, 6, 6),
(41, 5, 2014, 6, 10, 6, 6),
(43, 5, 2014, 8, 8, 7, 8),
(45, 5, 2014, 9, 7, 7, 8),
(47, 5, 2014, 6, 8, 7, 8),
(50, 5, 2014, 9, 7, 9, 9),
(51, 5, 2014, 5, 9, 7, 8),
(52, 5, 2014, 10, 5, 9, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `schedule`
--

CREATE TABLE IF NOT EXISTS `schedule` (
  `idcourse` int(11) NOT NULL,
  `scheduleday` enum('Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday') NOT NULL,
  `schedulefrom` time NOT NULL,
  `scheduleto` time NOT NULL,
  KEY `idcourse` (`idcourse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `schedule`
--

INSERT INTO `schedule` (`idcourse`, `scheduleday`, `schedulefrom`, `scheduleto`) VALUES
(1, 'Monday', '12:00:00', '14:00:00'),
(1, 'Tuesday', '15:00:00', '17:00:00'),
(1, 'Wednesday', '14:00:00', '16:00:00'),
(1, 'Friday', '08:00:00', '10:00:00'),
(2, 'Monday', '08:00:00', '10:00:00'),
(2, 'Tuesday', '08:30:00', '10:30:00'),
(2, 'Thursday', '10:00:00', '12:00:00'),
(2, 'Friday', '14:00:00', '16:00:00'),
(3, 'Wednesday', '16:00:00', '18:00:00'),
(3, 'Thursday', '16:00:00', '18:00:00'),
(3, 'Friday', '11:00:00', '12:00:00'),
(4, 'Wednesday', '09:00:00', '10:30:00'),
(4, 'Thursday', '08:30:00', '10:00:00'),
(4, 'Tuesday', '11:00:00', '13:00:00'),
(5, 'Monday', '15:00:00', '17:00:00'),
(5, 'Friday', '12:00:00', '14:00:00'),
(5, 'Tuesday', '13:00:00', '15:00:00'),
(5, 'Wednesday', '12:00:00', '14:00:00'),
(5, 'Thursday', '14:00:00', '16:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `regnumber` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `dateofbirth` date NOT NULL,
  PRIMARY KEY (`regnumber`),
  KEY `regnumber` (`regnumber`),
  KEY `regnumber_2` (`regnumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=52 ;

--
-- Volcado de datos para la tabla `student`
--

INSERT INTO `student` (`regnumber`, `firstname`, `lastname`, `dateofbirth`) VALUES
(1, 'Christabella', 'Arkwright', '2000-12-12'),
(2, 'Beth', 'Norris', '2000-01-01'),
(3, 'Kimberly', 'Bass', '2000-05-01'),
(4, 'Lily', 'Nowell', '1999-06-06'),
(5, 'Jared', 'Moores', '2001-03-06'),
(6, 'Marleen', 'Gary', '2000-05-09'),
(7, 'Judah', 'Bagley', '2001-09-08'),
(8, 'Nathaniel', 'Gibb', '2000-10-02'),
(9, 'Becky', 'English', '2001-12-07'),
(10, 'Cordelia', 'Martell', '2000-11-09'),
(11, 'Russ', 'Lindsey', '2001-05-08'),
(12, 'Cyrilla', 'Reynell', '2000-05-10'),
(13, 'Bryan', 'Huff', '2000-08-12'),
(14, 'Sid', 'Brigham', '2001-09-15'),
(15, 'Cash', 'Rye', '1999-04-16'),
(16, 'Kipling', 'Saylor', '2000-08-16'),
(17, 'Tacey', 'Weaver', '2001-07-10'),
(18, 'Colten', 'Levitt', '2001-09-18'),
(19, 'Maynerd', 'Gardener', '1999-09-19'),
(20, 'Yosef', 'Haroldson', '2001-09-17'),
(21, 'Ford', 'Collingwood', '2000-08-15'),
(22, 'Michelle', 'Hargrave', '2000-10-13'),
(23, 'Nichole', 'Jekyll', '1999-11-12'),
(24, 'Fitz', 'Robertson', '2001-11-14'),
(25, 'Cliff', 'Purcell', '2000-03-12'),
(26, 'Brianna', 'Aylmer', '2001-07-13'),
(27, 'Darin', 'Watson', '2001-05-15'),
(28, 'Piers', 'Isaacson', '2000-04-18'),
(29, 'Liza', 'Ingram', '2001-04-05'),
(30, 'Emelia', 'Badcock', '1999-03-05'),
(31, 'Rain', 'Carlisle', '2000-02-08'),
(32, 'Kodey', 'Hart', '2001-02-01'),
(33, 'Kinley', 'Snider', '1999-01-20'),
(34, 'Elisabeth', 'Bray', '2001-01-25'),
(35, 'Zachery', 'Sides', '1999-11-25'),
(36, 'Tybalt', 'Walsh', '2000-06-26'),
(37, 'Phyllis', 'Harvey', '2000-07-28'),
(38, 'Greyson', 'Wray', '2000-07-22'),
(39, 'Lexie', 'Hameldon', '2001-06-23'),
(40, 'Mollie', 'Seward', '2001-11-29'),
(41, 'Denis', 'Thorpe', '2000-12-31'),
(42, 'Jannette', 'Belcher', '2000-05-31'),
(43, 'Gall', 'Holland', '1999-05-20'),
(44, 'Pearlie', 'Varnham', '2000-06-20'),
(45, 'Michele', 'Jenkins', '2001-06-25'),
(46, 'Justine', 'Welch', '1999-07-14'),
(47, 'Rebecca', 'Banister', '2000-07-23'),
(48, 'Quincey', 'Ward', '2001-08-25'),
(49, 'Katrina', 'Cole', '2000-09-29'),
(50, 'Abisai', 'North', '1999-09-27'),
(51, 'Debby', 'Quincy', '1999-05-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `idteacher` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `datebirth` date NOT NULL,
  PRIMARY KEY (`idteacher`),
  KEY `idteacher` (`idteacher`),
  KEY `idteacher_2` (`idteacher`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `teacher`
--

INSERT INTO `teacher` (`idteacher`, `firstname`, `lastname`, `datebirth`) VALUES
(1, 'Glinda', 'Gapinski', '1954-02-12'),
(2, 'Maureen', 'Haskett', '1972-12-23'),
(3, 'Satchel', 'Forrest', '1960-07-08');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`idcourse`) REFERENCES `notespercourse` (`idcourse`);

--
-- Filtros para la tabla `schedule`
--
ALTER TABLE `schedule`
  ADD CONSTRAINT `schedule_ibfk_1` FOREIGN KEY (`idcourse`) REFERENCES `course` (`idcourse`);

--
-- Filtros para la tabla `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`regnumber`) REFERENCES `notespercourse` (`idstudent`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
