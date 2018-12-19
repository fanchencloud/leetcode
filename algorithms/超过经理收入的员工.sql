use demo;
drop table if exists `Employee`;
create table `Employee`
(
  `Id`        int primary key auto_increment,
  `Name`      varchar(200),
  `Salary`    double,
  `ManagerId` int default null
) charset = utf8;
# 添加数据
insert into Employee (Id, Name, Salary, ManagerId)
values (1, 'Joe', 70000, 3);
insert into Employee (Id, Name, Salary, ManagerId)
values (2, 'Henry', 80000, 4);
insert into Employee (Id, Name, Salary, ManagerId)
values (3, 'Sam', 60000, null);
insert into Employee(ID, NAME, SALARY, MANAGERID)
values (4, 'Max', 90000, NULL);
# 查询员工的经理是谁
select a.Name Name,b.Name Manager
from Employee a
       left join Employee b on b.Id = a.ManagerId;
# 查询获取收入超过他们经理的员工的姓名
select Name Employee
from Employee a
where Salary > (select Salary from Employee b where b.Id = a.ManagerId);