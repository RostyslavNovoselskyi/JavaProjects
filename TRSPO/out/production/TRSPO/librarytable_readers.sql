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
-- Table structure for table `readers`
--

DROP TABLE IF EXISTS `readers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `readers` (
  `id` int(11) DEFAULT NULL,
  `номерЧитацьогоКвитка` varchar(30) DEFAULT NULL,
  `прізвище` varchar(30) DEFAULT NULL,
  `імЯ` varchar(30) DEFAULT NULL,
  `адреса` varchar(30) DEFAULT NULL,
  `номерТелефону` varchar(30) DEFAULT NULL,
  `останняКнига` varchar(30) DEFAULT NULL,
  `датаВидачі` varchar(30) DEFAULT NULL,
  `датаЗдачі` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `readers`
--

LOCK TABLES `readers` WRITE;
/*!40000 ALTER TABLE `readers` DISABLE KEYS */;
INSERT INTO `readers` VALUES (1,'10055','Антоняк','А.Г.','Головна,25','380978554610','«Рекреації»','02.10.19','03.01.20'),(2,'10056','Бешлей','С.В.','Сонячна,21','38097854600','«Сталінка»','25.03.19','12.06.19'),(3,'10057','Вантух','А.А.','Садова,6','380978548610','\"Записки...\"','13.09.19','30.11.19'),(4,'10058','Виджак','С.В.','Сихівська,15','380975854670',' «Село не люди»','19.11.19','29.12.19'),(5,'10059','Гірняк','Р.О.','Самбірська,66','380975854670','«Солодка Даруся»','12.12.19','04.02.20'),(6,'10060','Приліпко','І.В.','Зубрівська,12','380975585461',' «Танго смерті»','23.12.19','13.01.20'),(7,'10061','Клюфас','А.І.','Городоцька,22','380978654610','«Іловайськ»','03.01.20','23.02.20'),(8,'10062','Кузбит','І.В.','Підвальна,29','380988654610','«Чорний ворон»','09.03.20','20.03.20'),(9,'10063','Пиптик','Л.В','Личаківська,9','380978588510','\"Тe, що на споді\"','05.11.19','12.12.20'),(10,'10064','Струс','Х.І.','Пасічна,77б','380975854670','«Номінація»','14.12.19','03.02.20');
/*!40000 ALTER TABLE `readers` ENABLE KEYS */;
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
