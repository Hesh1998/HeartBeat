-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 17, 2021 at 11:48 PM
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
-- Database: `heart_beat_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `appointment_no` int(5) NOT NULL,
  `patient_code` varchar(10) NOT NULL,
  `time_slot_id` int(5) NOT NULL,
  `payment_date` date DEFAULT NULL,
  PRIMARY KEY (`appointment_no`),
  KEY `patient_code` (`patient_code`),
  KEY `time_slot_id` (`time_slot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`appointment_no`, `patient_code`, `time_slot_id`, `payment_date`) VALUES
(1, 'P1', 1, '2021-01-18'),
(2, 'P2', 1, '2021-01-18'),
(3, 'P3', 1, '2021-01-18'),
(4, 'P1', 3, '2021-01-18'),
(5, 'P2', 3, '2021-01-18'),
(6, 'P3', 3, '2021-01-18');

-- --------------------------------------------------------

--
-- Table structure for table `consultant`
--

DROP TABLE IF EXISTS `consultant`;
CREATE TABLE IF NOT EXISTS `consultant` (
  `consultant_id` varchar(10) NOT NULL,
  `forename` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `date_of_birth` date NOT NULL,
  `address_number` varchar(10) NOT NULL,
  `address_street` varchar(30) NOT NULL,
  `address_city` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `SLMC_reg_no` int(10) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `speciality` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `LAN_no` varchar(10) DEFAULT NULL,
  `num_of_patients` int(4) NOT NULL,
  PRIMARY KEY (`consultant_id`),
  KEY `speciality` (`speciality`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultant`
--

INSERT INTO `consultant` (`consultant_id`, `forename`, `surname`, `date_of_birth`, `address_number`, `address_street`, `address_city`, `email`, `SLMC_reg_no`, `gender`, `speciality`, `password`, `mobile_no`, `LAN_no`, `num_of_patients`) VALUES
('CON1', 'Kavindu', 'Ramesh', '1999-09-19', 'No. 348', 'Jaya Mawatha', 'Galle', 'kavindu@gmail.com', 100, 'Male', 'Neuro Surgeon', 'abcdE%.1kdfK', '0710000000', '0910000000', 0),
('CON2', 'Kamal', 'Senanayake', '1960-01-21', 'No. 256-E', 'New Road', 'Colombo', 'kamal@gmail.com', 150, 'Male', 'Neuro Surgeon', 'abcdE%.1kdfK', '0770000000', '0110000000', 0),
('CON3', 'Pushpa', 'Wikramaarachchi', '1965-01-13', 'No. 348', 'Jaya Mawatha', 'Puttalam', 'pushpa@gmail.com', 222, 'Female', 'Cardiologist', 'abcdE%.1kdfK', '0710000000', '0320000000', 0),
('CON4', 'Ramani', 'Perera', '1975-01-08', 'No. 348', 'Jaya Mawatha', 'Gampaha', 'ramani@gmail.com', 203, 'Female', 'Cardiologist', 'abcdE%.1kdfK', '0710000000', '0330000000', 0),
('CON5', 'Ishan', 'Kishan', '1960-07-02', 'No. 348', 'Jaya Mawatha', 'Colombo', 'kishan@gmail.com', 303, 'Male', 'Dermatologist', 'abcdE%.1kdfK', '0710000000', '0110000000', 0),
('CON6', 'Safraz', 'Ahmad', '1960-01-21', 'No. 256-E', 'New Road', 'Colombo', 'safraz@gmail.com', 405, 'Male', 'Dermatologist', 'abcdE%.1kdfK', '0770000000', '0110000000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `consultant_medical_center_branch`
--

DROP TABLE IF EXISTS `consultant_medical_center_branch`;
CREATE TABLE IF NOT EXISTS `consultant_medical_center_branch` (
  `branch_no` varchar(10) NOT NULL,
  `consultant_id` varchar(10) NOT NULL,
  PRIMARY KEY (`branch_no`,`consultant_id`),
  KEY `consultant_id` (`consultant_id`),
  KEY `branch_no` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultant_medical_center_branch`
--

INSERT INTO `consultant_medical_center_branch` (`branch_no`, `consultant_id`) VALUES
('B1', 'CON1'),
('B1', 'CON2'),
('B1', 'CON3'),
('B1', 'CON4'),
('B1', 'CON5'),
('B1', 'CON6');

-- --------------------------------------------------------

--
-- Table structure for table `consultant_qualification`
--

DROP TABLE IF EXISTS `consultant_qualification`;
CREATE TABLE IF NOT EXISTS `consultant_qualification` (
  `consultant_id` varchar(10) NOT NULL,
  `qualification` varchar(30) NOT NULL,
  PRIMARY KEY (`consultant_id`,`qualification`),
  KEY `consultant_id` (`consultant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultant_qualification`
--

INSERT INTO `consultant_qualification` (`consultant_id`, `qualification`) VALUES
('CON1', 'Surgeon'),
('CON2', 'Specialist'),
('CON3', 'Specialist'),
('CON4', 'Surgeon'),
('CON5', 'Specialist'),
('CON6', 'Specialist');

-- --------------------------------------------------------

--
-- Table structure for table `consultant_room`
--

DROP TABLE IF EXISTS `consultant_room`;
CREATE TABLE IF NOT EXISTS `consultant_room` (
  `room_no` int(5) NOT NULL,
  PRIMARY KEY (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultant_room`
--

INSERT INTO `consultant_room` (`room_no`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Table structure for table `consultant_salary`
--

DROP TABLE IF EXISTS `consultant_salary`;
CREATE TABLE IF NOT EXISTS `consultant_salary` (
  `speciality` varchar(30) NOT NULL,
  `charge_per_patient` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`speciality`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultant_salary`
--

INSERT INTO `consultant_salary` (`speciality`, `charge_per_patient`) VALUES
('Cardiologist', '1400.00'),
('Dermatologist', '1700.00'),
('Neuro Surgeon', '1500.00');

-- --------------------------------------------------------

--
-- Table structure for table `drug_in_stock`
--

DROP TABLE IF EXISTS `drug_in_stock`;
CREATE TABLE IF NOT EXISTS `drug_in_stock` (
  `drug_id` varchar(10) NOT NULL,
  `drug_name` varchar(50) NOT NULL,
  `stock` int(10) NOT NULL,
  `storage_type` varchar(10) NOT NULL,
  PRIMARY KEY (`drug_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `drug_in_stock_supplier`
--

DROP TABLE IF EXISTS `drug_in_stock_supplier`;
CREATE TABLE IF NOT EXISTS `drug_in_stock_supplier` (
  `drug_supply_id` varchar(10) NOT NULL,
  `drug_id` varchar(10) NOT NULL,
  `supplier_id` varchar(10) NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `mfd` date NOT NULL,
  `exp` date NOT NULL,
  `num_of_units` int(10) NOT NULL,
  PRIMARY KEY (`drug_supply_id`),
  KEY `drug_id` (`drug_id`),
  KEY `supplier_id` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medical_center_branch`
--

DROP TABLE IF EXISTS `medical_center_branch`;
CREATE TABLE IF NOT EXISTS `medical_center_branch` (
  `branch_no` varchar(10) NOT NULL,
  `branch_name` varchar(30) NOT NULL,
  `address_number` varchar(10) NOT NULL,
  `address_street` varchar(30) NOT NULL,
  `address_city` varchar(30) NOT NULL,
  PRIMARY KEY (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical_center_branch`
--

INSERT INTO `medical_center_branch` (`branch_no`, `branch_name`, `address_number`, `address_street`, `address_city`) VALUES
('B1', 'HeartBeat Branch 1', 'No. 348', 'Jaya Mawatha', 'Gampaha');

-- --------------------------------------------------------

--
-- Table structure for table `medical_center_branch_contact_number`
--

DROP TABLE IF EXISTS `medical_center_branch_contact_number`;
CREATE TABLE IF NOT EXISTS `medical_center_branch_contact_number` (
  `branch_no` varchar(10) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  PRIMARY KEY (`branch_no`,`contact_no`),
  KEY `branch_no` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical_center_branch_contact_number`
--

INSERT INTO `medical_center_branch_contact_number` (`branch_no`, `contact_no`) VALUES
('B1', '0330000000'),
('B1', '0330000001');

-- --------------------------------------------------------

--
-- Table structure for table `medical_equipment`
--

DROP TABLE IF EXISTS `medical_equipment`;
CREATE TABLE IF NOT EXISTS `medical_equipment` (
  `medical_equipment_id` varchar(10) NOT NULL,
  `branch_no` varchar(10) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `type` varchar(15) NOT NULL,
  `stock` int(10) NOT NULL,
  PRIMARY KEY (`medical_equipment_id`),
  KEY `branch_no` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical_equipment`
--

INSERT INTO `medical_equipment` (`medical_equipment_id`, `branch_no`, `name`, `type`, `stock`) VALUES
('ME1', 'B1', 'Hospital Beds', 'Patient Support', 10),
('ME2', 'B1', 'Wheel Chair', 'Patient Support', 3),
('ME3', 'B1', 'Sphygmomanometer', 'Doctor Support', 5);

-- --------------------------------------------------------

--
-- Table structure for table `medical_equipment_supplier`
--

DROP TABLE IF EXISTS `medical_equipment_supplier`;
CREATE TABLE IF NOT EXISTS `medical_equipment_supplier` (
  `me_supply_id` varchar(10) NOT NULL,
  `medical_equipment_id` varchar(10) NOT NULL,
  `supplier_id` varchar(10) NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `purchase_date` date NOT NULL,
  `num_of_units` int(10) NOT NULL,
  PRIMARY KEY (`me_supply_id`),
  KEY `medical_equipment_id` (`medical_equipment_id`),
  KEY `supplier_id` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical_equipment_supplier`
--

INSERT INTO `medical_equipment_supplier` (`me_supply_id`, `medical_equipment_id`, `supplier_id`, `brand_name`, `price`, `purchase_date`, `num_of_units`) VALUES
('MES1', 'ME1', 'SUP1', 'Brand 1', '10000.00', '2021-01-01', 5),
('MES2', 'ME2', 'SUP2', 'Brand 2', '5000.00', '2020-12-15', 2),
('MES3', 'ME1', 'SUP2', 'Brand 2', '12000.00', '2021-01-11', 5),
('MES4', 'ME2', 'SUP2', 'Brand 1', '5500.00', '2020-12-31', 1),
('MES5', 'ME3', 'SUP2', 'Brand 1', '4000.00', '2021-01-01', 5);

-- --------------------------------------------------------

--
-- Table structure for table `medical_supporting_device`
--

DROP TABLE IF EXISTS `medical_supporting_device`;
CREATE TABLE IF NOT EXISTS `medical_supporting_device` (
  `supporting_device_id` varchar(10) NOT NULL,
  `supporting_device_name` varchar(50) NOT NULL,
  `stock` int(10) NOT NULL,
  PRIMARY KEY (`supporting_device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medical_supporting_device_size`
--

DROP TABLE IF EXISTS `medical_supporting_device_size`;
CREATE TABLE IF NOT EXISTS `medical_supporting_device_size` (
  `supporting_device_id` varchar(10) NOT NULL,
  `size` varchar(20) NOT NULL,
  PRIMARY KEY (`supporting_device_id`,`size`),
  KEY `supporting_device_id` (`supporting_device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medical_supporting_device_supplier`
--

DROP TABLE IF EXISTS `medical_supporting_device_supplier`;
CREATE TABLE IF NOT EXISTS `medical_supporting_device_supplier` (
  `msd_supplier_id` varchar(10) NOT NULL,
  `supplier_id` varchar(10) NOT NULL,
  `supporting_device_id` varchar(10) NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `purchase_date` date NOT NULL,
  `num_of_units` int(10) NOT NULL,
  PRIMARY KEY (`msd_supplier_id`),
  KEY `supplier_id` (`supplier_id`),
  KEY `supporting_device_id` (`supporting_device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_code` varchar(10) NOT NULL,
  `forename` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `address_number` varchar(30) NOT NULL,
  `address_street` varchar(30) NOT NULL,
  `address_city` varchar(30) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(6) NOT NULL,
  `blood_group` varchar(3) NOT NULL,
  `NIC` varchar(12) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `LAN_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`patient_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_code`, `forename`, `surname`, `address_number`, `address_street`, `address_city`, `date_of_birth`, `gender`, `blood_group`, `NIC`, `email`, `mobile_no`, `LAN_no`) VALUES
('P1', 'Heshan', 'Nanayakkara', '256-E', '2nd Lane', 'Galle', '1998-07-21', 'Male', 'B+', '982032083V', 'heshan@gmail.com', '0779654083', '0912226891'),
('P2', 'Heshan', 'Nanayakkara', '256-E', '2nd Lane', 'Galle', '1998-07-21', 'Male', 'B+', '982032083V', 'heshan@gmail.com', '0779654083', '0912226891'),
('P3', 'Heshan', 'Nanayakkara', '256-E', '2nd Lane', 'Galle', '1998-07-21', 'Male', 'B+', '982032083V', 'heshan@gmail.com', '0779654083', '0912226891');

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
CREATE TABLE IF NOT EXISTS `prescription` (
  `prescription_no` int(3) NOT NULL,
  `patient_code` varchar(10) NOT NULL,
  `diagnosed_illness` varchar(50) NOT NULL,
  `note` varchar(500) DEFAULT NULL,
  `consultant_id` varchar(10) NOT NULL,
  PRIMARY KEY (`prescription_no`,`patient_code`),
  KEY `patient_code` (`patient_code`),
  KEY `consultant_id` (`consultant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`prescription_no`, `patient_code`, `diagnosed_illness`, `note`, `consultant_id`) VALUES
(1, 'P1', 'Fever', '', 'CON1'),
(2, 'P2', 'Fever', '', 'CON1'),
(3, 'P2', 'Common Cold', '', 'CON1'),
(4, 'P3', 'Fever', '', 'CON1'),
(5, 'P3', 'Common Cold', '', 'CON1');

-- --------------------------------------------------------

--
-- Table structure for table `prescription_drug_in_stock`
--

DROP TABLE IF EXISTS `prescription_drug_in_stock`;
CREATE TABLE IF NOT EXISTS `prescription_drug_in_stock` (
  `prescription_no` int(5) NOT NULL,
  `patient_code` varchar(10) NOT NULL,
  `drug_id` varchar(10) NOT NULL,
  `payment` decimal(8,2) NOT NULL,
  PRIMARY KEY (`prescription_no`,`patient_code`,`drug_id`),
  KEY `patient_code` (`patient_code`),
  KEY `drug_id` (`drug_id`),
  KEY `prescription_no` (`prescription_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prescription_drug_prescribed`
--

DROP TABLE IF EXISTS `prescription_drug_prescribed`;
CREATE TABLE IF NOT EXISTS `prescription_drug_prescribed` (
  `prescription_no` int(3) NOT NULL,
  `drug_prescribed` varchar(50) NOT NULL,
  `dose` varchar(50) NOT NULL,
  PRIMARY KEY (`prescription_no`,`drug_prescribed`),
  KEY `prescription_no` (`prescription_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prescription_drug_prescribed`
--

INSERT INTO `prescription_drug_prescribed` (`prescription_no`, `drug_prescribed`, `dose`) VALUES
(1, 'Panadol', '500mg tablets twice a day for 4 days'),
(2, 'Panadol', '500mg tablets twice a day for 4 days'),
(3, 'Cetrizing', '200mg tablets once a day for 3 days'),
(4, 'Panadol', '500mg tablets twice a day for 4 days'),
(5, 'Cetrizine', '200mg tablets once a day for 3 days');

-- --------------------------------------------------------

--
-- Table structure for table `prescription_medical_supporting_device`
--

DROP TABLE IF EXISTS `prescription_medical_supporting_device`;
CREATE TABLE IF NOT EXISTS `prescription_medical_supporting_device` (
  `prescription_no` int(5) NOT NULL,
  `patient_code` varchar(10) NOT NULL,
  `supporting_device_id` varchar(10) NOT NULL,
  `payment` decimal(8,2) NOT NULL,
  PRIMARY KEY (`prescription_no`,`patient_code`,`supporting_device_id`),
  KEY `patient_code` (`patient_code`),
  KEY `supporting_device_id` (`supporting_device_id`),
  KEY `prescription_no` (`prescription_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` varchar(10) NOT NULL,
  `branch_no` varchar(10) DEFAULT NULL,
  `forename` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `address_number` varchar(10) NOT NULL,
  `address_street` varchar(30) NOT NULL,
  `address_city` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(6) NOT NULL,
  `staff_type` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `LAN_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`staff_id`),
  KEY `staff_type` (`staff_type`),
  KEY `staff_ibfk_1` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `branch_no`, `forename`, `surname`, `address_number`, `address_street`, `address_city`, `email`, `date_of_birth`, `gender`, `staff_type`, `password`, `mobile_no`, `LAN_no`) VALUES
('STF1', 'B1', 'Pushpa', 'Soysa', 'No. 348', 'Jaya Mawatha', 'Galle', 'pushpa@gmail.com', '1960-07-02', 'Female', 'Nurse', 'abcdE%.1kdfJ', '0710000000', '0910000000'),
('STF2', 'B1', 'Nimal', 'Wijepala', 'No. 348', 'Jaya Mawatha', 'Puttalam', 'nimal@yahoo.com', '1970-01-13', 'Male', 'Pharmacist', 'abcdE%.1kdfJ', '0770000000', '0320000000'),
('STF3', 'B1', 'Kavindu', 'Ramesh', 'No. 348', 'Jaya Mawatha', 'Gampaha', 'kavindu@gmail.com', '1999-09-19', 'Male', 'Manager', 'abcdE%.1kdfJ', '0710000000', '0330000000'),
('STF4', 'B1', 'Nimala', 'Jayasinghe', 'No. 348', 'Jaya Mawatha', 'Kandy', 'nimala@gmail.com', '1975-01-08', 'Female', 'Receptionist', 'abcdE%.1kdfJ', '0700000000', '0810000000'),
('STF5', 'B1', 'Kamal', 'Perera', 'No. 348', 'Jaya Mawatha', 'Galle', 'kamal@gmail.com', '1980-01-06', 'Male', 'Supporting Staff', 'abcdE%.1kdfJ', '0770000000', '0910000000');

-- --------------------------------------------------------

--
-- Table structure for table `staff_salary`
--

DROP TABLE IF EXISTS `staff_salary`;
CREATE TABLE IF NOT EXISTS `staff_salary` (
  `staff_type` varchar(20) NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  PRIMARY KEY (`staff_type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_salary`
--

INSERT INTO `staff_salary` (`staff_type`, `salary`) VALUES
('Manager', '80000.00'),
('Nurse', '60000.00'),
('Pharmacist', '60000.00'),
('Receptionist', '50000.00'),
('Supporting Staff', '40000.00');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `supplier_id` varchar(10) NOT NULL,
  `forename` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `address_number` varchar(10) NOT NULL,
  `address_street` varchar(30) NOT NULL,
  `address_city` varchar(30) NOT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `LAN_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`supplier_id`, `forename`, `surname`, `address_number`, `address_street`, `address_city`, `mobile_no`, `LAN_no`) VALUES
('SUP1', 'Nimal', 'Soysa', 'No. 348', 'Jaya Mawatha', 'Galle', '0710000000', '0910000000'),
('SUP2', 'Nimali', 'Senanayake', 'No. 256-E', 'New Road', 'Colombo', '0770000000', '0110000000');

-- --------------------------------------------------------

--
-- Table structure for table `time_slot`
--

DROP TABLE IF EXISTS `time_slot`;
CREATE TABLE IF NOT EXISTS `time_slot` (
  `time_slot_id` int(5) NOT NULL,
  `consultant_id` varchar(10) NOT NULL,
  `day` varchar(10) NOT NULL,
  `starting_time` time NOT NULL,
  `ending_time` time NOT NULL,
  `current_patient` int(5) NOT NULL,
  `max_patient` int(5) NOT NULL,
  `room_no` int(5) NOT NULL,
  PRIMARY KEY (`time_slot_id`),
  KEY `consultant_id` (`consultant_id`),
  KEY `room_no` (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `time_slot`
--

INSERT INTO `time_slot` (`time_slot_id`, `consultant_id`, `day`, `starting_time`, `ending_time`, `current_patient`, `max_patient`, `room_no`) VALUES
(1, 'CON1', 'Monday', '10:00:00', '12:00:00', 3, 20, 1),
(2, 'CON2', 'Monday', '11:00:00', '13:00:00', 0, 20, 2),
(3, 'CON3', 'Tuesday', '10:00:00', '12:00:00', 3, 20, 1),
(4, 'CON4', 'Tuesday', '15:00:00', '17:00:00', 0, 30, 1),
(5, 'CON5', 'Wednesday', '11:00:00', '14:00:00', 0, 25, 1),
(6, 'CON6', 'Wednesday', '14:00:00', '17:00:00', 0, 35, 2),
(7, 'CON1', 'Thursday', '10:30:00', '13:00:00', 0, 20, 1),
(8, 'CON2', 'Thursday', '14:00:00', '17:00:00', 0, 35, 2),
(9, 'CON3', 'Friday', '10:00:00', '12:00:00', 0, 20, 1),
(10, 'CON5', 'Friday', '14:00:00', '17:00:00', 0, 35, 2),
(11, 'CON5', 'Saturday', '11:00:00', '13:00:00', 0, 20, 1),
(12, 'CON6', 'Saturday', '15:00:00', '17:00:00', 0, 20, 1),
(13, 'CON1', 'Sunday', '10:00:00', '12:00:00', 0, 20, 1),
(14, 'CON2', 'Sunday', '15:00:00', '17:00:00', 0, 20, 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`patient_code`) REFERENCES `patient` (`patient_code`),
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`time_slot_id`) REFERENCES `time_slot` (`time_slot_id`);

--
-- Constraints for table `consultant`
--
ALTER TABLE `consultant`
  ADD CONSTRAINT `consultant_ibfk_1` FOREIGN KEY (`speciality`) REFERENCES `consultant_salary` (`speciality`);

--
-- Constraints for table `consultant_medical_center_branch`
--
ALTER TABLE `consultant_medical_center_branch`
  ADD CONSTRAINT `consultant_medical_center_branch_ibfk_1` FOREIGN KEY (`branch_no`) REFERENCES `medical_center_branch` (`branch_no`),
  ADD CONSTRAINT `consultant_medical_center_branch_ibfk_2` FOREIGN KEY (`consultant_id`) REFERENCES `consultant` (`consultant_id`);

--
-- Constraints for table `consultant_qualification`
--
ALTER TABLE `consultant_qualification`
  ADD CONSTRAINT `consultant_qualification_ibfk_1` FOREIGN KEY (`consultant_id`) REFERENCES `consultant` (`consultant_id`);

--
-- Constraints for table `drug_in_stock_supplier`
--
ALTER TABLE `drug_in_stock_supplier`
  ADD CONSTRAINT `drug_in_stock_supplier_ibfk_1` FOREIGN KEY (`drug_id`) REFERENCES `drug_in_stock` (`drug_id`),
  ADD CONSTRAINT `drug_in_stock_supplier_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`);

--
-- Constraints for table `medical_center_branch_contact_number`
--
ALTER TABLE `medical_center_branch_contact_number`
  ADD CONSTRAINT `medical_center_branch_contact_number_ibfk_1` FOREIGN KEY (`branch_no`) REFERENCES `medical_center_branch` (`branch_no`);

--
-- Constraints for table `medical_equipment`
--
ALTER TABLE `medical_equipment`
  ADD CONSTRAINT `medical_equipment_ibfk_1` FOREIGN KEY (`branch_no`) REFERENCES `medical_center_branch` (`branch_no`);

--
-- Constraints for table `medical_equipment_supplier`
--
ALTER TABLE `medical_equipment_supplier`
  ADD CONSTRAINT `medical_equipment_supplier_ibfk_1` FOREIGN KEY (`medical_equipment_id`) REFERENCES `medical_equipment` (`medical_equipment_id`),
  ADD CONSTRAINT `medical_equipment_supplier_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`);

--
-- Constraints for table `medical_supporting_device_size`
--
ALTER TABLE `medical_supporting_device_size`
  ADD CONSTRAINT `medical_supporting_device_size_ibfk_1` FOREIGN KEY (`supporting_device_id`) REFERENCES `medical_supporting_device` (`supporting_device_id`);

--
-- Constraints for table `medical_supporting_device_supplier`
--
ALTER TABLE `medical_supporting_device_supplier`
  ADD CONSTRAINT `medical_supporting_device_supplier_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`),
  ADD CONSTRAINT `medical_supporting_device_supplier_ibfk_2` FOREIGN KEY (`supporting_device_id`) REFERENCES `medical_supporting_device` (`supporting_device_id`);

--
-- Constraints for table `prescription`
--
ALTER TABLE `prescription`
  ADD CONSTRAINT `prescription_ibfk_1` FOREIGN KEY (`patient_code`) REFERENCES `patient` (`patient_code`) ON UPDATE CASCADE,
  ADD CONSTRAINT `prescription_ibfk_2` FOREIGN KEY (`consultant_id`) REFERENCES `consultant` (`consultant_id`);

--
-- Constraints for table `prescription_drug_in_stock`
--
ALTER TABLE `prescription_drug_in_stock`
  ADD CONSTRAINT `prescription_drug_in_stock_ibfk_1` FOREIGN KEY (`prescription_no`) REFERENCES `prescription` (`prescription_no`),
  ADD CONSTRAINT `prescription_drug_in_stock_ibfk_2` FOREIGN KEY (`patient_code`) REFERENCES `patient` (`patient_code`),
  ADD CONSTRAINT `prescription_drug_in_stock_ibfk_3` FOREIGN KEY (`drug_id`) REFERENCES `drug_in_stock` (`drug_id`);

--
-- Constraints for table `prescription_drug_prescribed`
--
ALTER TABLE `prescription_drug_prescribed`
  ADD CONSTRAINT `prescription_drug_prescribed_ibfk_1` FOREIGN KEY (`prescription_no`) REFERENCES `prescription` (`prescription_no`);

--
-- Constraints for table `prescription_medical_supporting_device`
--
ALTER TABLE `prescription_medical_supporting_device`
  ADD CONSTRAINT `prescription_medical_supporting_device_ibfk_1` FOREIGN KEY (`patient_code`) REFERENCES `patient` (`patient_code`),
  ADD CONSTRAINT `prescription_medical_supporting_device_ibfk_2` FOREIGN KEY (`prescription_no`) REFERENCES `prescription` (`prescription_no`),
  ADD CONSTRAINT `prescription_medical_supporting_device_ibfk_3` FOREIGN KEY (`supporting_device_id`) REFERENCES `medical_supporting_device` (`supporting_device_id`);

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`branch_no`) REFERENCES `medical_center_branch` (`branch_no`),
  ADD CONSTRAINT `staff_ibfk_2` FOREIGN KEY (`staff_type`) REFERENCES `staff_salary` (`staff_type`);

--
-- Constraints for table `time_slot`
--
ALTER TABLE `time_slot`
  ADD CONSTRAINT `time_slot_ibfk_1` FOREIGN KEY (`consultant_id`) REFERENCES `consultant` (`consultant_id`),
  ADD CONSTRAINT `time_slot_ibfk_2` FOREIGN KEY (`room_no`) REFERENCES `consultant_room` (`room_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
