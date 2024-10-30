-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2024 a las 08:12:32
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peluqueria_canina`
--
CREATE DATABASE IF NOT EXISTS `peluqueria_canina` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `peluqueria_canina`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `duenio`
--

CREATE TABLE `duenio` (
  `IDDUENIO` int(11) NOT NULL,
  `CELULAR` varchar(255) DEFAULT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `duenio`
--

INSERT INTO `duenio` (`IDDUENIO`, `CELULAR`, `DIRECCION`, `NOMBRE`) VALUES
(1, '2622606966', 'Urquiza e Ibañez S/N C2', 'Rodolfo Petelin'),
(2, '2664757176', 'Pasaje Avellaneda 423 P5 D38', 'Aimé Gabelli'),
(3, '2622832705', 'Sergio Cejas 728', 'Laurinda Villavicencio'),
(7, '2622571767', 'Urquiza e Ibañez D2 S/N', 'Nerina Palacio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `IDCLIENTE` int(11) NOT NULL,
  `ALERGICO` varchar(255) DEFAULT NULL,
  `ATENCIONESPECIAL` varchar(255) DEFAULT NULL,
  `COLOR` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `OBSERVACIONES` varchar(255) DEFAULT NULL,
  `RAZA` varchar(255) DEFAULT NULL,
  `DUENIO_IDDUENIO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`IDCLIENTE`, `ALERGICO`, `ATENCIONESPECIAL`, `COLOR`, `NOMBRE`, `OBSERVACIONES`, `RAZA`, `DUENIO_IDDUENIO`) VALUES
(1, 'No', 'No', 'Blanco, negro y naranja', 'Homero', 'Ninguna.', 'Fox Terrier', 1),
(2, 'No', 'Si', 'Blanco', 'Katy', 'Tiene sensible las encías.', 'Caniche', 2),
(3, 'No', 'No', 'Naranja', 'Yago', 'Suele ponerse agresivo.', 'Mestizo', 3),
(7, 'No', 'Si', 'Negro', 'Procer', 'Ninguna.', 'Labrador', 7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `duenio`
--
ALTER TABLE `duenio`
  ADD PRIMARY KEY (`IDDUENIO`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`IDCLIENTE`),
  ADD KEY `FK_MASCOTA_DUENIO_IDDUENIO` (`DUENIO_IDDUENIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `duenio`
--
ALTER TABLE `duenio`
  MODIFY `IDDUENIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `IDCLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `FK_MASCOTA_DUENIO_IDDUENIO` FOREIGN KEY (`DUENIO_IDDUENIO`) REFERENCES `duenio` (`IDDUENIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
