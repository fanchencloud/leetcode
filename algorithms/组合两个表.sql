# 创建数据表
drop table if exists `Person`;
create table `Person`
(
  `PersonId`  int primary key,
  `FirstName` varchar(200),
  `LastName`  varchar(200)
) character set = utf8;
# 添加数据
INSERT INTO `demo`.`Person` (`PersonId`, `FirstName`, `LastName`)
VALUES (1, '张', '三');
INSERT INTO `demo`.`Person` (`PersonId`, `FirstName`, `LastName`)
VALUES (2, '李', '四');
INSERT INTO `demo`.`Person` (`PersonId`, `FirstName`, `LastName`)
VALUES (3, '王', '五');

drop table if exists `Address`;
create table `Address`
(
  `AddressId` int primary key,
  `PersonId`  int,
  `City`      varchar(200),
  `State`     varchar(200)
) character set = utf8;

INSERT INTO `demo`.`Address` (`AddressId`, `PersonId`, `City`, `State`)
VALUES (1, 2, '江西', '南货场');
INSERT INTO `demo`.`Address` (`AddressId`, `PersonId`, `City`, `State`)
VALUES (2, 1, '江西', '南货场2');
INSERT INTO `demo`.`Address` (`AddressId`, `PersonId`, `City`, `State`)
VALUES (3, 2, '江西', '南货场444');

use demo;

# 题目答案
select p.FirstName,p.LastName,a.City,a.State from Person p left join Address a on p.PersonId = a.PersonId order by p.PersonId;