# Write your MySQL query statement below
update salary set sex = if(sex = 'm','f','m');
-- UPDATE salary SET sex  = (CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END)