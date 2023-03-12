create database e_commerce;

use e_commerce;

create table if not exists user(
	userId int(11) unsigned not null auto_increment,
    name varchar(50) unique not null,
    balance DECIMAL(65,30) not null,
    primary key(userId),
	index userName(name)
)ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


create table if not exists bill(
	billId int(11) unsigned not null auto_increment,
	userId int(11) unsigned not null,
    transaction DECIMAL(65,30) not null,
	note varchar(500),
    primary key(billId),
	foreign key(userId) REFERENCES user(userId),
	index userId(userId)
)ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

