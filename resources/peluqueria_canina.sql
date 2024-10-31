-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2024 a las 22:43:28
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
(1, '2665835120', 'Mitre 834', 'Pedro Perez'),
(2, '2665235629', 'Potosí 364', 'Aimé Gabelli'),
(3, '2622653295', 'Urquiza e Ibañez C2 S/N', 'Lautaro Petelin'),
(4, '2264788642', 'Lafinur 250', 'Lucas Zen'),
(5, '2622069666', 'Sergio Cejas 728', 'Rodolfo Petelin'),
(6, '2622122365', '25 de Mayo 860', 'Rocio Belén'),
(7, '2622057416', '25 de Mayo 860', 'Nerina Palacio');

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
  `IDDUENO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`IDCLIENTE`, `ALERGICO`, `ATENCIONESPECIAL`, `COLOR`, `NOMBRE`, `OBSERVACIONES`, `RAZA`, `IDDUENO`) VALUES
(1, 'No', 'No', 'Negro y naranja', 'Bobi', 'Tiene ser agresivo.', 'Rottweiler', 1),
(2, 'No', 'No', 'Marron', 'Yankee', 'Ninguna.', 'Mestizo', 1),
(3, 'No', 'No', 'Negro', 'Popi', 'Ninguna.', 'Mestizo', 2),
(4, 'No', 'No', 'Negro', 'Procer', 'Es muy juguetón.', 'Labrador', 3),
(5, 'No', 'Si', 'Blanco', 'Firu', 'Tiene delicados las patas.', 'Caniche', 4),
(6, 'No', 'No', 'Marron claro', 'Rabito', 'Es muy agresivo.', 'Mestizo', 4),
(7, 'No', 'Si', 'Negro', 'Black', 'Es muy miedoso.', 'Labrador', 4),
(8, 'No', 'Si', 'Blanco', 'Katy', 'Tiene sensible las encías.', 'Caniche', 2),
(9, 'No', 'No', 'Blanco con negro', 'Homero', 'Suele escaparse muy rapido.', 'Fox Terrier', 5),
(10, 'No', 'No', 'Dorado', 'Charly', 'Ninguna', 'Mastín Tibetano', 3),
(11, 'No', 'No', 'Negro', 'Roco', 'Es bastante inquieto.', 'Labrador', 6),
(12, 'No', 'No', 'Marron y blanco', 'Diana', 'Es muy viejita.', 'Mestizo', 7);

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
  ADD KEY `FK_MASCOTA_IDDUENO` (`IDDUENO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `duenio`
--
ALTER TABLE `duenio`
  MODIFY `IDDUENIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `IDCLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `FK_MASCOTA_IDDUENO` FOREIGN KEY (`IDDUENO`) REFERENCES `duenio` (`IDDUENIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
