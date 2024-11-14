SELECT idEstudiante, identificacion, nombres, apellidos, edad, email, activo
FROM Estudiantes 
WHERE activo = "S" AND email LIKE "%@gmail.com";