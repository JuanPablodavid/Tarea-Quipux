SELECT DISTINCT idEstudiante, identificacion, nombres, apellidos, edad, email, activo
FROM Estudiantes 
WHERE activo = "S" AND email LIKE "%@gmail.com";

SELECT  idEstudiante, identificacion, nombres, apellidos, edad, email, activo
FROM Estudiantes 
WHERE activo = "N" AND edad >18 and Estudiantes.identificacion LIKE"1%";

SELECT DISTINCT a.idEstudiante, a.identificacion, a.nombres, a.apellidos, a.edad, a.email, a.activo
FROM Estudiantes a
JOIN MateriasEstudiantes c ON a.idEstudiante = c.idEstudiante
JOIN Materias b ON b.idMateria = c.idMateria
WHERE a.activo = "S" AND b.activo = "S";