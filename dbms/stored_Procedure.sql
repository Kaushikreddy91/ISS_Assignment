CREATE DEFINER=`root`@`localhost` PROCEDURE `get_info`(in age int)
BEGIN
Select * from personal_info where personal_info.age>age;
END