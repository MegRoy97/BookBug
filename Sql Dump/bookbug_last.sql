-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.62 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for bookbug1
CREATE DATABASE IF NOT EXISTS `bookbug1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bookbug1`;

-- Dumping structure for table bookbug1.cart
CREATE TABLE IF NOT EXISTS `cart` (
  `UserId` varchar(50) NOT NULL,
  `ProductId` varchar(50) NOT NULL,
  `Quantity` int(10) NOT NULL,
  KEY `UserId` (`UserId`),
  KEY `ProductId` (`ProductId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookbug1.cart: ~2 rows (approximately)
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
REPLACE INTO `cart` (`UserId`, `ProductId`, `Quantity`) VALUES
	('avisome55555@gmail.com', 'p005', 6),
	('avisome55555@gmail.com', 'p002', 4);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;

-- Dumping structure for table bookbug1.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `OrderId` bigint(20) NOT NULL AUTO_INCREMENT,
  `UserId` varchar(50) NOT NULL,
  `ProductId` varchar(75) NOT NULL,
  `DateOfOrder` date NOT NULL,
  `Quantity` tinyint(4) NOT NULL,
  `TimeOfOrder` time NOT NULL,
  PRIMARY KEY (`OrderId`)
) ENGINE=InnoDB AUTO_INCREMENT=1000025 DEFAULT CHARSET=latin1;

-- Dumping data for table bookbug1.orders: ~9 rows (approximately)
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
REPLACE INTO `orders` (`OrderId`, `UserId`, `ProductId`, `DateOfOrder`, `Quantity`, `TimeOfOrder`) VALUES
	(1000000, 'avisome55555@gmail.com', 'p001', '2019-05-17', 2, '20:42:36'),
	(1000001, 'avisome55555@gmail.com', 'p004', '2019-05-17', 1, '20:43:16'),
	(1000002, 'avisome55555@gmail.com', 'p005', '2019-05-17', 1, '20:43:16'),
	(1000019, 'avisome5@gmail.com', 'p002', '2019-05-19', 3, '12:46:52'),
	(1000020, 'avisome5@gmail.com', 'p008', '2019-05-19', 4, '12:46:52'),
	(1000021, 'avisome5@gmail.com', 'p009', '2019-05-19', 1, '12:46:52'),
	(1000022, 'avisome5@gmail.com', 'p002', '2019-05-19', 4, '15:23:30'),
	(1000023, 'avisome5@gmail.com', 'p004', '2019-05-19', 3, '15:23:30'),
	(1000024, 'bhargab@gmail.com', 'p001', '2019-07-19', 3, '12:46:54');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

-- Dumping structure for table bookbug1.products
CREATE TABLE IF NOT EXISTS `products` (
  `ProductId` varchar(50) NOT NULL,
  `ProductName` varchar(50) NOT NULL,
  `ProductPrice` varchar(50) NOT NULL,
  `ProductAuthor` varchar(50) NOT NULL,
  `ProductPages` int(11) NOT NULL,
  `ProductPub` varchar(50) NOT NULL,
  `ProductDesc` varchar(1000) NOT NULL,
  `ProductCategory` varchar(50) NOT NULL,
  `ProductImage` varchar(50) NOT NULL,
  PRIMARY KEY (`ProductId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookbug1.products: ~8 rows (approximately)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
REPLACE INTO `products` (`ProductId`, `ProductName`, `ProductPrice`, `ProductAuthor`, `ProductPages`, `ProductPub`, `ProductDesc`, `ProductCategory`, `ProductImage`) VALUES
	('p001', 'Frankenstein\r', '1183\r', 'Mary Shelley\r', 358, 'Createspace\r', 'Frankenstein is written in the form of a frame story that starts with Captain Robert Walton writing letters to his sister. It takes place at an unspecified time in the 18th century, as the letters\' dates are given as "17?". In the story following the letters by Walton, the readers find that Victor Frankenstein creates a monster that brings tragedy to his life. Captain Walton\'s introductory frame narrative The novel Frankenstein is written in epistolary form, documenting a fictional correspondence between Captain Robert Walton and his sister, Margaret Walton \r', 'Horror', 'frankenstein.jpg'),
	('p002', 'Dracular\r', '1354\r', 'Bram Stoker\r', 496, 'Createspace Independent Publishing Platform\r', 'Dracula is an 1897 Gothic horror novel by Irish author Bram Stoker. It introduced the character of Count Dracula and established many conventions of subsequent vampire fantasy. The novel tells the story of Dracula\'s attempt to move from Transylvania to England so that he may find new blood and spread the undead curse, and of the battle between Dracula and a small group of men and a woman led by Professor Abraham Van Helsing. Dracula has been assigned to many literary genres including vampire literature, horror fiction, the gothic novel, and invasion literature. The novel has spawned numerous theatrical, film, and television interpretations.\r', 'Horror\r', 'Dracula.jpeg'),
	('p003', 'The Haunting of Hill House\r', '499\r', 'Shirley Jackson\r', 256, 'Penguin Classics\r', 'THE INSPIRATION FOR THE NEW NETFLIX SERIES DEBUTING THIS HALLOWE\'EN The best-known of Shirley Jackson\'s novels and a major inspiration for writers like Neil Gaiman and Stephen King, The Haunting of Hill House is a chilling story of the power of fear. \'Shirley Jackson\'s stories are among the most terrifying ever written\' Donna Tartt, author of The Goldfinch and The Secret History Four seekers have arrived at the rambling old pile known as Hill House: Dr. Montague, an occult scholar looking for solid evidence of psychic phenomena; Theodora, his lovely assistant; Luke, the future inheritor of the estate; and Eleanor, a friendless, fragile young woman with a dark past. As they begin to cope with horrifying occurrences beyond their control or understanding, they cannot possibly know what lies ahead.\r', 'Horror\r', 'Hill_House.jpeg'),
	('p004', 'Clean Code\r', '750\r', ' Martin Robert C\r', 431, 'Pearson\r', 'A Handbook Of Agile Software Craftsman, the authors stress the fact that a bad code may have some chances at working. However, a code that is not clean does not work and can contribute hugely to the failure of an organization. The authors go further to say that the book can make one a good programmer but at the same time caution, that it is possible only if the user works on it. The book develops within its readers the habits of a skilled software craftsman. It has several codes and it challenges the readers to think about what could be wrong with each code. Not just this, it also challenges the readers to introspect their professional values and their commitment, when it comes to their craft.\r', 'Computer Programming\r', 'Clean_Code.jpeg'),
	('p005', 'The Pragmetic Programmer\r', '2502\r', 'Andrew Hunt and David Thomas\r', 950, 'Pearson\r', 'The Pragmatic Programmer: From Journeyman to Master is a book about software engineering by Andrew Hunt and David Thomas, published in October 1999, first in a series of books under the label The Pragmatic Bookshelf.\r', 'Computer Programming\r', 'Programmer.jpeg'),
	('p006', 'Becoming\r', '501\r', 'Obama Michelle\r', 500, 'Penguin Books Ltd\r', 'Becoming is a powerful, inspiring, and intimate memoir of Michelle Obama, the former First Lady of the United States. She is one of the most iconic women at present, and she is known for being an influential advocate of women?s rights. Her strong and graceful presence at the White House made her one of the most identifiable global figures. This book covers her childhood in Chicago, her journey through the early years, and becoming the first African American First Lady of the United States.\r', 'Biographical\r', 'Becoming.jpeg'),
	('p008', 'I Am Malala\r', '1005\r', 'Yousafzai Malala\r', 560, 'Little, Brown Books for Young Readers\r', 'The Story of the Girl Who Stood Up for Education and was Shot by the Taliban is an autobiographical book by Malala Yousafzai, co-written with Christina Lamb. It was published on 8 October 2013, by Weidenfeld & Nicolson in the UK and Little, Brown and Company in the US.\r', 'Biographical\r', 'Malala.jpeg'),
	('p009', 'The Diary Of A Young Girl\r', '455\r', 'Anne Frank\r', 450, 'Fingerprint Publishing\r', 'The Story of the Girl Who Stood Up for Education and was Shot by the Taliban is an autobiographical book by Malala Yousafzai, co-written with Christina Lamb. It was published on 8 October 2013, by Weidenfeld & Nicolson in the UK and Little, Brown and Company in the US.\r', 'Biographical\r', 'Diary.jpeg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Dumping structure for table bookbug1.user
CREATE TABLE IF NOT EXISTS `user` (
  `Name` varchar(50) NOT NULL,
  `MobileNumber` bigint(20) NOT NULL,
  `EmailId` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Pincode` bigint(20) NOT NULL,
  `UserType` varchar(50) NOT NULL,
  PRIMARY KEY (`EmailId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookbug1.user: ~7 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
REPLACE INTO `user` (`Name`, `MobileNumber`, `EmailId`, `Password`, `Gender`, `Address`, `Pincode`, `UserType`) VALUES
	('Test', 2525252525, 'avisome555555@gmail.com', 'Avirup@123', 'Male', 'KOlkata Patna', 700252, 'u'),
	('Avirup', 8240396404, 'avisome55555@gmail.com', 'Updatepass@1', 'Male', 'dhdh', 700115, 'u'),
	('Avirup', 8335065088, 'avisome5555@gmail.com', 'Avirup@1', 'Male', 'Kolkata', 700114, 'u'),
	('Avirup', 8335065088, 'avisome555@gmail.com', 'Avirup@1', 'Female', 'Sodepur', 700114, 'a'),
	('Avie', 8335065087, 'avisome55@gmail.com', 'Avi@1111', 'Male', 'khshkd', 700114, 'u'),
	('Avirup', 8335065088, 'avisome5@gmail.com', 'Avi@1111', 'Male', 'Sodepur', 700114, 'u'),
	('Bhargab Dutta', 5252536586, 'bhargab@gmail.com', 'kITTU@12', 'Female', '25', 700125, 'u');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
