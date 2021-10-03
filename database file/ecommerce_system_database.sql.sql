-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 03, 2021 at 10:03 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommerce_system_database`
--
CREATE DATABASE IF NOT EXISTS `ecommerce_system_database` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ecommerce_system_database`;

-- --------------------------------------------------------

--
-- Table structure for table `monthly_sales`
--

DROP TABLE IF EXISTS `monthly_sales`;
CREATE TABLE IF NOT EXISTS `monthly_sales` (
  `Product_ID` int(10) NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `Product_Price` float NOT NULL,
  `Number_of_purchases` int(20) NOT NULL,
  `date` text NOT NULL,
  PRIMARY KEY (`Product_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthly_sales`
--

INSERT INTO `monthly_sales` (`Product_ID`, `Product_Name`, `Product_Price`, `Number_of_purchases`, `date`) VALUES
(1001, 'Cricket Bat', 10500, 25, '2021-09-02 14:26:20'),
(1002, 'Cricket Ball', 2500, 150, '2021-09-10 14:26:20'),
(1234, 'volley ball', 5600, 67, '2021-09-20 14:26:20'),
(1456, 'batminton', 2345, 56, '2021-09-28'),
(1678, 'football', 4500, 23, '2021-09-21'),
(1985, 'cricket bat', 5600, 89, '2021-09-16'),
(1345, 'volleyball shoes', 3400, 34, '2021-09-19'),
(1844, 'table tenis ball', 2300, 45, '2021-09-15'),
(1889, 'foot ball jersey', 3499, 34, '2021-09-28');

-- --------------------------------------------------------

--
-- Table structure for table `user_signup`
--

DROP TABLE IF EXISTS `user_signup`;
CREATE TABLE IF NOT EXISTS `user_signup` (
  `UserID` int(10) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `User-Email` varchar(80) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`UserID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_signup`
--

INSERT INTO `user_signup` (`UserID`, `Username`, `User-Email`, `date`) VALUES
(1, 'M.M.Dahanayaka', 'dmalshani@gmail.com', '2021-09-02 00:00:00'),
(2, 'S.Kasun', 'kasunmk@gmail.com', '2021-09-06 14:24:40'),
(3, 'pubudu wickramathunga', 'pubudu@gmail.com', '2021-09-20 14:24:40'),
(4, 'radhushani', 'radhushani@gmail.com', '2021-09-25 14:24:40'),
(5, 'thushara', 'thushara@gmail.com', '2021-10-02 14:24:40'),
(6, 'dilka malith', 'dilka97@gmail.com', '2021-09-15 15:25:37'),
(7, 'supun madhushanaka', 'supun@gmail.com', '2021-09-07 15:25:37');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
