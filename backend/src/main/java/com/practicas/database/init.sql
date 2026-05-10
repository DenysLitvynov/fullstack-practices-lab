-- Si la tabla ya existe, borra y recrea con SERIAL
DROP TABLE IF EXISTS Tarea;

CREATE TABLE Tarea (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    descripcion TEXT,
    fechaCreacion TIMESTAMP,
    completada BOOLEAN
);