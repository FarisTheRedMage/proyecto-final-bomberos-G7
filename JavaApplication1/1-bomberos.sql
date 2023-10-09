-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2023 at 12:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `1-bomberos`
--

-- --------------------------------------------------------

--
-- Table structure for table `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `grupo_sanguineo` varchar(4) NOT NULL,
  `id_brigada` int(11) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `nombre`, `apellido`, `dni`, `fecha_nacimiento`, `grupo_sanguineo`, `id_brigada`, `celular`, `estado`) VALUES
(1, 'Rigoberto', 'Chocolatoso', '12345678', '1990-05-15', 'A+', 2, '12321313', 1),
(2, 'Carlos', 'Jose Rivera', '78231231', '1995-03-10', '0 -', 2, '31234213', 1),
(3, 'Juan', 'Castro', '1111', '1996-05-13', 'A+', 2, '23112412', 1),
(6, 'Walter', 'Heredia', '98765432', '1990-05-15', 'A+', 2, '22223333', 1),
(7, 'Mario', 'Marquez', '1231111', '1990-05-15', 'A - ', 2, '2231231231', 1),
(8, 'Ruben', 'Ruperto', '009900', '1990-05-15', 'A - ', 2, '2231231231', 1),
(9, 'Maria', 'Del Valle', '0000', '1990-05-15', 'A - ', 2, '2231231231', 1),
(10, 'Sonia', 'Fernandez', '23212321', '1990-05-15', '0 - ', 2, '223131223', 1);

-- --------------------------------------------------------

--
-- Table structure for table `brigada`
--

CREATE TABLE `brigada` (
  `id_brigada` int(11) NOT NULL,
  `nombre_brigada` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `id_cuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brigada`
--

INSERT INTO `brigada` (`id_brigada`, `nombre_brigada`, `especialidad`, `estado`, `id_cuartel`) VALUES
(2, 'Brigada de Rescate', 'Rescate de Montaña', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cuartel`
--

CREATE TABLE `cuartel` (
  `id_cuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cuartel`
--

INSERT INTO `cuartel` (`id_cuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel Central', '123 Calle Principal', 46, -78, '1234567890', 'cuartelcentral02@gmail.com', 1),
(2, 'Cuartel General', 'Santa Cecilia ST ', 12, 14, '1234532', 'cuartelgeneral123@gmail.com', 1),
(3, 'Cuartel Zona Este', 'Santa Clara ST', 10, 52, '7773662', 'cuartelzonaeste12@gmail.com', 0),
(4, 'Cuartel: Los Bomberi', 'Goove ST', 11, 31, '2221111222', 'groovesthome@gmail.com', 1);

-- --------------------------------------------------------

--
-- Table structure for table `siniestro`
--

CREATE TABLE `siniestro` (
  `id_siniestro` int(11) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `detalles` text NOT NULL,
  `id_brigada` int(11) NOT NULL,
  `fecha_resolucion` date DEFAULT NULL,
  `calificacion` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `siniestro`
--

INSERT INTO `siniestro` (`id_siniestro`, `coord_X`, `coord_Y`, `fecha_siniestro`, `tipo`, `detalles`, `id_brigada`, `fecha_resolucion`, `calificacion`, `estado`) VALUES
(1, 123, 112, '2023-10-09', 'Incendio', 'Incendio en un edificio residencial.', 2, NULL, 0, 1),
(2, 123, 112, '2023-10-09', 'Incendio', 'Incendio en un edificio residencial.', 2, '2023-10-15', 6, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codigo_brigada` (`id_brigada`);

--
-- Indexes for table `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`id_brigada`),
  ADD KEY `numero_cuartel` (`id_cuartel`);

--
-- Indexes for table `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`id_cuartel`);

--
-- Indexes for table `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`id_siniestro`),
  ADD KEY `codigo_brigada` (`id_brigada`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `brigada`
--
ALTER TABLE `brigada`
  MODIFY `id_brigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `id_cuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `id_siniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`id_brigada`) REFERENCES `brigada` (`id_brigada`);

--
-- Constraints for table `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`id_cuartel`) REFERENCES `cuartel` (`id_cuartel`);

--
-- Constraints for table `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`id_brigada`) REFERENCES `brigada` (`id_brigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
