CREATE DATABASE  IF NOT EXISTS `librarytable` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `librarytable`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: librarytable
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `library`
--

DROP TABLE IF EXISTS `library`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `library` (
  `id` int(11) DEFAULT NULL,
  `автор` varchar(30) DEFAULT NULL,
  `назва` varchar(30) DEFAULT NULL,
  `рікВидання` varchar(30) DEFAULT NULL,
  `давністьВидання` varchar(30) DEFAULT NULL,
  `жанр` varchar(30) DEFAULT NULL,
  `ціна` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `library`
--

LOCK TABLES `library` WRITE;
/*!40000 ALTER TABLE `library` DISABLE KEYS */;
INSERT INTO `library` VALUES (1,'Юрій Андрухович','«Рекреації»','14.06.05','28','Сучасна проза','89UAN'),(2,'Олесь Уляненко','«Сталінка»','18.06.05','24','Роман','145UAN'),(3,' Ліна Костенко','\"Записки...\"','04.07.05','8','Роман','162UAN'),(4,'Люко Дашвар',' «Село не люди»','01.07.05','11','Роман','152UAN'),(5,'Марія Матіос','«Солодка Даруся»','28.06.05','14','Історична драма','99UAN'),(6,' Юрій Винничук',' «Танго смерті»','06.07.05','6','Роман','245UAN'),(7,'Євген Положій','«Іловайськ»','09.07.05','3','Військова драма','122UAN'),(8,' Василь Шкляр','«Чорний ворон»','03.07.05','9','Історичний роман','143UAN'),(9,'Юрій Покальчук','\"Тe, що на споді\"','23.06.05','19','Сучасний роман','189UAN'),(10,'Юрко Іздрик','«Номінація»','10.07.05','15','Роман','169UAN');
/*!40000 ALTER TABLE `library` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-18 13:06:28
