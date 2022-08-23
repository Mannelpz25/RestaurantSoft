-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-09-2020 a las 05:14:47
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurant_soft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `codigo` int(4) NOT NULL,
  `articulo` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `sucursal` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `idTipoInsumo` int(4) NOT NULL,
  `existencia` int(4) NOT NULL,
  `marca` varchar(60) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`codigo`, `articulo`, `sucursal`, `idTipoInsumo`, `existencia`, `marca`) VALUES
(1, 'Catsup', 'Condesa', 1, 15, 'McCormick'),
(2, 'Crema', 'Condesa', 1, 12, 'McCormick'),
(3, 'Mayonesa', 'Roma', 1, 25, 'McCormick'),
(4, 'Coca', 'Condesa', 2, 9, 'Coca cola'),
(5, 'Agua', 'Condesa', 2, 3, 'Ciel');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `numeroEmpleado` int(4) NOT NULL,
  `nombre` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `fechaNacimiento` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `curp` varchar(18) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(13) COLLATE utf8_spanish_ci NOT NULL,
  `sueldo` int(11) NOT NULL,
  `puesto` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `sucursal` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `fechaIngreso` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `sueldoNeto` int(11) DEFAULT NULL,
  `descuentos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`numeroEmpleado`, `nombre`, `apellidos`, `fechaNacimiento`, `curp`, `rfc`, `sueldo`, `puesto`, `sucursal`, `fechaIngreso`, `sueldoNeto`, `descuentos`) VALUES
(1, 'FRANCISCO', 'LOPEZ', '11/11/1995', 'LOGF95111HJCPRR06', 'LOGF951111M32', 6080, 'ADMINISTRATIVO', 'Roma', '07/09/2018', NULL, NULL),
(2, 'ANYA', 'VILLAGOMEZ', '26/05/2001', 'VINA012605MJCLVN01', 'VINA012605', 18000, 'JEFE DE AREA', 'Insurgentes', '14/02/2019', NULL, NULL),
(3, 'JUAN', 'RODRIGUEZ', '04/05/1980', 'ROAJ800405HJCRSA55', 'ROAJ800405', 5000, 'MESERO', 'Insurgentes', '15/01/2019', NULL, NULL),
(4, 'PEDRO', 'PEREZ', '14/06/1980', 'PEPE800614JSKAKS02', 'PEPE800614', 5000, 'MESERO', 'Insurgentes', '15/08/2019', NULL, NULL),
(5, 'ANA', 'BECERRA', '14/06/1985', 'BEAN850614JSSASS01', 'BEAN850614', 8000, 'COCINERO', 'Centro', '19/07/2017', NULL, NULL),
(6, 'MONSERRAT', 'NAVARRO', '05/11/1997', 'MONA971105MJCPRR01', 'MONA971105', 8000, 'MESERO', 'ROMA', '11/11/2019', NULL, NULL),
(7, 'GUILLERMO', 'CALDERON', '05/11/1997', 'GUCA971105HJCFGG05', 'GUCA971105', 11000, 'ADMINISTRATIVO', 'Centro', '28/02/2019', NULL, NULL),
(8, 'MARTIN', 'HARO', '05/11/1997', 'MAHA971105HJCMRR08', 'MAHA971105', 8000, 'MESERO', 'Roma', '15/04/2017', NULL, NULL),
(9, 'HUGO', 'GOMEZ', '05/12/1999', 'HUGO991205HJCBFF08', 'HUGO991205', 12000, 'COCINERO', 'Condesa', '11/12/2018', NULL, NULL),
(10, 'FELIPE', 'NAVARRO', '08/07/1987', 'FENA870708HJCRRR02', 'FENA870708', 8000, 'MESERO', 'Condesa', '11/08/2019', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoinsumo`
--

CREATE TABLE `tipoinsumo` (
  `idTipoInsumo` int(4) NOT NULL,
  `insumo` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `unidadMedida` varchar(40) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipoinsumo`
--

INSERT INTO `tipoinsumo` (`idTipoInsumo`, `insumo`, `unidadMedida`) VALUES
(1, 'Condimentos', 'Gramos'),
(2, 'Bebidas', 'Litros'),
(3, 'Abarrotes', 'Varios'),
(4, 'Higiene', 'Varios'),
(5, 'Otros', 'Varios');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`numeroEmpleado`);

--
-- Indices de la tabla `tipoinsumo`
--
ALTER TABLE `tipoinsumo`
  ADD PRIMARY KEY (`idTipoInsumo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD CONSTRAINT `articulo_ibfk_1` FOREIGN KEY (`idTipoInsumo`) REFERENCES `tipoinsumo` (`idTipoInsumo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
