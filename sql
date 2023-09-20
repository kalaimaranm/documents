select table_name from information_schema.tables where table_type='BASE TABLE' and table_schema=database();  - to show the tables in the database
select id from busReservation union select name from prize; - conflict the data 
select * from busReservation where id=10508 or 1=1; -  always true if where 10504 is not exists in table - boolean base attack



this is incompatible with sql_mode=only_full_group_by - solution is 

Adding only one mode to sql_mode without removing existing ones:

SET sql_mode=(SELECT CONCAT(@@sql_mode,',<mode_to_add>'));
Removing only a specific mode from sql_mode without removing others:

SET sql_mode=(SELECT REPLACE(@@sql_mode,'<mode_to_remove>',''));
In your case, if you want to remove only ONLY_FULL_GROUP_BY mode, then use below command:

SET sql_mode=(SELECT REPLACE(@@sql_mode, 'ONLY_FULL_GROUP_BY', ''));

