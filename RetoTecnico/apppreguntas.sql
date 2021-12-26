-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2021 at 04:05 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apppreguntas`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorias`
--

CREATE TABLE `categorias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `dificultad` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorias`
--

INSERT INTO `categorias` (`id`, `nombre`, `dificultad`) VALUES
(1, 'Geografía', 1),
(2, 'Historia', 1),
(3, 'Ciencia', 2),
(4, 'Deporte', 2),
(5, 'Arte', 3);

-- --------------------------------------------------------

--
-- Table structure for table `preguntas`
--

CREATE TABLE `preguntas` (
  `id` int(11) NOT NULL,
  `idCategoria` int(11) DEFAULT NULL,
  `pregunta` varchar(255) DEFAULT NULL,
  `respuesta` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `preguntas`
--

INSERT INTO `preguntas` (`id`, `idCategoria`, `pregunta`, `respuesta`) VALUES
(1, 2, '¿Cuál fue el primer país en aprobar el sufragio femenino?', 'Nueva Zelanda.'),
(2, 2, '¿En qué año llegó el hombre a la Luna?', 'En el año 1969.'),
(3, 2, '¿Qué importante batalla tuvo lugar en 1815?', 'La batalla de Waterloo.'),
(4, 2, '¿Cuál era la ciudad hogar de Marco Polo?', 'Venecia.'),
(5, 2, '¿En qué año tuvo lugar el genocidio de Ruanda?', 'Ocurrió en el año 1994.'),
(6, 1, '¿Cuál es la capital de Filipinas?', 'Manila.'),
(7, 1, '¿Cuál es el río más caudaloso del mundo?', 'El Amazonas.'),
(8, 1, '¿Qué país está entre Perú y Colombia?', 'Ecuador.'),
(9, 1, '¿En qué país se encuentra el río Po?', 'Italia.'),
(10, 1, '¿Cuál es la montaña más alta de Europa?', 'El Monte Elbrús.'),
(11, 5, '¿Quién pintó el “Guernica”?', 'Pablo Picasso.'),
(12, 5, '¿Quién escribió “La Guerra de los Mundos”?', 'H.G. Wells.'),
(13, 5, '¿Qué italiano puso música al Othelo de Shakespeare?', 'Verdi.'),
(14, 5, '¿Con qué nombre firmaba Van Gogh sus obras?', 'Vincent.'),
(15, 5, '¿Qué tipo de instrumento es una cítara?', 'De cuerda.'),
(17, 3, '¿En qué lado del cuerpo está el hígado?', 'En el derecho.'),
(18, 3, '¿Qué número viene después del 14 en los decimales del Pi?', 'El 1.'),
(19, 3, '¿Cuántos elementos tiene la tabla periódica?', 'Tiene un total de 118.'),
(20, 3, '¿Qué gas de la atmósfera nos protege de la radiación ultravioleta?', 'El ozono.'),
(21, 4, '¿Quién fue la primera mujer en ganar una medalla olímpica en el año 1900?', 'Charlotte Cooper.'),
(22, 4, '¿Cómo se llaman los deportistas que practican Judo?', 'Judokas.'),
(23, 4, '¿Cuáles son los colores de los cinco anillos olímpicos?', 'Amarillo, azul, negro, rojo y verde.'),
(24, 4, '¿En qué deporte destacó Carl Lewis?', 'Atletismo.'),
(25, 4, '¿Dónde se inventó el Ping-Pong?', 'Inglaterra.'),
(26, 3, '¿En qué mes el Sol está más cerca de la Tierra?', 'Diciembre.');

-- --------------------------------------------------------

--
-- Table structure for table `respuestas`
--

CREATE TABLE `respuestas` (
  `id` int(11) NOT NULL,
  `idPregunta` int(11) DEFAULT NULL,
  `respuesta` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `respuestas`
--

INSERT INTO `respuestas` (`id`, `idPregunta`, `respuesta`) VALUES
(1, 1, 'Nueva Zelanda.'),
(2, 1, 'Japón'),
(3, 1, 'Brasil'),
(4, 1, 'China'),
(5, 2, 'En el año 1969.'),
(6, 2, 'En el año 1960.'),
(7, 2, 'En el año 1975.'),
(8, 2, 'En el año 1980.'),
(9, 3, 'La batalla de Waterloo.'),
(10, 3, 'La guerra fria.'),
(11, 3, 'La guerra de Vietnam.'),
(12, 3, 'La batalla de Berlín.'),
(13, 4, 'Venecia.'),
(14, 4, 'París.'),
(15, 4, 'Milán.'),
(16, 4, 'Trevisio.'),
(17, 5, 'Ocurrió en el año 1994.'),
(18, 5, 'Ocurrió en el año 1998.'),
(19, 5, 'Ocurrió en el año 1980.'),
(20, 5, 'Ocurrió en el año 1974.'),
(21, 6, 'Manila.'),
(22, 6, 'Iloilo.'),
(23, 6, 'Ángeles.'),
(24, 6, 'Las Piñas.'),
(25, 7, 'El Amazonas.'),
(51, 7, 'El Nilo.'),
(52, 7, 'El Yangtze River.'),
(53, 7, 'El Misisipi.'),
(54, 8, 'Ecuador.'),
(55, 8, 'Basil.'),
(56, 8, 'Bolivia.'),
(57, 8, 'Venezuela.'),
(58, 9, 'Italia.'),
(59, 9, 'Uruguay.'),
(60, 9, 'Francia.'),
(61, 9, 'Japón.'),
(62, 10, 'El Monte Elbrús.'),
(63, 10, 'Los Aplpes.'),
(64, 10, 'El Mont Blanc.'),
(65, 10, 'El Cervino.'),
(66, 11, 'Pablo Picasso.'),
(67, 11, 'Vicent van Gogh.'),
(68, 11, 'Leonardo da Vinci.'),
(69, 11, 'Rembrandt.'),
(70, 12, 'H.G. Wells.'),
(71, 12, 'William Shakespeare.'),
(72, 12, 'Franz Kafka.'),
(73, 12, 'Jane Austen.'),
(74, 13, 'Verdi.'),
(75, 13, 'Lázaro de Goiti.'),
(201, 13, 'Schröder.'),
(202, 13, 'Otto.'),
(203, 14, 'Vincent.'),
(204, 14, 'Gogh Vicent.'),
(205, 14, 'Gogh.'),
(206, 14, 'Palafox.'),
(207, 15, 'De cuerda.'),
(208, 15, 'De teclas.'),
(209, 15, 'De aire.'),
(210, 15, 'De percusión.'),
(211, 26, 'Diciembre.'),
(212, 26, 'Enero.'),
(213, 26, 'Junio.'),
(214, 26, 'Marzo.'),
(215, 17, 'En el derecho.'),
(216, 17, 'En el izquierdo.'),
(217, 17, 'En el superior derecho.'),
(218, 17, 'En el inferior izquierdo.'),
(219, 18, 'El 1.'),
(220, 18, 'El 2.'),
(221, 18, 'El 6.'),
(222, 18, 'El 0.'),
(223, 19, 'Tiene un total de 118.'),
(224, 19, 'Tiene un total de 120.'),
(225, 19, 'Tiene un total de 95.'),
(226, 19, 'Tiene un total de 175.'),
(227, 20, 'El ozono.'),
(228, 20, 'El agrón.'),
(229, 20, 'El dióxido de carbono.'),
(230, 20, 'El oxígeno.'),
(231, 21, 'Charlotte Cooper.'),
(232, 21, 'Hadia Hosny.'),
(233, 21, 'Anna Kiesenhofer.'),
(234, 21, 'Nadine Apetz.'),
(235, 22, 'Judokas.'),
(236, 22, 'Luchadores de judo.'),
(237, 22, 'Boxeadores.'),
(238, 22, 'Ninjas.'),
(239, 23, 'Amarillo, azul, negro, rojo y verde.'),
(240, 23, 'Violeta, azul, negro, rojo y verde.'),
(241, 23, 'Amarillo, verde, negro, rojo y verde.'),
(242, 23, 'Amarillo, naranja, negro, rosa y verde.'),
(243, 24, 'Atletismo.'),
(244, 24, 'BMX.'),
(245, 24, 'Remo'),
(246, 24, 'Triatlon.'),
(247, 25, 'Inglaterra.'),
(248, 25, 'Australia.'),
(249, 25, 'China.'),
(250, 25, 'Estados Unidos.');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `puntos` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indexes for table `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `pregunta` (`pregunta`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indexes for table `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `index_idPregunta` (`idPregunta`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre` (`nickname`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=264;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `preguntas_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`id`);

--
-- Constraints for table `respuestas`
--
ALTER TABLE `respuestas`
  ADD CONSTRAINT `respuestas_ibfk_1` FOREIGN KEY (`idPregunta`) REFERENCES `preguntas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
