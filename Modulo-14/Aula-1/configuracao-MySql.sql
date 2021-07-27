CREATE USER IF NOT EXISTS 'nml_app_user1'@'localhost'
IDENTIFIED BY 'ml_app_user1';

GRANT DELETE, INSERT, UPDATE, SELECT, UPDATE
ON ml_app_consultorio.*
TO 'nml_app_user1'@'localhost';

--mysql> CREATE DATABASE ml_app_1_bd1;
--ERROR 1044 (42000): Access denied for user 'nml_app_user1'@'localhost' to database 'ml_app_1_bd1'

--
--

CREATE USER IF NOT EXISTS 'nml_app_user2'@'localhost'
IDENTIFIED BY 'ml_app_user2';

GRANT ALL PRIVILEGES
ON ml_app_consultorio.*
TO 'nml_app_user2'@'localhost';

--mysql> USE ml_app_consultorio;
--Database changed
--mysql> 
--mysql> CREATE TABLE `teste` (
--    ->   `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
--    ->   PRIMARY KEY (`id`)
--    -> );
--Query OK, 0 rows affected, 1 warning (0,01 sec)


CREATE USER IF NOT EXISTS 'nml_app_user3'@'localhost'
IDENTIFIED BY 'ml_app_user3';

GRANT SELECT
ON ml_app_consultorio.*
TO 'nml_app_user3'@'localhost';

--mysql> USE ml_app_consultorio;
--Reading table information for completion of table and column names
--You can turn off this feature to get a quicker startup with -A
--
--Database changed
--mysql> 
--mysql> SELECT * FROM teste;
--Empty set (0,00 sec)