insert into empleado (id, name, apellidos)
 select 1, 'Rocío', 'De la O' from dual where not exists (select 1 from empleado where id = 1);

insert into empleado (id, name, apellidos)
	select 2, 'Alberto', 'Del Monte' from dual where not exists (select 1 from empleado where id = 2);