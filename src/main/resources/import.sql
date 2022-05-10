insert into Pacientes (primernombre, segundonombre, primerapellido, segundoapellido, edad) values ('Maricela ', 'Lucia',' Marin','Gudiel', 20)
insert into Pacientes (primernombre, segundonombre, primerapellido, segundoapellido, edad) values ('Juan ', 'Estuardo','Ordoñez','Lima', 18)
insert into Pacientes (primernombre, segundonombre, primerapellido, segundoapellido, edad) values ('Ramiro ', 'Daniel','Arana','Martinez', 35)
insert into Pacientes (primernombre, segundonombre, primerapellido, segundoapellido, edad) values ('Evaluna ', 'Macali','Arana','montaner', 30)

insert into Polizas (idcliente, estado, fechainicio, fechafin) values ( 1, 'ACEPTADO', '12/05/2020','12/05/2030')
insert into Polizas (idcliente, estado, fechainicio, fechafin) values ( 2, 'CANCELADA', '12/12/2019','12/06/2025')
insert into Polizas (idcliente, estado, fechainicio, fechafin) values ( 3, 'PENDIENTE', '01/04/2018','01/04/2028')


insert into Cita(fechacita, hora, poliza, estado,observaciones) values ('15/05/2022 ', '12:00 pm', 1 , 'ACEPTADO ',' NO HAY OBSERVACIONES')
insert into Cita(fechacita, hora, poliza, estado,observaciones) values ('01/01/2023 ', '10:00 am', 2 , 'CANCELADA ',' Sudoración de manos y pies')
insert into Cita(fechacita, hora, poliza, estado,observaciones) values ('12/04/2022 ', '3:00 pm', 3 , 'PENDIENTE',' NO HAY OBSERVACIONES')