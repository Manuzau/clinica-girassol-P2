-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2024 at 08:41 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicagirassol`
--

-- --------------------------------------------------------

--
-- Table structure for table `consulta`
--

CREATE TABLE `consulta` (
  `id` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `dataConsulta` date NOT NULL,
  `horario` time DEFAULT NULL,
  `medicoId` int(11) DEFAULT NULL,
  `id_especialidade` int(11) DEFAULT NULL,
  `status` enum('EM_ESPERA','ATENDIDO','CANCELADA','REMARCADA') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `consulta`
--

INSERT INTO `consulta` (`id`, `id_paciente`, `dataConsulta`, `horario`, `medicoId`, `id_especialidade`, `status`) VALUES
(1, 5, '2024-07-03', NULL, NULL, 4, 'EM_ESPERA');

-- --------------------------------------------------------

--
-- Table structure for table `consulta_horario`
--

CREATE TABLE `consulta_horario` (
  `id` int(11) NOT NULL,
  `id_consulta` int(11) NOT NULL,
  `id_horario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `consulta_horario`
--

INSERT INTO `consulta_horario` (`id`, `id_consulta`, `id_horario`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Stand-in structure for view `consulta_view`
-- (See below for the actual view)
--
CREATE TABLE `consulta_view` (
`id` int(11)
,`Data marcada` date
,`Medico` varchar(150)
,`Paciente` varchar(150)
,`status` enum('EM_ESPERA','ATENDIDO','CANCELADA','REMARCADA')
,`Especialidade` varchar(150)
,`Hora` time
);

-- --------------------------------------------------------

--
-- Table structure for table `especialidade`
--

CREATE TABLE `especialidade` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `descricao` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `especialidade`
--

INSERT INTO `especialidade` (`id`, `nome`, `descricao`) VALUES
(1, 'primeiraCardiologia', 'Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração'),
(2, 'Pediatria ', 'Tratamento de Criancas'),
(3, 'Oftamologia ', 'Tratamento dos Olhos'),
(4, 'Ortopedria', 'Nao sei'),
(5, 'Angiologia', 'Ocupa do tratamento clínico das doenças que acometem vasos sanguíneos (artérias e veias) e vasos linfáticos, como varizes, aneurismas e obstruções arteriais. Atua em conjunto com a cirurgia vascular.');

-- --------------------------------------------------------

--
-- Table structure for table `factura`
--

CREATE TABLE `factura` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `idConsulta` int(11) NOT NULL,
  `idMedicamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `bi` varchar(14) NOT NULL,
  `telefone` varchar(9) NOT NULL,
  `morada` text NOT NULL,
  `genero` enum('M','F') NOT NULL,
  `data_nascimento` date NOT NULL,
  `cargo` varchar(150) NOT NULL,
  `funcao` enum('Atendente','Medico','Enfermeiro','') NOT NULL,
  `salario` double NOT NULL,
  `data_contrato` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `bi`, `telefone`, `morada`, `genero`, `data_nascimento`, `cargo`, `funcao`, `salario`, `data_contrato`) VALUES
(1, 'Joel Silva', '00232LS3443', '933203433', 'Luanda', 'M', '1989-09-23', 'Gerente Chefe', 'Atendente', 1000000, '2010-06-29'),
(2, 'Miguel Lucas', '00232LS3443', '933203433', 'Malanje', 'M', '2000-09-23', 'Operacional junior', 'Atendente', 1980000, '2020-08-01'),
(3, 'Mariano Carlos', '009433KA343', '933342211', 'Luanda', 'M', '2000-09-23', 'Chefe de Plantao', 'Medico', 2000000, '2020-08-01'),
(4, 'Jojo Marontini', '034DDKS', '93343412', 'Viana', 'F', '1987-10-25', 'Sirurgia chefe', 'Medico', 29300043, '2014-04-28'),
(5, 'Garcia Lucas', '0034jjdfd', '293923', 'Luanda', 'M', '1990-08-22', 'Chefe', 'Medico', 1923883, '2018-12-03'),
(6, 'Karlos Martinho', '8883444', '99340003', 'Kilamba', 'M', '1982-11-09', 'Junior', 'Medico', 92022330, '2018-10-23'),
(7, 'Karlinhos Gomes', '8342', '9230030', 'Kilamba', 'M', '1988-07-22', 'Interno', 'Medico', 829920000, '2010-10-05'),
(8, 'Joao De almeida', '00237LA774898', '933442244', 'Luanda, Angola', 'M', '1982-10-29', 'Chefe de sirurgia', 'Medico', 9110000, '2017-06-29'),
(9, 'Antonia Silvana', '0023KA344388', '990223388', 'Lisboa', 'F', '1982-10-23', 'Sirurgiia chefe', 'Medico', 992388888, '2011-09-27'),
(10, 'Jonas', '00349', '99343', 'Luanda', 'M', '1980-02-05', 'Cheffe', 'Medico', 930004394, '2001-01-20'),
(11, 'Karlinhos', '3949342', '93443322', 'Camama', 'M', '1979-05-10', 'Chefe', 'Medico', 2999932, '2001-02-02'),
(12, 'Kikio Shinomia', '2993LA8434', '932283322', 'Kilamba', 'F', '1995-10-05', 'Adjunta', 'Medico', 9990432, '2017-06-29'),
(13, 'Jorje Garcia', '003298834', '993203288', 'Sao Paulo', 'M', '1980-02-23', 'Auxiliar', 'Medico', 9232312321, '2022-10-05'),
(14, 'Josh', '0223392KA', '922113344', 'Japão', 'M', '1988-09-11', 'Chefe', 'Medico', 198000, '2010-10-02'),
(15, 'Jonas Savios', '0099388823', '922110022', 'Benguela', 'M', '1979-09-12', 'Auxiliar ', 'Medico', 19988222, '2009-11-29'),
(16, 'Carlos Silva', '0027732888', '9223322', 'Luanda', 'M', '1989-03-01', 'Medico Junior', 'Medico', 1920000, '2018-11-03'),
(17, 'Catarino Silva', '002931LA9343', '921332244', 'Luanda', 'M', '1987-05-12', 'Che=fe', 'Medico', 1920000232, '2000-10-23'),
(18, 'Janaina Belo', '002932321KAS', '923388221', 'Kikuxi', 'F', '2000-02-20', 'Chefe de Sirurgia', 'Medico', 99910000, '2024-03-02'),
(19, 'Kaslka', '893492', '983429', 'KLsA', 'M', '2000-10-02', 'jfdkfds', 'Medico', 89343243, '2010-12-03'),
(20, 'dfff', '34243', '324324', 'fdsfds', 'M', '1999-10-22', 'dsfsfsd', 'Medico', 34324324324, '1922-02-11'),
(21, 'gfgfd', '4545', '454354', 'fdgfdg', 'M', '1111-11-11', 'ffgdf', 'Medico', 44333, '1111-11-11'),
(22, 'dffds', '43423', '33432', 'dffds', 'M', '1111-11-11', 'fsdf', 'Medico', 432432, '1111-11-11'),
(23, 'ffdsfds', '3434', '2434', 'erwere', 'M', '1111-11-11', 'fsfsd', 'Medico', 434243, '1111-11-11'),
(24, 'sadsad', '4343', '34243', 'dsadad', 'F', '1111-11-11', 'dfdsf', 'Medico', 34434, '1111-11-11'),
(25, 'gfdgdf', '324234', '43432', 'fdgdfgf3', 'M', '1111-11-11', 'dfsfd', 'Medico', 3423432, '1111-11-11'),
(26, 'Cdsadsd', 'dfs', '343', 'dsdsd', 'F', '1111-11-11', 'dfdsf', 'Medico', 342432, '1111-11-11'),
(27, 'Jose MIngas', '002392932', '992123322', 'Luanda', 'M', '1988-12-09', 'Chefe de sirurgia', 'Medico', 19203232, '2009-09-08');

-- --------------------------------------------------------

--
-- Table structure for table `horario_do_medico`
--

CREATE TABLE `horario_do_medico` (
  `id` int(11) NOT NULL,
  `hora` time NOT NULL DEFAULT current_timestamp(),
  `dia` date NOT NULL DEFAULT current_timestamp(),
  `id_medico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `horario_do_medico`
--

INSERT INTO `horario_do_medico` (`id`, `hora`, `dia`, `id_medico`) VALUES
(1, '10:00:52', '2024-07-03', 2);

-- --------------------------------------------------------

--
-- Table structure for table `medicamento`
--

CREATE TABLE `medicamento` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `dosagem` int(11) NOT NULL,
  `dataFabrico` date NOT NULL,
  `dataExpiracao` date NOT NULL,
  `instrucaoDeUso` varchar(150) NOT NULL,
  `consultaId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `medico`
--

CREATE TABLE `medico` (
  `id` int(11) NOT NULL,
  `numero_ordem` int(11) NOT NULL,
  `especialidade_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `medico`
--

INSERT INTO `medico` (`id`, `numero_ordem`, `especialidade_id`, `funcionario_id`) VALUES
(2, 23, 4, 14),
(4, 34545, 4, 26),
(5, 1005, 2, 27);

-- --------------------------------------------------------

--
-- Stand-in structure for view `medico_view`
-- (See below for the actual view)
--
CREATE TABLE `medico_view` (
`id` int(11)
,`Ordem_id` int(11)
,`Especialidade` varchar(150)
,`nome` varchar(150)
,`bi` varchar(14)
,`genero` enum('M','F')
,`cargo` varchar(150)
,`salario` double
,`morada` text
,`telefone` varchar(9)
,`data_nascimento` date
,`data_contrato` date
,`Dia disponivel` date
,`Hora disponivel` time
);

-- --------------------------------------------------------

--
-- Table structure for table `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `Nome` varchar(150) NOT NULL,
  `bi` varchar(14) NOT NULL,
  `data_nascimento` varchar(70) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `telefone` int(9) NOT NULL,
  `genero` enum('M','F') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `paciente`
--

INSERT INTO `paciente` (`id`, `Nome`, `bi`, `data_nascimento`, `endereco`, `telefone`, `genero`) VALUES
(1, 'Jaime da Cruz', '007643329LA044', '2024-06-01', 'viana', 238348, 'M'),
(2, 'Jaime da Cruz', '007643329LA044', '2024-06-01', 'viana', 238348, 'M'),
(3, 'Mriana Silva', 'Lisbia', '2024-06-19', '00389283', 921332288, 'M'),
(4, 'Joana Silva', 'Talatona', '2024-06-19', '489549898DS', 923823222, 'M'),
(5, 'Antonio Dunda', 'CaUIge', '2002-10-20', '9934888JA', 934832211, 'M'),
(6, 'Joao Lauriel', 'Viana', '2000-10-05', '02392AS3943', 92331102, 'M');

-- --------------------------------------------------------

--
-- Structure for view `consulta_view`
--
DROP TABLE IF EXISTS `consulta_view`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `consulta_view`  AS SELECT `consulta`.`id` AS `id`, `consulta`.`dataConsulta` AS `Data marcada`, `medico_view`.`nome` AS `Medico`, `paciente`.`Nome` AS `Paciente`, `consulta`.`status` AS `status`, `medico_view`.`Especialidade` AS `Especialidade`, `medico_view`.`Hora disponivel` AS `Hora` FROM ((((`consulta` join `medico_view`) join `paciente`) join `consulta_horario`) join `horario_do_medico`) WHERE `consulta`.`id_paciente` = `paciente`.`id` AND `consulta_horario`.`id_horario` = `horario_do_medico`.`id` AND `medico_view`.`id` = `horario_do_medico`.`id_medico` ;

-- --------------------------------------------------------

--
-- Structure for view `medico_view`
--
DROP TABLE IF EXISTS `medico_view`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `medico_view`  AS SELECT `medico`.`id` AS `id`, `medico`.`numero_ordem` AS `Ordem_id`, `especialidade`.`nome` AS `Especialidade`, `funcionario`.`nome` AS `nome`, `funcionario`.`bi` AS `bi`, `funcionario`.`genero` AS `genero`, `funcionario`.`cargo` AS `cargo`, `funcionario`.`salario` AS `salario`, `funcionario`.`morada` AS `morada`, `funcionario`.`telefone` AS `telefone`, `funcionario`.`data_nascimento` AS `data_nascimento`, `funcionario`.`data_contrato` AS `data_contrato`, `horario_do_medico`.`dia` AS `Dia disponivel`, `horario_do_medico`.`hora` AS `Hora disponivel` FROM (((`medico` join `especialidade`) join `funcionario`) join `horario_do_medico`) WHERE `funcionario`.`id` = `medico`.`funcionario_id` AND `medico`.`especialidade_id` = `especialidade`.`id` AND `horario_do_medico`.`id_medico` = `medico`.`id` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_paciente` (`id_paciente`),
  ADD KEY `fk_especialidade` (`id_especialidade`);

--
-- Indexes for table `consulta_horario`
--
ALTER TABLE `consulta_horario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_consulta` (`id_consulta`,`id_horario`),
  ADD KEY `fk_horario` (`id_horario`);

--
-- Indexes for table `especialidade`
--
ALTER TABLE `especialidade`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `horario_do_medico`
--
ALTER TABLE `horario_do_medico`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `hora` (`hora`,`dia`,`id_medico`),
  ADD KEY `fk_medico` (`id_medico`);

--
-- Indexes for table `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numero_ordem` (`numero_ordem`),
  ADD KEY `medico_ibfk_1` (`especialidade_id`),
  ADD KEY `medico_ibfk_2` (`funcionario_id`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `consulta`
--
ALTER TABLE `consulta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `consulta_horario`
--
ALTER TABLE `consulta_horario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `especialidade`
--
ALTER TABLE `especialidade`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `horario_do_medico`
--
ALTER TABLE `horario_do_medico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medico`
--
ALTER TABLE `medico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `fk_especialidade` FOREIGN KEY (`id_especialidade`) REFERENCES `especialidade` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `consulta_horario`
--
ALTER TABLE `consulta_horario`
  ADD CONSTRAINT `fk_consulta` FOREIGN KEY (`id_consulta`) REFERENCES `consulta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_horario` FOREIGN KEY (`id_horario`) REFERENCES `horario_do_medico` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `horario_do_medico`
--
ALTER TABLE `horario_do_medico`
  ADD CONSTRAINT `fk_medico` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`especialidade_id`) REFERENCES `especialidade` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `medico_ibfk_2` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
