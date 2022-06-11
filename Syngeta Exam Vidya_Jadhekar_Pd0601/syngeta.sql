-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: syngeta
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reader_info`
--

DROP TABLE IF EXISTS `reader_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reader_info` (
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(25) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  `landmark` varchar(10) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `bookid` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reader_info`
--

LOCK TABLES `reader_info` WRITE;
/*!40000 ALTER TABLE `reader_info` DISABLE KEYS */;
INSERT INTO `reader_info` VALUES ('Dave','Smith',1,'123 main st.','seattle','wa',43,0),('Alice','Smith',2,'123 Main St.','Seattle','WA',45,0),('bOb','Williams',3,'234 2nd Ave.','Tacoma','WA',26,0),('Carol','Johnson',4,'234 2nd Ave','Seattle','WA',67,0),('TOm','Bombadillo',5,'1212 Maple Street','Florida','GA',520,0),('Jimbo','Jones',6,'82 Pine Street','Atlanta','GA',2,0),('Jackie','Jones',7,'82 Pine Street','Atlanta','GA',6,0),('Tommy','Jones',8,'82 Pine Street','Atlanta','GA',29,0),('tammy','Jones',20,'82 Pine Street','Atlanta','GA',27,0),('EvE','Smith',21,'234 2nd Ave.','Tacoma','WA',25,0),('Frank','Jones',22,'234 2nd Ave.','Tacoma','FL',23,0),('Jane','Smith',23,'123 Main St.','Seattle','WA',13,0),('Ian','smith',24,'123 main st ','Seattle','Wa',18,0),('Helen','Brown',25,'345 3rd Blvd. Apt. 200','Seattle','WA',18,0);
/*!40000 ALTER TABLE `reader_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 17:01:57
