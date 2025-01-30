const express = require('express');
const app = express();
const port = 4200;

// Ruta principal para el puerto 4200
app.get('/', (req, res) => {
  res.send('Gasolinera');
});

// Escucha en el puerto 4200
app.listen(port, () => {
  console.log(`Servidor ejecutándose en http://localhost:${port}/`);
});



