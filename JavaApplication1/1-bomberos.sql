-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2023 a las 01:00:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `1-bomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` int(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `grupo_sanguineo` varchar(4) NOT NULL,
  `id_brigada` int(11) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `nombre_clave` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `nombre`, `apellido`, `dni`, `fecha_nacimiento`, `grupo_sanguineo`, `id_brigada`, `celular`, `estado`, `nombre_clave`) VALUES
(1, 'Rigoberto', 'Chocolatoso', 12345678, '1990-05-15', 'A+', 2, '12321313', 1, 'Gama'),
(2, 'Carla', 'Josefina Rivera', 78231231, '1995-03-10', 'A+', 3, '31234213', 1, 'Beta'),
(3, 'Juan Santo', 'Domingo', 1111, '1996-05-13', 'A+', 2, '23112412', 1, 'Omega'),
(6, 'Walter', 'Heredia', 98765432, '1990-05-15', 'A+', 2, '22223333', 1, 'Alfa'),
(7, 'Maria', 'Marquez', 1231111, '1990-05-15', 'A+', 3, '2231231231', 1, 'Zetta'),
(20, 'asdasdasd', 'aaadasdasd', 123123, '1996-07-04', 'AB-', 3, '123-123123-123', 1, 'Gama'),
(21, 'AAAAAA', 'AAAAAAAAAA', 123, '2023-10-25', 'B+', 4, '12312312-123123', 1, 'Omega');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `id_brigada` int(11) NOT NULL,
  `nombre_brigada` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `id_cuartel` int(11) NOT NULL,
  `disponibilidad` tinyint(1) NOT NULL,
  `nombre_cuartel` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`id_brigada`, `nombre_brigada`, `especialidad`, `estado`, `id_cuartel`, `disponibilidad`, `nombre_cuartel`) VALUES
(2, 'Brigada de Rescate', 'Rescate de Montaña', 1, 1, 0, 'Cuartel Central'),
(3, 'Brigada A', 'Prevencion', 1, 5, 1, 'Lo Mejore´'),
(4, 'Los Salvavidas', 'Inundación', 1, 4, 0, 'Cuartel: Los Bomberi'),
(5, 'Brigada Suroeste', 'Rescate de Montaña', 1, 2, 1, 'Central Suroeste'),
(6, 'Brigada Central Sur', 'Inundacion', 1, 2, 1, 'Central Sur'),
(7, 'Brigada Noreste', 'Inundacion', 1, 6, 1, 'Cuartel Noreste'),
(8, 'Brigada Noroeste', 'Incendio', 1, 3, 1, 'Cuartel Noroeste'),
(9, 'Brigada Sureste', 'Incendio', 1, 3, 1, 'Cuartel Sureste');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `id_cuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` double NOT NULL,
  `coord_Y` double NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`id_cuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel Central', '123 Calle Principal', 46, 78, '0800-333-1212', 'cuartelcentral02@gmail.com', 1),
(2, '123', 'Santa Cecilia ST ', 13.43, 15.34, '131312312', 'cuartelgeneral123@gmail.com', 1),
(3, 'Cuartel Zona Este', 'Santa Clara ST', 10, 52, '7773662', 'cuartelzonaeste12@gmail.com', 1),
(4, 'Cuartel: Los Bomberi', 'Goove ST', 11, 31, '2221111222', 'groovesthome@gmail.com', 1),
(5, 'Lo Mejore´', 'calle 40 ', 67, 32, '111', 'salvadores de gatitos', 1),
(6, 'qqq', 'qqq', 12, 11, '111', 'sfadfs', 1),
(7, 'LosDelOeste', 'oeste 32', 12, 32, '12341234', 'fjshfkjsad@sfsdfj.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `id_siniestro` int(11) NOT NULL,
  `coord_X` double NOT NULL,
  `coord_Y` double NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `detalles` text NOT NULL,
  `id_brigada` int(11) DEFAULT NULL,
  `fecha_resolucion` date DEFAULT NULL,
  `calificacion` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`id_siniestro`, `coord_X`, `coord_Y`, `fecha_siniestro`, `tipo`, `detalles`, `id_brigada`, `fecha_resolucion`, `calificacion`, `estado`) VALUES
(2, 22.54, 22.1, '2023-10-20', 'Rescate en Montaña', 'Derrumbe de montañas', 2, '2023-10-24', 5, 0),
(3, 23.31, 12.123, '2023-10-19', 'Inundacion', 'inundacion de departamentos', NULL, NULL, NULL, 1),
(4, 43.34, 45.66, '2023-10-17', 'Incendio', 'bosque prendido fuego', NULL, NULL, NULL, 1),
(5, 22.532, 54.14, '2023-10-20', 'Rescate de Montaña', 'Derrumbe de montañas', NULL, NULL, NULL, 0),
(6, 22.532, 54.14, '2023-10-20', 'Inundacion', 'Inundcion de un Rio cercano', NULL, NULL, NULL, 0),
(7, 22.532, 54.14, '2023-10-20', 'Incendio', 'Derrumbe de montañas', NULL, NULL, NULL, 0),
(8, 22.532, 54.14, '2023-10-20', 'Prevencion', 'Derrumbe de montañas', NULL, NULL, NULL, 0),
(9, 22.532, 54.14, '2023-10-20', 'Prevencion', 'Derrumbe de montañas', NULL, NULL, NULL, 0),
(10, 22.532, 54.14, '2023-10-20', 'Rescate de Montaña', 'Derrumbe de montañas', NULL, NULL, NULL, 0),
(11, 123, 123, '2023-10-24', 'Rescate en Montaña', 'accidente', 5, '2023-10-24', 5, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codigo_brigada` (`id_brigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`id_brigada`),
  ADD KEY `numero_cuartel` (`id_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`id_cuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`id_siniestro`),
  ADD KEY `codigo_brigada` (`id_brigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `id_brigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `id_cuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `id_siniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`id_brigada`) REFERENCES `brigada` (`id_brigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`id_cuartel`) REFERENCES `cuartel` (`id_cuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`id_brigada`) REFERENCES `brigada` (`id_brigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
