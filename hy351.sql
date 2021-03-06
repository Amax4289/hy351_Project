-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2022 at 12:55 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hy351`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `Appointment_ID` int(11) NOT NULL,
  `Vaccination_Center_ID` varchar(30) NOT NULL,
  `Vaccine_Name` varchar(30) NOT NULL,
  `Citizen_AMKA` bigint(11) NOT NULL,
  `Dose` int(1) NOT NULL,
  `Date` varchar(25) NOT NULL,
  `Time` varchar(10) NOT NULL,
  `Confirmed` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`Appointment_ID`, `Vaccination_Center_ID`, `Vaccine_Name`, `Citizen_AMKA`, `Dose`, `Date`, `Time`, `Confirmed`) VALUES
(1, 'PAGNI Hospital', 'Moderna', 77777777777, 2, '15/05/2022', '13:00', 1),
(9, 'Venizeleio Hospital', 'Moderna', 1111111111, 1, '3/3/2027', '10:30', 0);

-- --------------------------------------------------------

--
-- Table structure for table `citizen`
--

CREATE TABLE `citizen` (
  `Citizen_ID` int(11) NOT NULL,
  `Citizen_AMKA` bigint(12) NOT NULL,
  `Sex` varchar(15) NOT NULL,
  `Birthdate` date NOT NULL,
  `Phone` int(15) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Num_Of_Dose` int(11) NOT NULL,
  `password` text NOT NULL,
  `username` varchar(30) NOT NULL,
  `Firstname` varchar(25) NOT NULL,
  `Lastname` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `citizen`
--

INSERT INTO `citizen` (`Citizen_ID`, `Citizen_AMKA`, `Sex`, `Birthdate`, `Phone`, `Email`, `Num_Of_Dose`, `password`, `username`, `Firstname`, `Lastname`) VALUES
(5, 55555555555, 'Female', '1995-11-10', 99555555, 'papagalos@gmail.com', 0, '123', 'papagalos', 'Dimitris', 'stoichkov'),
(7, 77777777777, 'Female', '1995-09-22', 99555555, 'kafedaki@hotmail.com', 2, '123', 'coffee', 'Maria', 'Kafedaki'),
(8, 42042042042, 'Female', '1821-03-25', 696969696, 'kokosaskis@hashish.com', 1, '123', 'kokosaskis', 'kokas', 'kokakias');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor_ID` int(11) NOT NULL,
  `Doctor_AMKA` bigint(12) NOT NULL,
  `Sex` varchar(15) NOT NULL,
  `Birthdate` date NOT NULL,
  `Phone` int(15) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Num_Of_Dose` int(11) NOT NULL,
  `password` text NOT NULL,
  `username` varchar(30) NOT NULL,
  `Firstname` varchar(25) NOT NULL,
  `Lastname` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor_ID`, `Doctor_AMKA`, `Sex`, `Birthdate`, `Phone`, `Email`, `Num_Of_Dose`, `password`, `username`, `Firstname`, `Lastname`) VALUES
(1, 11111111111, 'Male', '1999-06-15', 99888888, 'r.balaskas.sd@gmail.com', 0, '123', 'raf', 'Rafael ', 'Balaskas'),
(2, 22222222222, 'Male', '1999-01-01', 99777777, 'amax@gmail.com', 0, '123', 'amax', 'Andreas', 'Amaxaris');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `Nurse_ID` int(11) NOT NULL,
  `Nurse_AMKA` bigint(12) NOT NULL,
  `Sex` varchar(15) NOT NULL,
  `Birthdate` date NOT NULL,
  `Phone` int(15) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Num_Of_Dose` int(11) NOT NULL,
  `password` text NOT NULL,
  `username` varchar(30) NOT NULL,
  `Firstname` varchar(25) NOT NULL,
  `Lastname` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`Nurse_ID`, `Nurse_AMKA`, `Sex`, `Birthdate`, `Phone`, `Email`, `Num_Of_Dose`, `password`, `username`, `Firstname`, `Lastname`) VALUES
(1, 33333333333, 'Male', '1999-06-30', 99666666, 'jimmys11@gmail.com', 0, '123', 'jim', 'Jimmys', 'Jimmakos'),
(2, 44444444444, 'Female', '2000-11-08', 99555555, 'kesenia@gmail.com', 0, '123', 'Kesenia', 'Xenia', 'Karagianni');

-- --------------------------------------------------------

--
-- Table structure for table `vaccination_center`
--

CREATE TABLE `vaccination_center` (
  `Vaccination_Center_ID` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `City` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccination_center`
--

INSERT INTO `vaccination_center` (`Vaccination_Center_ID`, `Address`, `City`) VALUES
('PAGNI Hospital', '??????????????????????????, ???????????????? 71500', 'Heraklion'),
('Venizeleio Hospital', '????????. ???????????? 44, ???????????????? 71409', 'Heraklion');

-- --------------------------------------------------------

--
-- Table structure for table `vaccine`
--

CREATE TABLE `vaccine` (
  `Vaccine_Name` varchar(30) NOT NULL,
  `Supplies` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccine`
--

INSERT INTO `vaccine` (`Vaccine_Name`, `Supplies`) VALUES
('Moderna', 1000000),
('Oxford/AstraZeneca', 1000000),
('Pfizer/BioNTech', 1000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`Appointment_ID`);

--
-- Indexes for table `citizen`
--
ALTER TABLE `citizen`
  ADD PRIMARY KEY (`Citizen_ID`,`Citizen_AMKA`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor_ID`,`Doctor_AMKA`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`Nurse_ID`,`Nurse_AMKA`);

--
-- Indexes for table `vaccination_center`
--
ALTER TABLE `vaccination_center`
  ADD PRIMARY KEY (`Vaccination_Center_ID`);

--
-- Indexes for table `vaccine`
--
ALTER TABLE `vaccine`
  ADD PRIMARY KEY (`Vaccine_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `Appointment_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `citizen`
--
ALTER TABLE `citizen`
  MODIFY `Citizen_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `Doctor_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `Nurse_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
