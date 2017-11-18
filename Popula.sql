CREATE DATABASE  IF NOT EXISTS `delivery` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `delivery`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: delivery
-- ------------------------------------------------------
-- Server version	5.7.20-enterprise-commercial-advanced-log

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
-- Table structure for table `adicionais`
--

DROP TABLE IF EXISTS `adicionais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adicionais` (
  `codAdicionais` int(11) NOT NULL AUTO_INCREMENT,
  `aDescricao` varchar(45) DEFAULT NULL,
  `aPreco` decimal(6,2) DEFAULT NULL,
  `aStatus` bit(1) DEFAULT NULL,
  PRIMARY KEY (`codAdicionais`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adicionais`
--

LOCK TABLES `adicionais` WRITE;
/*!40000 ALTER TABLE `adicionais` DISABLE KEYS */;
INSERT INTO `adicionais` VALUES (1,'Cebola Frita',0.00,''),(2,'Alho Frito',0.00,''),(3,'Azeitona',0.00,''),(4,'Bacon',2.00,'');
/*!40000 ALTER TABLE `adicionais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adictipoprod`
--

DROP TABLE IF EXISTS `adictipoprod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adictipoprod` (
  `codTipoProduto` int(11) NOT NULL,
  `codAdicionais` int(11) NOT NULL,
  PRIMARY KEY (`codTipoProduto`,`codAdicionais`),
  KEY `fk_tipoProduto_has_adicionais_adicionais1_idx` (`codAdicionais`),
  KEY `fk_tipoProduto_has_adicionais_tipoProduto1_idx` (`codTipoProduto`),
  CONSTRAINT `fk_tipoProduto_has_adicionais_adicionais1` FOREIGN KEY (`codAdicionais`) REFERENCES `adicionais` (`codAdicionais`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tipoProduto_has_adicionais_tipoProduto1` FOREIGN KEY (`codTipoProduto`) REFERENCES `tipoproduto` (`codTipoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adictipoprod`
--

LOCK TABLES `adictipoprod` WRITE;
/*!40000 ALTER TABLE `adictipoprod` DISABLE KEYS */;
INSERT INTO `adictipoprod` VALUES (1,1),(1,2),(1,3);
/*!40000 ALTER TABLE `adictipoprod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `cNome` varchar(60) DEFAULT NULL,
  `cTelefone1` varchar(20) DEFAULT NULL,
  `cTelefone2` varchar(20) DEFAULT NULL,
  `cRua` varchar(45) DEFAULT NULL,
  `cNumero` varchar(15) DEFAULT NULL,
  `cBairro` varchar(30) DEFAULT NULL,
  `cComplemento` varchar(30) DEFAULT NULL,
  `cRefEntrega` text,
  `cHistCompras` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Italo','3222-9000',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'ItaloSilqueira sdf','1231234','34234','rasdf','21','wrasdf','sdf','adfb','asg'),(9,'ItaloSilqueira sdf','1231234','34234','rasdfs qq','21','wrasdf','sdf','adfbsddf','asg'),(12,'BibaSIMNãooooo','adfv ','asg ','adfg ','sdfh','sdh','sgn','sgadfg dfg','afdg '),(13,'asdf','asdf ','','asdf ','','','','',''),(14,'asdf ','asdf','','asdf ','','','','',''),(15,'asdf ','asdf asd111','','asdf \'','','asdf ','','asdf ',''),(16,'asdf asdf ','','','asdf ','','','','',''),(17,'ads f','','','','','','','',''),(18,'asdf ','','','asdf ','','','','',''),(19,'asdf ','asdf ','','sdaf ','','','','',''),(20,'asdf ','asdf ','','asdf ','','','','',''),(21,'asdf ','','','','','','','',''),(22,'asdf ','qr23r1','','441444e','','asf ','','',''),(23,'asef 23r ','asf 23r 1','','asefr14','','','','',''),(24,'222222ebsh\\','dn\\d','nrf','ednf ','rfn','frf','rnrn','rfn','');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itenspedido`
--

DROP TABLE IF EXISTS `itenspedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itenspedido` (
  `it_codPedido` int(11) NOT NULL,
  `it_codProduto` int(11) NOT NULL,
  `itQuantidade` int(11) DEFAULT NULL,
  `itAdicional1` int(11) DEFAULT NULL,
  `itAdicional2` int(11) DEFAULT NULL,
  `itAdicional3` int(11) DEFAULT NULL,
  PRIMARY KEY (`it_codPedido`,`it_codProduto`),
  KEY `fk_pedido_has_produto_produto1_idx` (`it_codProduto`),
  KEY `fk_pedido_has_produto_pedido1_idx` (`it_codPedido`),
  CONSTRAINT `fk_pedido_has_produto_pedido1` FOREIGN KEY (`it_codPedido`) REFERENCES `pedido` (`codPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_has_produto_produto1` FOREIGN KEY (`it_codProduto`) REFERENCES `produto` (`codProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itenspedido`
--

LOCK TABLES `itenspedido` WRITE;
/*!40000 ALTER TABLE `itenspedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `itenspedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `codPedido` int(11) NOT NULL AUTO_INCREMENT,
  `peFormaPagamento` varchar(45) DEFAULT NULL,
  `peStatus` varchar(25) DEFAULT NULL,
  `peTxEntrega` decimal(6,2) DEFAULT NULL,
  `peVlTotal` decimal(6,2) NOT NULL,
  `peTotalProdutos` decimal(6,2) NOT NULL,
  `pe_codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codPedido`,`pe_codCliente`),
  KEY `fk_pedido_cliente_idx` (`pe_codCliente`),
  CONSTRAINT `fk_pedido_cliente` FOREIGN KEY (`pe_codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `codProduto` int(11) NOT NULL AUTO_INCREMENT,
  `pDescricao` varchar(45) DEFAULT NULL,
  `pPreco` decimal(6,2) DEFAULT NULL,
  `pStatus` bit(1) DEFAULT NULL,
  `p_CodTipoProduto` int(11) NOT NULL,
  PRIMARY KEY (`codProduto`,`p_CodTipoProduto`),
  KEY `fk_produto_tipoProduto1_idx` (`p_CodTipoProduto`),
  CONSTRAINT `fk_produto_tipoProduto1` FOREIGN KEY (`p_CodTipoProduto`) REFERENCES `tipoproduto` (`codTipoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Quatro Queijo',19.90,'',1),(2,'Coca-Cola 2Lts',6.60,'',3),(3,'Coca-Cola Lata',3.00,'',3),(4,'Skol Latão',4.15,'',4),(5,'Brahma Latão',4.15,'',4),(6,'Calabreza com Palmito',19.90,'',1),(7,'Strogonoff de Boi',21.90,'',5),(8,'Strogonoff de Frando',21.90,'',5),(9,'Frango e Banco',19.90,'',1),(10,'Portuguesa',19.90,'\0',1),(11,'Moda da Casa',19.90,'',1),(13,'testesdfs',1111.00,'',2),(14,'Coca-Cola Lata',3.00,'',3),(15,'Strogonoff de Frando',21.90,'',1);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproduto`
--

DROP TABLE IF EXISTS `tipoproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoproduto` (
  `codTipoProduto` int(11) NOT NULL AUTO_INCREMENT,
  `tDescTipo` varchar(45) NOT NULL,
  PRIMARY KEY (`codTipoProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproduto`
--

LOCK TABLES `tipoproduto` WRITE;
/*!40000 ALTER TABLE `tipoproduto` DISABLE KEYS */;
INSERT INTO `tipoproduto` VALUES (1,'Pizza'),(2,'Sanduiche'),(3,'Refrigerante'),(4,'Cerveja'),(5,'Strogonoff');
/*!40000 ALTER TABLE `tipoproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `codUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `uNome` varchar(60) NOT NULL,
  `uFuncao` char(3) NOT NULL,
  `uEmail` varchar(45) DEFAULT NULL,
  `uTelefone` varchar(20) DEFAULT NULL,
  `uLogin` varchar(8) NOT NULL,
  `uSenha` varchar(8) NOT NULL,
  `uStatus` bit(1) NOT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Administrador','adm','adm@adm.com.br','37 99090-0990','admin','admin',''),(2,'Testev','adm','teste@teste','37 9 8892-9009','1','1',''),(55,'Entregador','ent','adfg','adgf','ente','1',''),(56,'eu','ate','hh','hbk','jj','jj','');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-18 16:51:36
