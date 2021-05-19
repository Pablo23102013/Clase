--Procediments sense paràmetres emprant cursors

--1- Desenvolupeu un procediment anomenat mostrar_alta_emp, que mostre el cognom del treballador, de què treballa  i la data d'alta, ordenats per data d'alta en l'empresa (primer els més veterans).
CREATE OR REPLACE Procedure mostrar_alta_emp()
LANGUAGE PLPGSQL
AS
$$
DECLARE
empleado record;
cursor1 CURSOR FOR SELECT * FROM emp ORDER BY hiredate; 

BEGIN

for empleado in cursor1
LOOP
	--exit when not found;,lo hace automatico
	raise notice 'El empleado %,y trabaja de % y entro a trabajar %',empleado.empname,empleado.job,empleado.hiredate;
	--return  cursor1;,lo hace automatico
end LOOP;
END;
$$

Call mostar_alta_emp();
--2- Codifiqueu un procediment anomenat mostrar_info_dep que mostre el nom de cada departament, la seua ubicació i quants empleats te.
CREATE OR REPLACE Procedure mostrar_info_dep()
LANGUAGE PLPGSQL
AS
$$
DECLARE
empleado record;
cursor1 CURSOR FOR SELECT * FROM emp as a inner join dept as b on a.deptno= b.deptno; 

BEGIN

for empleado in cursor1
LOOP
	--exit when not found;,lo hace automatico
	raise notice 'El empleado %,y trabaja de % y entro a trabajar %',empleado.empname,empleado.job,empleado.hiredate;
	--return  cursor1;,lo hace automatico
end LOOP;
END;
$$

--3- Escriviu un programa anomenat emp_5max_sal que visualitze el codi, el cognom, l'ofici i el salari dels 5 empleats que més sou guanyen.

--4- Desenvolupeu un procediment anomenat pressupost_x_dep, que mostre per cada departament el nombre d'empleats del departament i la suma dels salaris del departament.

--Procediments amb paràmetres emprant cursors

--5- Escriviu un procediment anomenat empleats_x_cognom, que reba una cadena i visualitze el codi de tots els  treballadors el cognom dels quals contenen la cadena especificada. El procediment també ha de mostrar quants empleats tenen coincidència entre el cognom i la cadena passada per paràmetre.

--6- Codifiqueu un procediment anomenat empleats_x_ubicacio, que reba el nom d'una ubicació per paràmetre i visualitze el cognom dels treballadors que pertanyen a un departament que es troba en eixa ubicació.