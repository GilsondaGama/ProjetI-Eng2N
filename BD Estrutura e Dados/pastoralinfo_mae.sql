CREATE DATABASE  IF NOT EXISTS `pastoralinfo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pastoralinfo`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: pastoralinfo
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `mae`
--

DROP TABLE IF EXISTS `mae`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mae` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `bairro` varchar(35) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  `nascimento` date DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `RG` varchar(45) DEFAULT NULL,
  `contato1` varchar(20) DEFAULT NULL,
  `contato2` varchar(20) DEFAULT NULL,
  `filhos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae`
--

LOCK TABLES `mae` WRITE;
/*!40000 ALTER TABLE `mae` DISABLE KEYS */;
INSERT INTO `mae` VALUES (1,'Amanda Soares','Rua Hildemar maia','','','','AP',NULL,'   .   .   -  ','','','',0),(3,'Joana Viana','Pres, Vargas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(4,'Joao dos Santos','Condomino das Palmeiras',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(5,'Joseane Almeida','Rua Jupter',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Ricarda Santiago','15 de abril',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Marcelina Sandos','Pres. Vargas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'Vitoria Nunes','Tupiniquins',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'Jandira Maciel','Jose Malcher',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'Rose Gentil','Av. Tupiniquins',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'Valmira Andrade','Rua Joao paulo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'Carlene Gabes','Travessa Almeida',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'Gabriela Maranhao','Rua das Cabas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'Delma Santana','Trav. Batista',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'Marcela Mineiro','Av. Regional','ljkblkjbn.kjbj','jklbjklbj.klbjlbjkl','.kjbkljbjbjjlk','bb',NULL,'96969789789','89867986798','9786976976979','97697697696',0),(18,'Aroldo 18','18','18','18','18','AP',NULL,'446.131.236-46','','(94) 9416-4634','(46) 4646-4646',0),(19,'Mirian 19','19','19','19','19','',NULL,'','','','',0),(20,'alteracao 20','End 20','Comp 20','Bai 20','Cidad 20','AS','2017-10-20','   .   .   -  ','20','(  )     -    ','(  )     -    ',6),(21,'Nome 21 alterado','endereco alretado','comp alt','bairro alt','city alt','',NULL,'','','','',0),(23,'Amanda alterado','23 Rua dos goitacases','23 esquina','23 beirol','','',NULL,'','','','',0),(25,'teste','','','','','',NULL,'654.646.464-64','','','',0),(26,'aaaa','aaaaaaaaaaaaaa','','','','  ','2017-10-17','   .   .   -  ','','(  )     -    ','(  )     -    ',0),(27,'bmnvbmvbmm','vbmbvbmv','bmvbmvbmvmvbm','vbmbvmvvvb','','  ',NULL,'   .   .   -  ','','(  )     -    ','(  )     -    ',4);
/*!40000 ALTER TABLE `mae` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-22  9:54:21
