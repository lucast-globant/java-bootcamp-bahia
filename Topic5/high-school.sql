-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-02-2015 a las 00:37:04
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `high-school`
--
CREATE DATABASE IF NOT EXISTS `high-school` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `high-school`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
`co_id` int(4) NOT NULL,
  `co_name` varchar(20) NOT NULL,
  `co_teacher` int(4) NOT NULL,
  `co_weekhs` int(11) NOT NULL,
  `co_schedule_time` int(4) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `courses`
--

INSERT INTO `courses` (`co_id`, `co_name`, `co_teacher`, `co_weekhs`, `co_schedule_time`) VALUES
(1, 'Course one', 1, 4, 1),
(2, 'Course two', 2, 4, 3),
(3, 'Course three', 3, 4, 5),
(4, 'Course four', 1, 4, 7),
(5, 'Course five', 2, 4, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `schedules`
--

CREATE TABLE IF NOT EXISTS `schedules` (
`sc_id` int(4) NOT NULL,
  `sc_day` varchar(9) NOT NULL,
  `sc_hrstart` time NOT NULL,
  `sc_hrfinish` time NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `schedules`
--

INSERT INTO `schedules` (`sc_id`, `sc_day`, `sc_hrstart`, `sc_hrfinish`) VALUES
(1, 'Monday', '08:00:00', '09:00:00'),
(2, 'Monday', '09:00:00', '10:00:00'),
(3, 'Tuesday', '08:00:00', '09:00:00'),
(4, 'Tuesday', '09:00:00', '10:00:00'),
(5, 'Wednesday', '08:00:00', '09:00:00'),
(6, 'Wednesday', '09:00:00', '10:00:00'),
(7, 'Thursday', '08:00:00', '09:00:00'),
(8, 'Thursday', '09:00:00', '10:00:00'),
(9, 'Friday', '08:00:00', '09:00:00'),
(10, 'Friday', '09:00:00', '10:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `students`
--

CREATE TABLE IF NOT EXISTS `students` (
`st_id` int(4) NOT NULL,
  `st_name` varchar(20) NOT NULL,
  `st_lastname` varchar(20) NOT NULL,
  `st_datebirth` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `students`
--

INSERT INTO `students` (`st_id`, `st_name`, `st_lastname`, `st_datebirth`) VALUES
(1, 'Brian', 'Traba', '1990-05-07'),
(2, 'Leonel', 'Vallejos', '1990-06-02'),
(3, 'Daniel', 'Tapia', '1989-03-07'),
(4, 'Agustín', 'Vasquez', '1988-08-02'),
(5, 'Ignacio', 'Ullua ', '1990-01-01'),
(6, 'Santiago', 'Storn', '1990-01-02'),
(7, 'Alexia', 'Hurstel', '1990-01-03'),
(8, 'Camila', 'Sander', '1990-01-04'),
(9, 'Magalí', 'Julian', '1990-01-05'),
(10, 'Alexia', 'Lulko', '1990-01-06'),
(11, 'Marco', 'Sandroni', '1990-01-07'),
(12, 'Juan Cruz', 'Velazquez', '1990-01-08'),
(13, 'Leonardo', 'Sanchez', '1990-01-09'),
(14, 'Diego', 'Hernandez', '1990-01-10'),
(15, 'Alejo ', 'Martinez', '1990-01-11'),
(16, 'Candela', 'Novoa', '1990-01-12'),
(17, 'Daiana', 'Bardot', '1990-01-13'),
(18, 'Eliana', 'Reising', '1990-01-14'),
(19, 'Nicolás', 'Contreras', '1990-01-15'),
(20, 'Marianela', 'Ugarte', '1990-01-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `students_curses`
--

CREATE TABLE IF NOT EXISTS `students_curses` (
  `stc_id` int(4) NOT NULL,
  `stc_student` int(4) NOT NULL,
  `stc_course` int(4) NOT NULL,
  `stc_pnote1` int(3) NOT NULL,
  `stc_pnote2` int(3) NOT NULL,
  `stc_pnote3` int(3) NOT NULL,
  `stc_fnote` int(3) NOT NULL,
  `stc_year` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `students_curses`
--

INSERT INTO `students_curses` (`stc_id`, `stc_student`, `stc_course`, `stc_pnote1`, `stc_pnote2`, `stc_pnote3`, `stc_fnote`, `stc_year`) VALUES
(1, 1, 1, 60, 65, 80, 64, 2015),
(2, 2, 1, 50, 60, 70, 70, 2015),
(3, 3, 1, 30, 50, 90, 70, 2015),
(4, 4, 1, 90, 80, 60, 70, 2015),
(5, 5, 1, 55, 60, 60, 65, 2015),
(6, 6, 1, 70, 30, 60, 75, 2015),
(7, 7, 1, 55, 40, 60, 60, 2015),
(8, 8, 1, 60, 90, 60, 80, 2015),
(9, 9, 1, 95, 80, 50, 90, 2015),
(10, 10, 1, 100, 30, 40, 80, 2015),
(11, 11, 1, 80, 30, 10, 30, 2015),
(12, 12, 1, 65, 40, 10, 25, 2015),
(13, 13, 1, 15, 50, 70, 59, 2015),
(14, 14, 1, 20, 50, 75, 50, 2015),
(15, 15, 1, 70, 40, 10, 50, 2015),
(16, 16, 1, 76, 90, 45, 82, 2015),
(17, 17, 1, 72, 50, 65, 73, 2015),
(18, 18, 1, 33, 40, 60, 38, 2015),
(19, 19, 1, 44, 90, 60, 55, 2015),
(20, 20, 1, 55, 70, 60, 65, 2015),
(21, 1, 2, 10, 90, 70, 72, 2015),
(22, 2, 2, 20, 60, 80, 70, 2015),
(23, 3, 2, 33, 50, 60, 55, 2015),
(24, 4, 2, 96, 40, 20, 42, 2015),
(25, 5, 2, 45, 90, 20, 56, 2015),
(26, 6, 2, 53, 80, 10, 66, 2015),
(27, 7, 2, 75, 80, 30, 69, 2015),
(28, 8, 2, 55, 68, 90, 88, 2015),
(29, 9, 2, 20, 88, 50, 58, 2015),
(30, 10, 2, 30, 99, 67, 70, 2015),
(31, 11, 2, 20, 85, 60, 34, 2015),
(32, 12, 2, 33, 42, 78, 99, 2015),
(33, 13, 2, 30, 100, 100, 100, 2015),
(34, 14, 2, 80, 77, 15, 52, 2015),
(35, 15, 2, 60, 76, 72, 58, 2015),
(36, 16, 2, 33, 45, 40, 44, 2015),
(37, 17, 2, 90, 78, 85, 50, 2015),
(38, 18, 2, 20, 19, 70, 42, 2015),
(39, 19, 2, 80, 55, 77, 86, 2015),
(40, 20, 2, 72, 87, 77, 22, 2015),
(41, 1, 3, 70, 60, 65, 67, 2015),
(42, 2, 3, 80, 80, 90, 84, 2015),
(43, 3, 3, 80, 69, 71, 55, 2015),
(44, 4, 3, 66, 78, 57, 70, 2015),
(45, 5, 3, 60, 70, 16, 50, 2015),
(46, 6, 3, 30, 86, 70, 70, 2015),
(47, 7, 3, 30, 67, 72, 70, 2015),
(48, 8, 3, 90, 75, 82, 81, 2015),
(49, 9, 3, 20, 72, 64, 82, 2015),
(50, 10, 3, 56, 63, 55, 78, 2015),
(51, 11, 3, 10, 76, 75, 81, 2015),
(52, 12, 3, 54, 76, 87, 98, 2015),
(53, 13, 3, 30, 70, 65, 81, 2015),
(54, 14, 3, 100, 95, 98, 83, 2015),
(55, 15, 3, 90, 100, 93, 84, 2015),
(56, 16, 3, 90, 90, 77, 86, 2015),
(57, 17, 3, 80, 77, 68, 80, 2015),
(58, 18, 3, 67, 59, 79, 58, 2015),
(59, 19, 3, 100, 89, 72, 78, 2015),
(60, 20, 3, 90, 98, 87, 66, 2015),
(61, 1, 4, 30, 24, 67, 59, 2015),
(62, 2, 4, 100, 100, 100, 100, 2015),
(63, 3, 4, 90, 50, 82, 75, 2015),
(64, 4, 4, 70, 72, 76, 70, 2015),
(65, 5, 4, 77, 80, 74, 73, 2015),
(66, 6, 4, 80, 12, 50, 77, 2015),
(67, 7, 4, 100, 88, 90, 85, 2015),
(68, 8, 4, 80, 90, 99, 91, 2015),
(69, 9, 4, 45, 50, 37, 56, 2015),
(70, 10, 4, 60, 70, 73, 67, 2015),
(71, 11, 4, 98, 100, 89, 80, 2015),
(72, 12, 4, 90, 60, 77, 81, 2015),
(73, 13, 4, 98, 87, 70, 78, 2015),
(74, 14, 4, 90, 91, 78, 72, 2015),
(75, 15, 4, 74, 69, 72, 68, 2015),
(76, 16, 4, 80, 83, 79, 81, 2015),
(77, 17, 4, 45, 48, 67, 65, 2015),
(78, 18, 4, 80, 76, 66, 70, 2015),
(79, 19, 4, 99, 80, 77, 81, 2015),
(80, 20, 4, 70, 55, 34, 68, 2015),
(81, 1, 5, 50, 53, 67, 73, 2015),
(82, 2, 5, 70, 67, 92, 66, 2015),
(83, 3, 5, 50, 53, 45, 30, 2015),
(84, 4, 5, 20, 33, 87, 71, 2015),
(85, 5, 5, 28, 61, 71, 57, 2015),
(86, 6, 5, 11, 67, 44, 43, 2015),
(87, 7, 5, 90, 56, 78, 64, 2015),
(88, 8, 5, 33, 48, 70, 56, 2015),
(89, 9, 5, 60, 56, 41, 71, 2015),
(90, 10, 5, 55, 62, 71, 60, 2015),
(91, 11, 5, 49, 87, 49, 61, 2015),
(92, 12, 5, 25, 29, 54, 43, 2015),
(93, 13, 5, 53, 59, 45, 48, 2015),
(94, 14, 5, 70, 71, 70, 69, 2015),
(95, 15, 5, 58, 70, 77, 71, 2015),
(96, 16, 5, 76, 67, 78, 70, 2015),
(97, 17, 5, 68, 65, 80, 81, 2015),
(98, 18, 5, 77, 63, 90, 72, 2015),
(99, 19, 5, 44, 51, 78, 60, 2015),
(100, 20, 5, 68, 72, 70, 70, 2015);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teachers`
--

CREATE TABLE IF NOT EXISTS `teachers` (
`te_id` int(4) NOT NULL,
  `te_name` varchar(20) NOT NULL,
  `te_lastname` varchar(20) NOT NULL,
  `te_datebirth` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `teachers`
--

INSERT INTO `teachers` (`te_id`, `te_name`, `te_lastname`, `te_datebirth`) VALUES
(1, 'Suzanne', 'Morgan', '1975-04-09'),
(2, 'Robin', 'Leroy', '1978-03-05'),
(3, 'Ronald', 'Calvin', '1969-06-12');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `courses`
--
ALTER TABLE `courses`
 ADD PRIMARY KEY (`co_id`), ADD KEY `co_schedule_time` (`co_schedule_time`), ADD KEY `co_teacher` (`co_teacher`);

--
-- Indices de la tabla `schedules`
--
ALTER TABLE `schedules`
 ADD PRIMARY KEY (`sc_id`);

--
-- Indices de la tabla `students`
--
ALTER TABLE `students`
 ADD PRIMARY KEY (`st_id`);

--
-- Indices de la tabla `students_curses`
--
ALTER TABLE `students_curses`
 ADD PRIMARY KEY (`stc_id`), ADD KEY `stc_student` (`stc_student`,`stc_course`), ADD KEY `stc_course` (`stc_course`);

--
-- Indices de la tabla `teachers`
--
ALTER TABLE `teachers`
 ADD PRIMARY KEY (`te_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `courses`
--
ALTER TABLE `courses`
MODIFY `co_id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `schedules`
--
ALTER TABLE `schedules`
MODIFY `sc_id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `students`
--
ALTER TABLE `students`
MODIFY `st_id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT de la tabla `teachers`
--
ALTER TABLE `teachers`
MODIFY `te_id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `courses`
--
ALTER TABLE `courses`
ADD CONSTRAINT `co-sc` FOREIGN KEY (`co_schedule_time`) REFERENCES `schedules` (`sc_id`),
ADD CONSTRAINT `co-te` FOREIGN KEY (`co_teacher`) REFERENCES `teachers` (`te_id`);

--
-- Filtros para la tabla `students_curses`
--
ALTER TABLE `students_curses`
ADD CONSTRAINT `students_curses_ibfk_1` FOREIGN KEY (`stc_course`) REFERENCES `courses` (`co_id`),
ADD CONSTRAINT `students_curses_ibfk_2` FOREIGN KEY (`stc_student`) REFERENCES `students` (`st_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
