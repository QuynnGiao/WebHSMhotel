CREATE TABLE QLusers (
  usid int IDENTITY (1,1) primary key,
  username varchar(50) unique not null,
  passwork varchar(50) not null,
  email varchar(50) not null,
  urole int
)
CREATE TABLE Employees (
  eid int IDENTITY (1,1) primary key,
  urlimage varchar(255),
  ename varchar(50) not null,
  birthofday date,
  position varchar(50),
  gender varchar(50),
  eaddress text not null,
  sdt varchar(10) not null,
  cccd varchar(12) unique not null,
  salary decimal(18, 2) not null,
  usid int not null FOREIGN KEY REFERENCES QLusers(usid)
)
CREATE TABLE Customer (
  cid int IDENTITY (1,1) primary key,
  urlimage varchar(255),
  cname varchar(50) not null,
  birthofday date,
  cccd varchar(12) unique not null,
  sdt varchar(10) not null,
  gender varchar(50),
  caddress text not null,
  country varchar(50),
  usid int not null FOREIGN KEY REFERENCES QLusers(usid)
)
CREATE TABLE RoomType (
	rtid int IDENTITY (1,1) primary key,
	urlimage varchar(255) not null,
	roomType varchar(50) not null,
)
CREATE TABLE Room (
	rid int primary key,
	urlimage1 varchar(255) not null,
	urlimage2 varchar(255) not null,
	urlimage3 varchar(255) not null,
	rtid int not null FOREIGN KEY REFERENCES RoomType(rtid),
	peopleNumber int not null,
	rankofRoom varchar(50),
	rstatus varchar(50) not null,
	bedNumber int not null,	
	priceRoom decimal(18, 2) not null,
	describle text
)
CREATE TABLE Voucher(
  vid int primary key,
  urlimage varchar(255),
  vname varchar(50),
  describle text,
  discout int
)
CREATE TABLE Bill(
	phid int IDENTITY (1,1) primary key,
	cid int FOREIGN KEY REFERENCES Customer(cid),
	vid int FOREIGN KEY REFERENCES Voucher(vid),
	datePay datetime,
	totalmoney decimal(18, 2),
	bstatus varchar(50)
	)
CREATE TABLE BookRoom (
	phid int not null FOREIGN KEY REFERENCES Bill(phid),
	rid int not null FOREIGN KEY REFERENCES Room(rid),
	datecheckin date not null,
	datecheckout date not null,
	primary key (phid, rid)
)
CREATE TABLE ServiceType(
  stid int IDENTITY (1,1) primary key,
  urlimage varchar(255),
  stname varchar(50) not null
)
CREATE TABLE Services(
  srid int IDENTITY (1,1) primary key,
  urlimage varchar(255),
  sname varchar(50) not null,
  stid int not null FOREIGN KEY REFERENCES ServiceType(stid),
  srstatus varchar(50) not null,
  price decimal(18, 2) not null,
  describle text
)
CREATE TABLE UseService(
  phid int not null FOREIGN KEY REFERENCES Bill(phid),
  srid int not null FOREIGN KEY REFERENCES Services(srid),
  quantity int,
  price decimal(18, 2),
  primary key (phid, srid)
)
---------------------------------------------------
select * from QLusers
select * from Employees
select * from Customer
select * from RoomType
select * from Room
select * from BookRoom
select * from ServiceType
select * from Services
select * from UseService
select * from Voucher
select * from Bill 

select r.rid,r.urlimage1, rt.roomType,r.peopleNumber,r.rankofRoom,r.bedNumber,r.priceRoom,r.describle from Room as r INNER JOIN RoomType as rt on r.rtid=rt.rtid where rstatus = 'Available'

select r.rid,r.urlimage1, rt.roomType,r.peopleNumber,r.rankofRoom,r.bedNumber,r.priceRoom,r.describle from Room as r INNER JOIN RoomType as rt on r.rtid=rt.rtid where rstatus = 'Available' and r.rtid = 6

select r.urlimage1,r.urlimage2,r.urlimage3, rt.roomType,r.peopleNumber,r.rankofRoom,r.bedNumber,r.priceRoom,r.describle from Room as r INNER JOIN RoomType as rt on r.rtid=rt.rtid where rstatus = 'Available' and r.rid = 1

select s.srid,s.urlimage,s.sname,st.stid,s.price,s.describle from Services as s INNER JOIN ServiceType as st on s.stid = st.stid  where srstatus = 'Available' and s.stid =4

select srid,urlimage,sname,stid,price,describle from Services where srstatus = 'Available'

select * from Voucher where vid = 992
-----------------------------------------------------
INSERT INTO QLusers VALUES('huy123','12342314','huy@gmail.com',2)
INSERT INTO QLusers VALUES('admin','12345678','admin@gmail.com',1)
INSERT INTO QLusers VALUES('hieu456','12345678','hieu456@gmail.com',0)
INSERT INTO QLusers VALUES('kim456','12345678','kim@gmail.com',0)
INSERT INTO QLusers VALUES('Minh5343','12345678','minh@gmail.com',0)
INSERT INTO QLusers VALUES('Nguyen5632','12345678','nguyen678@gmail.com',0)

INSERT INTO Employees VALUES('','huy','2002-02-12','Manager','Male','45 Nguyen Cong Tru','231512412','898915478',2000,1)
INSERT INTO Employees VALUES('','kieu','2002-04-24','Administration','Female','225 Nguyen Cong Tru','098825412','89090898',3000,3)
INSERT INTO Employees VALUES('','bao','2002-02-16','Receptionist ','Male','115 Nguyen Cong Tru','0987572748','8921314515',1000,2)

INSERT INTO Customer VALUES('','bac','2001-06-12','758738783','08317287','Male','145 Nguyen Van Linh','Viet Nam',4)
INSERT INTO Customer VALUES('','trung','2001-07-14','759087907','074171812','Male','225 Nguyen Van Linh','Trung Quoc',5)
INSERT INTO Customer VALUES('','nam','2002-08-18','7512312312','063126565','Male','45 Nguyen Van Linh','Thai Lan',6)

INSERT INTO RoomType VALUES('tr1.jpg','Junior Suite')
INSERT INTO RoomType VALUES('tr2.jpg','Family Room')
INSERT INTO RoomType VALUES('tr3.jpg','Double Room')
INSERT INTO RoomType VALUES('tr4.jpg','Deluxe Room')
INSERT INTO RoomType VALUES('tr5.jpg','Superior Room')
INSERT INTO RoomType VALUES('tr6.jpg','Single Room')

INSERT INTO Room VALUES('101','bed1.jpeg','bed10.jpeg','bed11.jpeg',1,6,'VIP','1',3,300,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('104','bed2.jpg','bed9.jpg','bed12.jpg',4,3,'NORMAL','1',3,150,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('105','bed3.jpg','bed8.jpg','bed13.jpg',5,2,'VIP','1',2,200,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('107','bed4.jpg','bed7.jpg','bed14.jpg',5,2,'NORMAL','1',3,100,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('109','bed5.jpg','bed6.jpg','bed15.jpg',2,2,'VIP','1',1,250,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')

INSERT INTO Room VALUES('110','bed6.jpg','bed5.jpg','bed16.jpg',1,2,'NORMAL','1',4,100,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('122','bed7.jpg','bed4.jpg','bed17.jpg',3,4,'VIP','1',2,250,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('204','bed8.jpg','bed3.jpg','bed18.jpg',2,5,'NORMAL','1',1,100,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('208','bed9.jpg','bed2.jpg','bed19.jpg',4,3,'VIP','1',3,250,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')
INSERT INTO Room VALUES('140','bed10.jpeg','bed1.jpeg','bed20.jpg',6,4,'VIP','1',2,250,'Hotel non lorem ac erat suscipit bibendum nulla facilisi.')


INSERT INTO BookRoom VALUES(1,1,2,1,GETDATE(),'2022-06-28','2022-06-29','')

INSERT INTO ServiceType VALUES('ts1.jpeg','Food')
INSERT INTO ServiceType VALUES('ts2.jpeg','Drink')
INSERT INTO ServiceType VALUES('ts3.jpeg','Room Service')
INSERT INTO ServiceType VALUES('ts4.jpeg','Other')

INSERT INTO Services VALUES('MozzarellaDippers.jpg','Mozzarella Dippers',1,'1',27,'Fried mozzarella sticks, marinara sauce')
INSERT INTO Services VALUES('OnionRings.jpg','Onion Rings',1,'1',32,'Fried onion rings, smoked aioli')
INSERT INTO Services VALUES('BuffaloWings.jpg','Buffalo Wings',1,'1',37,'Spicy chicken wings, blue cheese sauce, carrot, celery')
INSERT INTO Services VALUES('ChilliConCarne.jpg','Chilli Con Carne',1,'1',32,'Spicy ground beef, bacon, kidney beans')

INSERT INTO Services VALUES('Wine.jpg','Wine',2,'1',27,'An alcoholic beverage fermented from grapes')
INSERT INTO Services VALUES('Cocktail.jpg','Cocktail',2,'1',32,'An alcoholic mixed drink, which is a combination of spirits')
INSERT INTO Services VALUES('Gin.jpg','Gin',2,'1',52,'A type of spirit distilled from barley as a raw material')
INSERT INTO Services VALUES('Whisky.jpg','Whisky',2,'1',37,'An alcoholic beverage produced from grains by fermentation and distillation')

INSERT INTO Services VALUES('Laundry.jpg','Laundry and ironing service',3,'1',47,'Help customers wash dirty clothes')
INSERT INTO Services VALUES('Spa.jpg','Spa Services',3,'1',37,'Take care of your beauty, health and spirit')
INSERT INTO Services VALUES('Fitness.jpg','Fitness centre',4,'1',20,'Take care of your health')
INSERT INTO Services VALUES('Golf.jpg','Golf course and tennis court',4,'1',37,'Maintain audience interest through sports')

INSERT INTO UseService VALUES(1,1,1,2)

INSERT INTO Voucher VALUES(1002,'welcome.jpg','Welcome','Welcome to HSM Hotel',0)
INSERT INTO Voucher VALUES(9508,'2.jpg','Women Day','Big discount for women',15)
INSERT INTO Voucher VALUES(3912,'3.jpeg','2 Nights Stay','two-night five-star hotel',25)
INSERT INTO Voucher VALUES(1000,'1.jpg','Couple','Valentine Day',20)

INSERT INTO Bill VALUES(1,1,1,1,1,1,GETDATE(),150.67,'Pending')
INSERT INTO Bill VALUES(2,1,1,3,2,1,GETDATE(),160,'Paid')

CREATE TRIGGER UpStatusR ON BookRoom AFTER INSERT AS
BEGIN
	UPDATE Room
	SET rstatus = 0
	FROM Room
	JOIN inserted on Room.rid = inserted.rid
END
GO

CREATE TRIGGER UpStatusRAfterDe ON BookRoom AFTER DELETE AS
BEGIN
	UPDATE Room
	SET rstatus = 1
	FROM Room
	JOIN deleted on Room.rid = deleted.rid
END
GO
----delete phid of bookroom,useservice,bill
Begin Try
	Begin Tran

	Declare @phidtoDelete int = 11

	DELETE FROM BookRoom WHERE phid= @phidtoDelete
	DELETE FROM UseService WHERE phid= @phidtoDelete
	
	DELETE FROM Bill WHERE phid= @phidtoDelete

	Commit Tran
End Try

Begin Catch
	Rollback Tran
End Catch