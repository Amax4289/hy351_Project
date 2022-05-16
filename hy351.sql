-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2022 at 01:44 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

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
  `Vaccination_Center_ID` int(11) NOT NULL,
  `Vaccine_Name` varchar(30) NOT NULL,
  `Citizen_AMKA` int(11) NOT NULL,
  `Dose` int(1) NOT NULL,
  `Date` varchar(25) NOT NULL,
  `Time` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `citizen`
--

CREATE TABLE `citizen` (
  `Citizen_ID` int(11) NOT NULL,
  `Citizen_AMKA` bigint(12) NOT NULL,
  `Fullname` varchar(50) NOT NULL,
  `Sex` varchar(15) NOT NULL,
  `Birthdate` date NOT NULL,
  `Phone` int(15) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `citizen`
--

INSERT INTO `citizen` (`Citizen_ID`, `Citizen_AMKA`, `Fullname`, `Sex`, `Birthdate`, `Phone`, `Email`, `Type`) VALUES
(1, 11111111111, 'Rafail Balaskas', 'Male', '1999-06-15', 99888888, 'r.balaskas.sd@gmail.com', 'Nurse'),
(2, 22222222222, 'Andreas Amaxaris', 'Male', '1999-01-01', 99777777, 'amax@gmail.com', 'Doctor'),
(3, 33333333333, 'Dimitris Dimitrakis', 'Male', '1999-06-30', 99666666, 'jimmys11@gmail.com', 'Citizen'),
(4, 44444444444, 'Xenia Karagianni', 'Female', '2000-11-08', 99555555, 'kesenia@gmail.com', 'Citizen');

-- --------------------------------------------------------

--
-- Table structure for table `symptoms`
--

CREATE TABLE `symptoms` (
  `Symptoms_ID` int(11) NOT NULL,
  `Appointment_ID` int(11) NOT NULL,
  `Citizen_AMKA` int(11) NOT NULL,
  `Vaccine_Name` varchar(30) NOT NULL,
  `Dose` int(1) NOT NULL,
  `Date` date NOT NULL,
  `Comments` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vaccination_center`
--

CREATE TABLE `vaccination_center` (
  `Vaccination_Center_ID` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccination_center`
--

INSERT INTO `vaccination_center` (`Vaccination_Center_ID`, `Address`) VALUES
('PAGNI Hospital', 'Πανεπιστημίου, Ηράκλειο 71500'),
('Venizeleio Hospital', 'Λεωφ. Κνωσού 44, Ηράκλειο 71409');

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
-- Indexes for table `symptoms`
--
ALTER TABLE `symptoms`
  ADD PRIMARY KEY (`Appointment_ID`,`Citizen_AMKA`);

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
  MODIFY `Appointment_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `citizen`
--
ALTER TABLE `citizen`
  MODIFY `Citizen_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
