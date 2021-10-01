-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 01, 2021 at 03:03 PM
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
-- Database: `e-commerce-system_database`
--

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
  PRIMARY KEY (`Product_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthly_sales`
--

INSERT INTO `monthly_sales` (`Product_ID`, `Product_Name`, `Product_Price`, `Number_of_purchases`) VALUES
(1001, 'Cricket Bat', 10500, 25),
(1002, 'Cricket Ball', 2500, 150);

-- --------------------------------------------------------

--
-- Table structure for table `user_signup`
--

DROP TABLE IF EXISTS `user_signup`;
CREATE TABLE IF NOT EXISTS `user_signup` (
  `UserID` int(10) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `User-Email` varchar(80) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_signup`
--

INSERT INTO `user_signup` (`UserID`, `Username`, `User-Email`) VALUES
(1, 'M.M.Dahanayaka', 'dmalshani@gmail.com'),
(2, 'S.Kasun', 'kasunmk@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
