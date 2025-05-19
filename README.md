# 52038

# Analizador Léxico, Sintáctico e Intérprete de Lenguaje "Libro"

Este proyecto permite realizar el análisis léxico, sintáctico y la ejecución de pseudocódigo utilizando ANTLR4 y JavaScript. El lenguaje aceptado está basado en definiciones simples de funciones con operaciones de entrada/salida, asignaciones y expresiones básicas.

Estructura del Proyecto

/analizador-final/

├── generated/ # Archivos generados por ANTLR (Lexer, Parser, Listener)

├── input.txt # Archivo de entrada con el código fuente a analizar

├── index.js # Script principal que ejecuta análisis e interpretación

├── Libro.g4 # Gramática ANTLR del lenguaje "Libro"

└── README.md # Este archivo

Requisitos

- Node.js (v16+)
- ANTLR 4 (instalado y configurado en el PATH)
- Un entorno de terminal o consola

El programa tambien genera:
1) La tabla de tokens léxicos

2) El árbol de análisis sintáctico

3) El resultado de ejecución (simulado en consola)

4) Código JavaScript generado a partir del pseudocódigo

Características
Soporte para:

Definición de funciones (funcion)

Entrada simulada (leer)

Salida por consola (escribir)

Asignación de variables (números, strings, identificadores)

## Para instalar el proyecto es necesario:
 
Clona este repositorio desde la terminal:
git clone 


Para ejecutar el programa es necesario escribir el siguiente codigo en el terimnal del visual studio code: node index.js

Ejemplo 1) Este ejemplo muestra entrada/salida, asignación y uso de variables.

funcion main() {
  escribir("Hola mundo");
  leer(nombre);
  escribir(nombre);
  x = 5;
  escribir(x);
}

![image](https://github.com/user-attachments/assets/1fbff711-8318-4184-9edc-e581a766e621)

Como se puede apreciar en la imagen, nos genera todos los puntos anteriores. Este ejemplo no contiene errores

Ejemplo 2) Este ejemplo nos muestra asignaciones de string y números, y su impresión.

funcion main() {
  nombre = "Juan";
  edad = 30;
  escribir(nombre);
  escribir(edad);
}

![image](https://github.com/user-attachments/assets/d9b9a162-c676-4b08-ada7-92971ddff1d4)

Este ejemplo no contiene errores

Ejemplo 3) Este ejemplo tiene un error sintáctico: falta punto y coma (;) al final de la asignación.

funcion main() {
  nombre = "Ana"
  escribir(nombre);
}

![image](https://github.com/user-attachments/assets/db596df2-c7c1-4ebd-9261-6e607a8f7b2f)

Como podemos ver en la imagen salta un error que dice que se encuentran errores durante el analisis.


Ejemplo 4) Este ejemplo presenta un error léxico/sintáctico: presentar no está definido como instrucción válida en la gramática.

funcion main() {
  presentar("Pedro");
}

![image](https://github.com/user-attachments/assets/8489e82c-ed82-4e49-8af3-2f3c38723285)

Lo mismo podemos decir en este ejemplo a la hora de encotrar el error, salta el mismo.


